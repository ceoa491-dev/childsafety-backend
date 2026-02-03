package com.childsafety.childsafety.response;

public class ChildSafeResponse {
    public String name;
    public String email;
    public String who;
    public ChildSafeResponse(String name, String email,String who){
        this.name=name;
        this.email=email;
        this.who=who;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
