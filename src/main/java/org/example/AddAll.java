package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAll {
    public User user;
    private List<User> userList;
    public AddAll(){
        userList = new ArrayList<>();

        User user1 = new User(1,"Mustafa",27,"mucansu@gmail.com");
        User user2 = new User(2,"Hannah",32,"hannah@gmail.com");
        User user3 = new User(3,"Eva",37,"eva@gmail.com");
        User user4 = new User(4,"Richard",42,"richard@gmail.com");
        User user5 = new User(5,"Oliver",26,"oliver@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
        //This method is to add all users into our userList in one line
    }
}
