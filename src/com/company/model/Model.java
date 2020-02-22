package com.company.model;

import com.company.model.Entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 26.09.2017.
 */
public class Model {

//    private List<User> list = new ArrayList<>();
//
//    public List<User> getList() {
//        return list;
//    }
//
//    public void setList(User user) {
//        this.list.add(user);
//    }
//
//    @Override
//    public String toString() {
//        return "Model{" +
//                "list=" + list +
//                '}';
//    }

    private List<User> list = new ArrayList<>();

    public void setList(List<User> list) {
        this.list = list;
    }

    public List<User> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Model{" +
                "list=" + list +
                '}';
    }
}
