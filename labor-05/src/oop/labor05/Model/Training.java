package oop.labor05.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Training {
    private Course course;
    private Date startDate;
    private Date endDate;
    private ArrayList<Student> enrolledStudents;

    public Training(Course course, Date startDate, Date endDate) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.enrolledStudents = new ArrayList<>();
    }

    public Course getCourse() {
        return course;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<Student> getEnrolledStudents(){
        return enrolledStudents;
    }

    public void enroll(Student student){
        if(!enrolledStudents.contains(student)){
            enrolledStudents.add(student);
        }
    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

}
