package com.company.controller;

import com.company.exception.CustomException;
import com.company.model.Users;
import com.company.view.View;

import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class UtilityController {
    private Scanner scanner;
    private View view;
    private Users users;


    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);


        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex) && Users.checkLogin(res))) {
            try {
                throw new CustomException();
            } catch (CustomException e) {
                e.printStackTrace();
            }
            view.printWrongStringInput(message);


        }
        return res;

    }


}



