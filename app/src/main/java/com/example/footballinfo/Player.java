package com.example.footballinfo;

public class Player {
    private String name;
    private int age;
    private int dayStart;
    private  int apps;
    private int goals;

    public Player(String Name, int age, int dayStart, int apps, int goals)     {
        this.name=Name;
        this.age=age;
        this.dayStart=dayStart;
        this.apps=apps;
        this.goals=goals;
    }
    // Creating getName method
    public String getName(){
        return name;
    }
    //Creating getAge method
    public String getAge(){
        return (Integer.toString(age));
    }
    //Creating getDayStart
    public String getDayStart(){
        return(Integer.toString(dayStart));
    }
    // Creating getApps method
    public String getApps(){
        return(Integer.toString(apps));
    }
    //Creating getGoals metho
    public String getGoals(){
        return(Integer.toString(goals));
    }
    //Creating toString Method
    public String toString() {
        return this.name;
    }



}
