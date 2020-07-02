package com.ssm.springboot06.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
    public class Stu implements Serializable {
        private Integer id;
        private String name;
        private String sex;
}
