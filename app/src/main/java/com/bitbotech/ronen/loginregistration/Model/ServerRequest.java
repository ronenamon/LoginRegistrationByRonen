package com.bitbotech.ronen.loginregistration.Model;

/**
 * Created by ronen on 09/07/2017.
 */

public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
