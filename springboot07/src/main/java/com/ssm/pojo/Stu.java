package com.ssm.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "Stu")
@Data
    public class Stu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
        private Integer id;
    @Column(name = "name")
        private String name;
    @Column(name = "sex")
        private String sex;
}
