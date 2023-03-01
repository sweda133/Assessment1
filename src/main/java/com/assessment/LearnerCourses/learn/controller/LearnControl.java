package com.assessment.LearnerCourses.learn.controller;


import com.assessment.LearnerCourses.course.model.Courses;
        import com.assessment.LearnerCourses.learn.model.Learners;
        import com.assessment.LearnerCourses.learn.service.Pservice;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/ls")
public class LearnControl
{
    public Pservice pservice;
    @Autowired
    public LearnControl(Pservice pservice) {
        this.pservice = pservice;
    }
    @RequestMapping(value = "/learn/save",method = RequestMethod.POST)
    public String savedLearners(@RequestBody Learners p)
    {
        return pservice.savedLearners(p);

    }
    @RequestMapping(value = "/learn",method = RequestMethod.GET)
    public List<Learners> findLearners()
    {
        return pservice.findLearners();
    }
    @RequestMapping(value = "/learn/find/{id}",method = RequestMethod.GET)
    public Learners getById(@PathVariable("id") int id)
    {
        return pservice.getLearnersById(id);
    }
    @RequestMapping(value = "/learn/delete/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable("id") int id)
    {
        return pservice.deleteLearnerById(id);
    }
    @RequestMapping(value = "/learn/delete",method = RequestMethod.DELETE)
    public String deleteAll()
    {
        return pservice.deleteAllLearners();
    }
    @RequestMapping(value = "/learn/exists/{id}",method = RequestMethod.GET)
    public boolean exists(@PathVariable("id") int id)
    {
        return pservice.LearnerExistence(id);
    }
    @RequestMapping(value = "/learn/count",method = RequestMethod.GET)
    public long cnt()
    {
        return pservice.countLearners();
    }
}