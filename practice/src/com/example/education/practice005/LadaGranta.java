package com.example.education.practice005;

public class LadaGranta extends Vehicle {

    private String emotion;

    public LadaGranta(String vehicleType, int price, String brand, String emotion) {
        super(vehicleType, price, brand);
        setEmotion(emotion);
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    @Override
    public void emotion() {
        System.out.println(emotion);
    }
}
