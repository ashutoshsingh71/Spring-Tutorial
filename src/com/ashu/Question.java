package com.ashu;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
    int id;
    String name;
    Map<String,String> answers;

    public Question(int id, String name, Map<String,String> answers) {
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

    public Map<String,String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String,String> answers) {
        this.answers = answers;
    }

    public void display(){
        System.out.println("Question: " + this.name);
        System.out.println("Answers are: ");
        Set<Map.Entry<String,String>> entry = answers.entrySet();
        Iterator<Map.Entry<String,String>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entrySet = iterator.next();
            System.out.println("Answer: " + entrySet.getKey() + " " + "Posted By: " + entrySet.getValue());
        }
    }
}
