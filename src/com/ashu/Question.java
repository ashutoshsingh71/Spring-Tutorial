package com.ashu;

import java.util.Iterator;
import java.util.List;

public class Question {
    int id;
    String name;
    List<Answer> answers;

    public Question(int id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void display(){
        System.out.println("Question: " + this.name);
        System.out.println("Answers are: ");
        Iterator<Answer> iterator = answers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
