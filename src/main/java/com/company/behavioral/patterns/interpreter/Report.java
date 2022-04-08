package com.company.behavioral.patterns.interpreter;

public class Report {

    private final String name;
    //"NOT ADMIN", "FINANCE_USER AND ADMIN"
    private final String permission;

    public Report(String name, String permission){
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
