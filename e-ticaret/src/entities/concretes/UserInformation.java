package entities.concretes;

import entities.abstracts.Entity;

public class UserInformation implements Entity {

    private int id;
    private String userName;
    private String lastName;
    private String nationalId;
    private String email;
    private String password;
    public UserInformation(int id, String userName, String lastName, String nationalId, String email, String password){
        this.setId(id);
        this.setUserName(userName);
        this.setLastName(lastName);
        this.setNationalId(nationalId);
        this.setEmail(email);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
