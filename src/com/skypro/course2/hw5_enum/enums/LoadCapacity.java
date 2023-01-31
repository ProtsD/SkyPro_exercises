package com.skypro.course2.hw5_enum.enums;

public enum LoadCapacity {
    N1((Float)null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, (Float)null);
    private Float lowerLimit;
    private Float upperLimit;

    LoadCapacity(Float lowerLimit, Float upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public String toString() {
        if (lowerLimit == (Float)null & upperLimit == (Float)null) return "There is not enough data";
        else if (lowerLimit == (Float)null) return "Load Capacity less than " + upperLimit + " tons";
        else if (upperLimit == (Float)null) return "Load Capacity more than " + lowerLimit + " tons";
        else return "Load Capacity more than " + lowerLimit + " and less than " + upperLimit + " tons";
    }
}
