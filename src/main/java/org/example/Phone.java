package org.example;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber(Name name) {
        return name.getNum();
    }

    public void write() {
        Integer weig = weight == 0? null:weight;
        System.out.println("Number " + number + " Model: " + model + " Weight: " + weig);
    }

    public void receiveCall(Name name) {
        System.out.println("Call " + name + " " + getNumber(name));
    }

    public void receiveCall(String name, String number) {
        System.out.println("Call " + name + " " + number);
    }

    public void sendMessage(Name... num) {
        for (Name names : num) {
            System.out.println("Сообщение отправленно " + names.getNum());
        }
    }


}

