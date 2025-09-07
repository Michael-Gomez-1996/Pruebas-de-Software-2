package org.example;

import java.util.List;

public class EmailFinder {
    public User findUserByEmail(List<User> users, String email) {
        if (users == null || email == null) {
            return null;
        }
        for (User user : users) {
            if (email.equals(user.getEmail())) {
                return user;
            }
        }
        return null;
    }
}
