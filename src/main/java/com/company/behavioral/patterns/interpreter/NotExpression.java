package com.company.behavioral.patterns.interpreter;

public class NotExpression implements PermissionExpression{

    private final PermissionExpression expression1;

    public NotExpression(PermissionExpression expression1) {
        this.expression1 = expression1;
    }

    @Override
    public boolean interpret(User user) {
        return !(expression1.interpret(user));
    }

    @Override
    public String toString() {
        return "NOT " + expression1;
    }
}
