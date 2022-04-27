package com.company.behavioral.patterns.memento.command;

import com.company.behavioral.patterns.memento.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand{

    protected WorkflowDesigner designer;
    protected WorkflowDesigner.Memento memento;

    public AbstractWorkflowCommand(WorkflowDesigner designer){
        this.designer = designer;
    }

    @Override
    public void undo() {
        designer.setMemento(memento);
    }
}
