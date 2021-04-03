package com.st.xray.schoolapi.model;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private Integer teacherId;
    private String name;
    private Integer age;
    private String degree;
    private List<String> specializedSubjects;
}
