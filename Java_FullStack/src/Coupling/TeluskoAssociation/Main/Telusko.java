package Coupling.TeluskoAssociation.Main;

import Coupling.TeluskoAssociation.service.Icourse;

public class Telusko {

    private Icourse course;

    // param constructor
    public Telusko(Icourse course) {
        super();
        this.course = course;
    }

    // zero param constructor
    public Telusko() {
        super();
    }

    // setter
    public void setCourse(Icourse course) {
        this.course = course;
    }

    public Boolean buyTheCourse(Double amount) {
        return course.getTheCourse(amount);
    }
}
