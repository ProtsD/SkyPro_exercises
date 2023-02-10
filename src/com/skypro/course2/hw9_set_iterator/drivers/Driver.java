package com.skypro.course2.hw9_set_iterator.drivers;

public abstract class Driver {
    private String name;
    private boolean hasDriverLic;
    private int yearsOfExperience;

    public Driver(String name, boolean hasDriverLic, int yearsOfExperience) {
        this.name = name;
        this.hasDriverLic = hasDriverLic;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLic() {
        return hasDriverLic;
    }

    public void setHasDriverLic(boolean hasDriverLic) {
        this.hasDriverLic = hasDriverLic;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void fuelTankRefill();
}
