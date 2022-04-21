package com.netcracker.homeworks.project3;

/*------P3.9 Write a class Battery that models a rechargeable battery. A battery has a constructor
        public Battery(double capacity) where capacity is a value measured in milliampere hours.
        A typical AA battery has a capacity of 2000 to 3000 mAh.
        The method public void drain(double amount) drains the capacity of the battery by the given amount.
        The method public void charge() charges the battery to its original capacity.
        The method public double getRemainingCapacity() gets the remaining capacity of the battery.*/

public class Battery {
    private double currentCapacity;
    private double batteryCapacity;

    public Battery(double capacity) {
        currentCapacity = capacity;
        batteryCapacity = capacity;
    }

    public void drain(double amount){
        currentCapacity = currentCapacity - amount;
    }

    public void charge(){
        currentCapacity = batteryCapacity;
    }

    public double getRemainingCapacity(){
        return this.currentCapacity;
    }

    @Override
    public String toString() {
        return "Battery capacity: " + batteryCapacity + '\n' +
                "Remaining capacity: " + currentCapacity;
    }
}
