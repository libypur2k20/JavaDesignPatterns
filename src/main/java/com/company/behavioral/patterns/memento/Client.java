package com.company.behavioral.patterns.memento;

import com.company.behavioral.patterns.memento.command.AddStepCommand;
import com.company.behavioral.patterns.memento.command.RemoveStepCommand;

public class Client {

    public static void main(String[] args){

        WorkflowDesigner designer = new WorkflowDesigner();
        designer.createWorkflow("My Workflow");
        AddStepCommand addCommand1 = new AddStepCommand(designer,"Yuoof");
        addCommand1.execute();
        AddStepCommand addCommand2 = new AddStepCommand(designer, "Riao");
        addCommand2.execute();
        designer.print();
        RemoveStepCommand removeStepCommand = new RemoveStepCommand(designer,"Riao");
        removeStepCommand.execute();
        designer.print();

    }
}
