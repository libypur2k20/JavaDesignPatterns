package com.company.behavioral.patterns.memento;

public class WorkflowDesigner {

    private Workflow workflow;

    public  void createWorkflow(String name){
        this.workflow = new Workflow(name);
    }

    public Workflow getWorkflow(){
        return this.workflow;
    }

    public Memento getMemento(){
        if (workflow == null){
            return new Memento();
        }
        else {
            return new Memento(workflow.getName(), workflow.getSteps());
        }
    }

    public void setMemento(Memento memento){
        if (memento.isEmpty()){
            this.workflow = null;
        }
        else{
            this.workflow = new Workflow(memento.getName(), memento.getSteps());
        }
    }

    public void addStep(String step){
        if (this.workflow != null){
            this.workflow.addStep(step);
        }
    }

    public void removeStep(String step){
        if (this.workflow != null){
            this.workflow.removeStep(step);
        }
    }

    public void print(){
        System.out.println((workflow != null ? workflow : "Workflow not set!"));
    }


    public class Memento{

        private String[] steps;
        private String name;


        private Memento(){

        }

        private Memento(String name, String[] steps){
            this.name = name;
            this.steps = steps;
        }

        private String[] getSteps(){
            return steps;
        }

        private String getName(){
            return name;
        }

        private boolean isEmpty(){
            return (steps == null && name == null);
        }
    }
}
