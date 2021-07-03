package com.company;

public class Main {

    public static void main(String[] args){
        createObject("Samsung").print();
        createObject("Xiaomi").print();
        createObject("Iphone").print();
    }

    private static Printtable createObject(String name) {
       Printtable temp = null;
        switch(name) {
            case "Samsung":
                temp = new Samsung("Samsung", 300000);
                break;

            case "Xiaomi":
                temp = new Xiaomi("Xiaomi", 888);
                break;

            case "Iphone":
                temp = new Iphone("Iphone", 200000);
                break;
            default:
                return temp;
        }
        return temp;
    }
}



