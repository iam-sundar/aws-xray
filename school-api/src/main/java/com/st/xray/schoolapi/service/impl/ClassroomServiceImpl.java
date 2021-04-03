package com.st.xray.schoolapi.service.impl;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.st.xray.schoolapi.model.Classroom;
import com.st.xray.schoolapi.model.Student;
import com.st.xray.schoolapi.service.ClassroomService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@XRayEnabled
public class ClassroomServiceImpl implements ClassroomService {

    private static List<Classroom> classrooms;
    private static List<Student> engStudents;
    private static List<Student> tamilStudents;

    static {
        engStudents = Arrays.asList(
                new Student(101, "Mithran", 5, 1, "English"),
                new Student(102, "Keerthana", 5, 1, "English"),
                new Student(103, "MaheshPandi", 5, 1, "English")
        );
        tamilStudents = Arrays.asList(
                new Student(104, "Sundar", 6, 2, "Tamil"),
                new Student(105, "Palani", 6, 2, "Tamil"),
                new Student(106, "Ganesan", 6, 2, "Tamil")
        );
        classrooms = Arrays.asList(
                new Classroom(301, "English", 1, 201, engStudents),
                new Classroom(302, "Tamil", 1, 202, tamilStudents)
        );
    }

    /**
     * @param classroomId
     * @return Classroom object
     * <p>
     * Get unique Classroom details by classroomId.
     */
    @Override
    public Classroom getClassroomById(Integer classroomId) {
        return classrooms
                .stream()
                .filter(classroom -> classroomId.equals(classroom.getClassroomId()))
                .findFirst()
                .get();
    }

    /**
     * @param medium
     * @return List of Classroom objects.
     * <p>
     * Get specified medium [English, Tamil] classroom details.
     */
    @Override
    public List<Classroom> getClassroomByMedium(String medium) {
        return classrooms
                .stream()
                .filter(classroom -> medium.equals(classroom.getMedium()))
                .collect(Collectors.toList());
    }

    /**
     * @return List of Classroom objects
     * <p>
     * Get all the classroom details.
     */
    @Override
    public List<Classroom> getAllClassroom() {
        return classrooms;
    }


}
