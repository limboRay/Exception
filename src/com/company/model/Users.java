package com.company.model;

import com.company.view.View;

import java.util.Arrays;
import java.util.Scanner;

public enum Users {

    USER1("taras123"),
    USER2("maxim123");



    private String login;

    Users(String login) {
        this.login = login;
    }

    public static boolean checkLogin(String scan) {
        for (Users u : Users.values()) {
            if (u.login.equals(scan)) {
                return false;
            }
        }

        return true;




    }
}
