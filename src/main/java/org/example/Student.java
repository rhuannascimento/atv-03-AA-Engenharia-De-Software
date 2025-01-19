package org.example;

public class Student {

    private StudentState state;

    public Student() {
        this.state = new StudentStateMatriculado();
    }

    public void setState(StudentState state) {
        this.state = state;
    }

    public boolean matricular() {
        return state.matricular();
    }

    public boolean formar() {
        return state.formar();
    }

    public boolean trancar() {
        return state.trancar();
    }

    public boolean jubilar() {
        return state.jubilar();
    }

    public boolean evadir() {
        return state.evadir();
    }

    public boolean transferir() {
        return state.transferir();
    }

    public StudentState getState() {
        return this.state;
    }
}