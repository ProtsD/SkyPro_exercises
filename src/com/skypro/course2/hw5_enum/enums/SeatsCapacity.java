package com.skypro.course2.hw5_enum.enums;

public enum SeatsCapacity {
    LOW((Integer)null,10),
    LOWLOW(11,25),
    MIDDLE(26,50),
    HIGH(51,80),
    HIGHHIGH(81,(Integer)null);

    private Integer lowerLimit;
    private Integer upperLimit;

    SeatsCapacity(Integer lowerLimit, Integer upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }


    @Override
    public String toString() {
        if (lowerLimit == (Integer)null & upperLimit == (Integer)null) return "There is not enough data";
        else if (lowerLimit == (Integer)null) return "Seats Capacity less than " + upperLimit + " tons";
        else if (upperLimit == (Integer)null) return "Seats Capacity more than " + lowerLimit + " tons";
        else return "Seats Capacity more than " + lowerLimit + " and less than " + upperLimit + " tons";
    }
}
