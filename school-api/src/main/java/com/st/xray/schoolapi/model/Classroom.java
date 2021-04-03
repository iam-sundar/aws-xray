package com.st.xray.schoolapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Classroom {
    private Integer classroomId;
    private String medium;
    private Integer standard;
    private Integer classTeacherId;
    private List<Student> students;
}
