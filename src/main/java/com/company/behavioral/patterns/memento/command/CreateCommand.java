package com.company.behavioral.patterns.memento.command;

import com.company.behavioral.patterns.memento.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand{

    private String name;

    public CreateCommand(WorkflowDesigner designer, String name) {
        super(designer);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = designer.getMemento();
        this.designer.createWorkflow(name);
    }
}
