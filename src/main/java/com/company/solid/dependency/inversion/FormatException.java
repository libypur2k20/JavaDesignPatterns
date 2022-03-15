package com.company.solid.dependency.inversion;

import java.io.IOException;

public class FormatException extends IOException {

    public FormatException(Exception cause) {
        super(cause);
    }
}
