package com.company.behavioral.patterns.interpreter;

// Abstract expression
public interface PermissionExpression {

    boolean interpret(User user);
}
