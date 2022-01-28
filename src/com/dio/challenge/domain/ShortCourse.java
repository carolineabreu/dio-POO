package com.dio.challenge.domain;

public class ShortCourse extends Content {
    private String subject;
    private int duration;

    @Override
    public double calculateXp() {
        return XP_DEFAULT + 10d;
    }

    public ShortCourse() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ShortCourse{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", subject='" + subject + '\'' +
                ", duration=" + duration +
                '}';
    }
}
