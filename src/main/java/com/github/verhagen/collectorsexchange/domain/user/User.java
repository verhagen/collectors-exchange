package com.github.verhagen.collectorsexchange.domain.user;

public class User {
    private final String firstName;
    private final String betweenName;
    private final String lastName;


    public User(final String firstName, final String betweenName, final String lastName) {
        this.firstName = firstName;
        this.betweenName = betweenName;
        this.lastName = lastName;
    }


    public static User create(String firstName, String betweenName, String lastName) {
        return new User(firstName, betweenName, lastName);
    }

    
    public String getFullName() {
        final StringBuilder bldr = new StringBuilder();
        append(bldr, firstName);
        append(bldr, betweenName);
        append(bldr, lastName);
        return bldr.toString();
    }


    private void append(final StringBuilder bldr, final String text) {
        if (text == null) {
            return;
        }

        if (bldr.length() > 0) {
            bldr.append(" ");
        }
        bldr.append(text);
    }

}
