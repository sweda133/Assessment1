package com.assessment.LearnerCourses.learn.model;


import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import jakarta.persistence.Id;

@Entity
public class Learners {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int course_id;
    private String learner_first_name;
    private String learner_last_name;
    private String learner_email;
    private  String learner_password;
    private int learner_id;

    public Learners()
    {
        this.learner_id = 0;
        this.learner_first_name = "";
        this.learner_last_name = "";
        this.learner_email = "";
        this.learner_password = "";
        this.course_id = 0;
    }
    public Learners(int learner_id, String learner_first_name, String learner_last_name, String learner_email, String learner_password, int course_id) {
        this.learner_id = learner_id;
        this.learner_first_name = learner_first_name;
        this.learner_last_name = learner_last_name;
        this.learner_email = learner_email;
        this.learner_password = learner_password;
        this.course_id = course_id;
    }


    @Override
    public String toString() {
        return "Learners{" +
                "course_id=" + course_id +
                ", learner_first_name='" + learner_first_name + '\'' +
                ", learner_last_name='" + learner_last_name + '\'' +
                ", learner_email='" + learner_email + '\'' +
                ", learner_password='" + learner_password + '\'' +
                ", learner_id=" + learner_id +
                '}';
    }

    public int getLearner_id() {
        return learner_id;
    }

    public void setLearner_id(int learner_id) {
        this.learner_id = learner_id;
    }

    public String getLearner_first_name() {
        return learner_first_name;
    }

    public void setLearner_first_name(String learner_first_name) {
        this.learner_first_name = learner_first_name;
    }

    public String getLearner_last_name() {
        return learner_last_name;
    }

    public void setLearner_last_name(String learner_last_name) {
        this.learner_last_name = learner_last_name;
    }

    public String getLearner_email() {
        return learner_email;
    }

    public void setLearner_email(String learner_email) {
        this.learner_email = learner_email;
    }

    public String getLearner_password() {
        return learner_password;
    }

    public void setLearner_password(String learner_password) {
        this.learner_password = learner_password;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
}
