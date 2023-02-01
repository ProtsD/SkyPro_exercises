package com.skypro.course2.hw5_enum.enums;

public enum SeatsCapacity {
    LOW(0,10),
    LOWLOW(11,25),
    MIDDLE(26,50),
    HIGH(51,80),
    HIGHHIGH(81,200);

    private int lowerLimit;
    private int upperLimit;

    SeatsCapacity(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }


    @Override
    public String toString() {
        if (lowerLimit == 0 & upperLimit == 0) return "There is not enough data";
        else if (lowerLimit == 0) return "Seats Capacity less than " + upperLimit + " tons";
        else if (upperLimit >= 200) return "Seats Capacity more than " + lowerLimit + " tons";
        else return "Seats Capacity more than " + lowerLimit + " and less than " + upperLimit + " tons";
    }
}
