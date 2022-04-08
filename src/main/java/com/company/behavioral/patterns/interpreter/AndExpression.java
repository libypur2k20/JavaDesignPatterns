package com.company.behavioral.patterns.interpreter;

public class AndExpression implements PermissionExpression{

    private final PermissionExpression permission1;
    private final PermissionExpression permission2;

    public AndExpression(PermissionExpression permission1, PermissionExpression permission2) {
        this.permission1 = permission1;
        this.permission2 = permission2;
    }


    @Override
    public boolean interpret(User user) {
        return permission1.interpret(user) && permission2.interpret(user);
    }

    @Override
    public String toString() {
        return permission1 + " AND " + permission2;
    }
}
