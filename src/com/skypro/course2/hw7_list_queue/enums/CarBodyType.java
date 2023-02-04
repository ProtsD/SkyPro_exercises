package com.skypro.course2.hw7_list_queue.enums;

public enum CarBodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String ruType;

    CarBodyType(String ruType) {
        this.ruType = ruType;
    }

    @Override
    public String toString() {
        return "Car Body Type: " + ruType;
    }
}
