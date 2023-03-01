package com.assessment.LearnerCourses.course.service;

import com.assessment.LearnerCourses.course.model.Courses;
import com.assessment.LearnerCourses.course.repo.Crepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Cservice {
    public Crepo crepo;

    @Autowired
    public Cservice(Crepo crepo) {
        this.crepo = crepo;
    }

    public String savedCourses(Courses courses) {
        Courses sc = crepo.save(courses);
        return "Courses:"+ sc;
    }

    public List<Courses> findCourses()
    {
        return crepo.findAll();
    }
    public Optional<Courses> getCoursesById(int id)
    {
        return crepo.findById(id);
    }
    public String deleteCoursesById(int id)
    {
        crepo.deleteById(id);
        return "Item deleted with id:"+ (int)id;
    }
    public String deleteAllCourses()
    {
        crepo.deleteAll();
        return "all items deleted";
    }
    public boolean CoursesExistence(int id)
    {
        return crepo.existsById(id);
    }
    public long countCourses()
    {
        return crepo.count();
    }
}