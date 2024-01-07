package com.shaman.springboot.error.springbooterror.models.domain;

public class User {
    
    private Long id;
    private String firstname;
    private String lastName;

    private Role role;

    


    public User(Long id, String firstname, String lastName) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
    }


    public User() {
    }

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Role getRole() {
        return role;
    }

    // public String getRoleName() {
    //     return role.getName();
    // }


    public void setRole(Role role) {
        this.role = role;
    }

    
    
}
