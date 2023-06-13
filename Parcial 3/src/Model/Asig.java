package Model;

import java.io.Serializable;

public class Asig implements Serializable {
    public int id;
    private String asig;
    private String teacher;
    private String classroom;
    private int numStud;

    public Asig(int id, String asig, String teacher, String classroom, int numStud) {
        this.id = id;
        this.asig = asig;
        this.teacher = teacher;
        this.classroom = classroom;
        this.numStud = numStud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsig() {
        return asig;
    }

    public void setAsig(String asig) {
        this.asig = asig;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getNumStud() {
        return numStud;
    }

    public void setNumStud(int numStud) {
        this.numStud = numStud;
    }

    @Override
    public String toString() {
        return "Asig -> " +
                "Id = " + id +
                ", Asig = " + asig + '\'' +
                ", Teacher = " + teacher + '\'' +
                ", Classroom = " + classroom + '\'' +
                ", Students Number = " + numStud +
                '}';
    }
}
