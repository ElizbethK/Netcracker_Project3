package com.netcracker.homeworks.project3;

/*------P3.6 A Person has a name (just a first name for simplicity) and friends. Store the names of
        the friends in a string, separated by spaces. Provide a constructor that constructs a
        person with a given name and no friends. Provide methods
                public void befriend(Person p)
                public void unfriend(Person p)
                public String getFriendNames()----------*/

/*-----------P3.7 Add a method
             public int getFriendCount()
             to the Person class of Exercise •• P3.6.---*/


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String friends ="";
    List<String> listOfFriends = new ArrayList<>();
    private int friendCount;

    public Person(String name) {
        this.name = name;
        friendCount = 0;
    }

    public String getName() {
        return name;
    }

    public void befriend(Person p){
        //friend = friend + p.getName() + " ";
       listOfFriends.add(p.getName());
        ++friendCount;
    }

    public void unfriend(Person p){
        listOfFriends.remove(listOfFriends.indexOf(p.getName()));
        --friendCount;
    }

    public String getFriendNames() {
       /* for (int i = 0; i < listOfFriends.size(); i++) {
            friends = listOfFriends.get(i) + " ";*/
        for (String str:listOfFriends) {
            String friends = str;
            System.out.print(str + " ");
        }
        return friends;
    }

    public int getFriendCount(){
        return friendCount;
    }

    @Override
    public String toString() {
        return "<-----" + name + "`s friends. " + getFriendNames() +
                "Quantity of friends: " + friendCount;
    }
}
