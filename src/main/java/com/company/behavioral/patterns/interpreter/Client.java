package com.company.behavioral.patterns.interpreter;

public class Client {

    public static void main(String[] args) {

        User user = new User("libypur","ADMIN", "USER");
        Report report = new Report("report1","admin and not user");

        ExpressionBuilder expressionBuilder = new ExpressionBuilder();
        PermissionExpression exp = expressionBuilder.build(report);
        System.out.println(exp);

        boolean userHasAccess = exp.interpret(user);
        System.out.println("User '" + user.getUserName() + "' has access to report '" + report.getName() + "' ? " + userHasAccess);

    }
}
