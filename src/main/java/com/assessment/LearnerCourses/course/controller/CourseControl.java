package com.assessment.LearnerCourses.course.controller;

import com.assessment.LearnerCourses.course.model.Courses;
import com.assessment.LearnerCourses.course.service.Cservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cs")
public class CourseControl {
    public Cservice cservice;
    @Autowired
    public CourseControl(Cservice cservice) {
        this.cservice = cservice;
    }
    @RequestMapping(value = "/course/save",method = RequestMethod.POST)
    public String savedCourses(@RequestBody Courses p)
    {
        return cservice.savedCourses(p);

    }
    @RequestMapping(value = "/course",method = RequestMethod.GET)
    public List<Courses> findCourses()
    {
        return cservice.findCourses();
    }


    @RequestMapping(value = "/course/find/{id}",method = RequestMethod.GET)
    public Optional<Courses> getById(@PathVariable("id") int id)
    {
        return cservice.getCoursesById(id);
    }
    @RequestMapping(value = "/course/delete/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable("id") int id)
    {
        return cservice.deleteCoursesById(id);
    }
    @RequestMapping(value = "/course/delete",method = RequestMethod.DELETE)
    public String deleteAll()
    {
        return cservice.deleteAllCourses();
    }
    @RequestMapping(value = "/course/exists/{id}",method = RequestMethod.GET)
    public boolean exists(@PathVariable("id") int id)
    {
        return cservice.CoursesExistence(id);
    }
    @RequestMapping(value = "/course/count",method = RequestMethod.GET)
    public long cnt()
    {
        return cservice.countCourses();
    }

}