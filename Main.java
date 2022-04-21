package com.netcracker.homeworks.project3;

import com.netcracker.homeworks.project3.Chess.ChessPiece;
import com.netcracker.homeworks.project3.Chess.Pawn;

public class Main {
    public static void main(String[] args) {

        System.out.println('\n' + "///////////////////////////////////// " +
        '\n' + "CHAPTER 3, Programming projects 3.1, 3.2 ");

        CashRegister register = new CashRegister(10);
        register.recordPurchase(10);
        register.recordPurchase(20);
        register.recordTaxablePurchase(80);

        register.receivePayment(500);

        System.out.println(register);

        System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 3, Programming projects 3.4 " +
                '\n' + " --------------------------------");
        Sheet sheet = new Sheet();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();
        System.out.println(sheet);
        sheet.cutInHalf();

        System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 3, Programming projects 3.6, 3.7 " +
                '\n' + " --------------------------------");
      Person person1 = new Person("Nick");
        Person person2 = new Person("Kate");
        Person person3 = new Person("Lulu");
        Person person4 = new Person("John");
        Person person5 = new Person("Lesly");

        person1.befriend(person5);
        person1.befriend(person3);
        System.out.println(person1.getFriendNames());
        System.out.println("Numbers of friends: " + person1.getFriendCount());

        person1.unfriend(person3);
        System.out.println(person1.getFriendNames());
        System.out.println("Numbers of friends: " + person1.getFriendCount());

       // System.out.println(person1);


        System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 3, Programming projects 3.8 " +
                '\n' + " --------------------------------");
        Student student = new Student("Jim");
        student.addQuiz(10);
        student.addQuiz(10);
        student.addQuiz(10);

        System.out.println("Name: " + student.getName());
        System.out.println("Total score: "+ student.getTotalScore());
        System.out.println("Quantity of quizzes: " + student.getCounter());
        System.out.println("Average score: " + student.getAverageScore());


        System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 3, Programming projects 3.9 " +
                '\n' + " --------------------------------");

        Battery  battery = new Battery(2000);
        battery.drain(500);
        battery.charge();
        battery.drain(1200);
        //System.out.println("Remaining capacity: " + battery.getRemainingCapacity());
        System.out.println(battery);

        System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 8, Programming projects 8.1 " +
                '\n' + " --------------------------------");
        ComboLock comboLock = new ComboLock(9, 6, 3);
        comboLock.turnRight(9);
        comboLock.turnLeft(33);
        comboLock.turnRight(3);

        System.out.println(comboLock.open());


        /* System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 9, Worked example 9.1 " +
                '\n' + " --------------------------------");


       System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 9, Programming projects 9.1 " +
                '\n' + " --------------------------------");
        ChessPiece chessPiece = new ChessPiece();
        chessPiece.setPosition("a", "2");

        Pawn pawn = new Pawn();
      //  pawn.setColumn("d");
        //pawn.setRow("2");
        pawn.setPawnPosition("b", "2");
     //   pawn.canMoveTo();*/



        System.out.println('\n' + "///////////////////////////////////// " +
                '\n' + "CHAPTER 9, Programming projects 9.2, 9.3 " +
                '\n' + " --------------------------------");
        Clock clock = new Clock();
        WorldClock worldClock = new WorldClock(6);
        clock.setAlarm(2, 35);

        System.out.println("in Nizhny Novgorod [" + clock.getTime()+ "]");
        System.out.println(clock.getAlarm());
        System.out.println("in Norilsk [" + worldClock.getTime()+ "]");


    }
}
