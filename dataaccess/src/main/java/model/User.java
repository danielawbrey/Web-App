package model;

import javax.persistence.*;

@Table(name="USERDATA")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {}

    public String getUserName(int userID) {
        return userName;
    }

    public void setPassword(String password) {}

    public String getPassword(String userName) {
        return password;
    }
}

