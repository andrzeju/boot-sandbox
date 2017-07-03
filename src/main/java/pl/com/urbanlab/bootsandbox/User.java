package pl.com.urbanlab.bootsandbox;

import lombok.Getter;

/**
 * Created by andrzej on 03.07.17.
 */
@Getter
class User {

    public User(String firstName, String lastName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }

    private String firstName;
    private String lastName;
    private String login;
}
