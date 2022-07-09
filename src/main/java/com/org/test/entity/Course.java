package com.org.test.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Course {

    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"

    )
    private Long courseId;
    private String title;
    private Integer credit;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMeterial courseMeterial;
}
