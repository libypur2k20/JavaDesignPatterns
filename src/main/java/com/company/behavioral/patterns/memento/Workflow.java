package com.company.behavioral.patterns.memento;

import java.util.LinkedList;
import java.util.stream.Stream;

public class Workflow {

    private LinkedList<String> steps;
    private String name;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<String>();
    }

    public Workflow(String name, String... steps){
        this(name);
        if (steps != null && steps.length > 0) {
            Stream.of(steps).forEach(s -> this.steps.add(s));
        }
    }

    public String[] getSteps() {
        return steps.toArray(new String[steps.size()]);
    }

    public String getName() {
        return name;
    }

    public void addStep(String step){
        this.steps.addLast(step);
    }

    public void removeStep(String step){
        this.steps.remove(step);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Workflow [name=");
        sb.append(this.name).append("]\nBEGIN");
        for(String step : steps) {
            sb.append(" -> ").append(step);
        }

        return sb.toString();
    }
}
