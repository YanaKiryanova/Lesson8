package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("+(375 44)525-70-88", "Iphone", 100);
        Phone phoneTwo = new Phone("+(375 44)563-57-36", "Samsung", 150);
        Phone phoneThree = new Phone("+(375 44)475-23-56", "Iphone");

        phoneOne.write();
        phoneOne.receiveCall(Name.Anatoly);

        phoneTwo.write();
        phoneTwo.receiveCall("Yana", "+385445257032");

        phoneThree.write();
        phoneThree.sendMessage(Name.Aleksey,Name.Anatoly, Name.Gleb, Name.Lev, Name.Valeriy, Name.Yegor);


    }
}