package org.launchcode.spaday.data;

import org.launchcode.spaday.controllers.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private ArrayList<User> users = new ArrayList<>();

    public void add(User user){
        users.add(user);
    }

    public ArrayList<User> getAll() {
        return this.users;
    }

    public User getById (int id) {
        for (User user : users){
            if(user.getId() ==id) {
                return user;
            }
        }
        return null;
    }


}
