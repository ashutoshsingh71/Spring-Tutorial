package com.ashu;

public class Answer {
    int id;
    String value;
    int vote;
    String by;

    public Answer(){}

    public Answer(int id, String value, int vote, String by) {
        this.id = id;
        this.value = value;
        this.vote = vote;
        this.by = by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    @Override
    public String toString() {
        return this.value + " votes: " + this.vote + " by: " + this.by;
    }
}
