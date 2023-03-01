package com.assessment.LearnerCourses.learn.service;


import com.assessment.LearnerCourses.course.model.Courses;
        import com.assessment.LearnerCourses.course.repo.Crepo;
        import com.assessment.LearnerCourses.learn.model.Learners;
        import com.assessment.LearnerCourses.learn.repo.Trepo;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class Pservice {
    public Trepo trepo;
    @Autowired
    public Pservice(Trepo trepo) {
        this.trepo = trepo;
    }

    public String savedLearners(Learners learners) {
        Learners lc = trepo.save(learners);
        return "Learnings:"+ lc;
    }

    public List<Learners> findLearners()
    {
        return trepo.findAll();
    }
    public Learners getLearnersById(int id)
    {
        return trepo.findById(id);
    }
    public String deleteLearnerById(int id)
    {
        trepo.deleteById(id);
        return "Item deleted with id:"+ (int)id;
    }
    public String deleteAllLearners()
    {
        trepo.deleteAll();
        return "all items deleted";
    }
    public boolean LearnerExistence(int id)
    {
        return trepo.existsById(id);
    }
    public long countLearners()
    {
        return trepo.count();
    }
}