package com.skypro.course2.hw6_exceptions.enums;

public enum LoadCapacity {
    N1(0f, 3.5f),
    N2(3.5f, 12f),
    N3(12f, 400);
    private float lowerLimit;
    private float upperLimit;

    LoadCapacity(float lowerLimit, float upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public String toString() {
        if (lowerLimit == 0 & upperLimit == 0) return "There is not enough data";
        else if (lowerLimit == 0) return "Load Capacity less than " + upperLimit + " tons";
        else if (upperLimit >= 400) return "Load Capacity more than " + lowerLimit + " tons";
        else return "Load Capacity more than " + lowerLimit + " and less than " + upperLimit + " tons";
    }
}
