package com.st.xray.schoolapi.controller;

import com.st.xray.schoolapi.model.Classroom;
import com.st.xray.schoolapi.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/classroom")
public class ClassroomController {

    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping(value = "/id/{id}")
    public Classroom getClassroomById(@PathVariable(value = "id", required = true, name = "id") Integer classroomId) {
        return classroomService.getClassroomById(classroomId);
    }

    @GetMapping(value = "/medium/{medium}")
    public List<Classroom> getClassroomByMedium(@PathVariable(value = "medium", required = true, name = "medium") String medium) {
        return classroomService.getClassroomByMedium(medium);
    }

    @GetMapping(value = "/all")
    public List<Classroom> getAllClassrooom() {
        return classroomService.getAllClassroom();
    }
}
