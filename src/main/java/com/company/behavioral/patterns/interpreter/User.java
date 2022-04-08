package com.company.behavioral.patterns.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {

    private final List<String> permissions;

    private final String userName;

    public User(String userName, String... permissions) {
        this.userName = userName;
        this.permissions = new ArrayList<String>();
        Stream.of(permissions).forEach( permission -> this.permissions.add(permission.toLowerCase()) );

    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUserName() {
        return userName;
    }
}
