package com.org.test.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "Guardian_name")

        ),
        @AttributeOverride(

                name = "email",
                column = @Column(name = "Guardian_email")
        ),
        @AttributeOverride(
                name = "moble",
                column = @Column(name = "Guardian_mobile")
        )
})
public class Guardian {

    private String name;
    private String email;
    private String mobile;
}
