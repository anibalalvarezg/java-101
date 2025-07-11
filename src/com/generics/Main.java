package com.generics;

public class Main {
    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(20);
        if (user1.compareTo(user2) < 0)
            System.out.println("user2 is greater than user1");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user2 == user1");
        else
            System.out.println("user1 > user2");


        var max = Utils.max(user1, user2);
        System.out.println(max.toString());

        Utils.print(1, 10);

        User user = new Instructor(10);
        System.out.println(user.toString());
        Utils.printUser(new Instructor(20));

        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();



//        Utils.printUsers(instructors);
    }
}
