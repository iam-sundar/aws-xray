package com.st.xray.schoolapi.service;

import com.st.xray.schoolapi.model.Classroom;

import java.util.List;

public interface ClassroomService {

    public Classroom getClassroomById(Integer classroomId);

    public List<Classroom> getClassroomByMedium(String medium);

    public List<Classroom> getAllClassroom();
}
