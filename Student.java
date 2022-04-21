package com.netcracker.homeworks.project3;

/*------P3.8 Implement a class Student. For the purpose of this exercise, a student has a name
        and a total quiz score. Supply an appropriate constructor and methods getName(),
        addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the average,
        you also need to store the number of quizzes that the student took.
        Supply a StudentTester class that tests all methods.---------------*/

public class Student {
    private String name;
    private int quizScore;
    private int totalScore;
    private int counter;

    public Student(String name) {
        this.name = name;
        quizScore = 0;
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score) {
        quizScore = score;
        totalScore = totalScore + score;
        ++counter;
    }

    public int getTotalScore(){
        return totalScore;
    }

    public double getAverageScore(){
        double average = totalScore * 1.0 / counter;
        return average;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                '\n' + "Total score: " + totalScore;
    }
}
