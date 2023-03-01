package com.assessment.LearnerCourses.course.repo;

import com.assessment.LearnerCourses.course.model.Courses;
//import com.course.Learner.course.model.Courses;
//import com.course.Learner.learn.model.Learners;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Crepo extends CrudRepository<Courses,Integer>
{
    public Courses save(Courses co);
    public List<Courses> findAll();
    //public Courses findById(int id);
    //public void deleteById(int id);
}
