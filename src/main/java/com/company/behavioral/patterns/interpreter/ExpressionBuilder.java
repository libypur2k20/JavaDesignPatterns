package com.company.behavioral.patterns.interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

// Parses and builds abstract syntax tree
public class ExpressionBuilder {

    private Stack<PermissionExpression> permissions = new Stack<>();
    private Stack<String> operators = new Stack<>();


    public PermissionExpression build(Report report){

        parse(report.getPermission());
        buildExpressions();
        if(permissions.size() > 1 || !(operators.isEmpty())){
            System.out.println("ERROR!");
        }
        return permissions.pop();
    }


    private void parse(String permission) {
        StringTokenizer st = new StringTokenizer(permission.toLowerCase());
        while(st.hasMoreTokens()){
            String token;
            switch((token = st.nextToken())){
                case "and":
                case "or":
                case "not":
                    operators.push(token);
                    break;
                default:
                    permissions.push(new Permission(token));
                    break;
            }
        }
    }

    private void buildExpressions() {
        while(!operators.isEmpty()){
            String operator = operators.pop();
            PermissionExpression perm1, perm2, exp;

            switch(operator){
                case "not":
                    perm1 = permissions.pop();
                    exp = new NotExpression(perm1);
                    break;
                case "and":
                    perm1 = permissions.pop();
                    perm2 = permissions.pop();
                    exp = new AndExpression(perm1,perm2);
                    break;
                case "or":
                    perm1 = permissions.pop();
                    perm2 = permissions.pop();
                    exp = new OrExpression(perm1,perm2);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + operator);
            }
            permissions.push(exp);

        }
    }
}
