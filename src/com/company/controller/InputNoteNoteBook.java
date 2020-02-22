package com.company.controller;

import com.company.model.Entity.User;
import com.company.model.Model;
import com.company.model.Users;
import com.company.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.controller.RegexContainer.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;

/**
 * Created by student on 26.09.2017.
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private Model model;
    private User user;

    private List<User> list = new ArrayList<>();

    private String login;


    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);

//        this.login =
//                utilityController.inputStringValueWithScanner
//                        (LOGIN_DATA, REGEX_LOGIN);

        list.add(new User( utilityController.inputStringValueWithScanner
                (LOGIN_DATA, REGEX_LOGIN)));




    }
}
