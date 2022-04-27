package com.company.behavioral.patterns.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
