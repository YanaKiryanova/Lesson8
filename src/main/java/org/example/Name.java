package org.example;

public enum Name {
    Aleksey("+375445257032"),
    Anatoly("+375295463789"),
    Valeriy("+375295123425"),
    Gleb("+375299673456"),
    Yegor("+375338964576"),
    Lev("+375293456523");
    private String num;

    Name(String number) {
        this.num = number;
    }

    public String getNum() {
        return num;
    }
}
