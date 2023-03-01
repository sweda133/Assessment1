package com.assessment.LearnerCourses.learn.repo;


import com.assessment.LearnerCourses.learn.model.Learners;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface Trepo extends CrudRepository<Learners,Integer>
{
    public Learners save(Learners le);
    public List<Learners> findAll();
    public Learners findById(int id);
    public void deleteById(int id);
    public void deleteAll();
    public boolean existsById(int id);
    public long count();


}