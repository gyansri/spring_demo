package com.org.test.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor

public class VerificationToken {

    private static final int EXPIRATION_TIME=10;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private Date expirationTime;
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_VERIFY_TOKEN")
    )
    private User user;

    public VerificationToken(User user,String token){
        super();
        this.user=user;
        this.token=token;
        this.expirationTime=calculteExpirationDate(EXPIRATION_TIME);
    }

    public VerificationToken(String token){
        super();
        this.token=token;
         this.expirationTime=calculteExpirationDate(EXPIRATION_TIME);
    }

    private Date calculteExpirationDate(int EXPIRATION_TIME) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        calendar.add(Calendar.MINUTE,EXPIRATION_TIME);

        return new Date(calendar.getTime().getTime());
    }
}
