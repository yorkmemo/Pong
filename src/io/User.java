package io;

public abstract class User {
    private static final String name = System.getProperty("user.name");

    public static String name() {
        return name;
    }
}
