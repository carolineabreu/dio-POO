package com.dio.challenge.domain;

public class Subject extends Content {

    private int duration;

    @Override
    public double calculateXp() {
        return 0;
    }

    public Subject() {
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", duration=" + duration +
                '}';
    }
}
