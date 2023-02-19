package com.skypro.course2.hw11_stream_optional;

public class Transport {
    private String type;
    private double engineVolume;

    public Transport(String type, double engineVolume) {
        this.type = type;
        this.engineVolume = engineVolume;
    }

    public String getType() {
        return type;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
