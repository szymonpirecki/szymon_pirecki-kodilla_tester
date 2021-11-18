package modulJava;

import modulJava.Notebook;

public class FirstClass {
    public static void main(String[] args) {

            Notebook notebook = new Notebook(600, 3999, "HP", 2019);
            System.out.println(notebook.weight + " " + notebook.price + " PLN " + notebook.brand);
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYearAndPrice();
        System.out.println(" ");


            Notebook heavyNotebook = new Notebook(2000, 999, "Dell", 2012);
            System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " PLN " + heavyNotebook.brand);
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.checkYearAndPrice();
        System.out.println(" ");


            Notebook oldNotebook = new Notebook(1200, 599, "Acer", 2009);
            System.out.println(oldNotebook.weight + " " + oldNotebook.price + " PLN " + oldNotebook.brand);
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.checkYearAndPrice();
        System.out.println(" ");


            Notebook ultrabook = new Notebook(700, 4999, "Asus", 2020);
            System.out.println(ultrabook.weight + " " + ultrabook.price + " PLN " + ultrabook.brand);
            ultrabook.checkPrice();
            ultrabook.checkWeight();
            ultrabook.checkYearAndPrice();
        System.out.println(" ");

            Notebook macbook = new Notebook(1000, 3500, "Apple", 2018);
            System.out.println(macbook.weight + " " + macbook.price + " PLN " + macbook.brand);
            macbook.checkPrice();
            macbook.checkWeight();
            macbook.checkYearAndPrice();
        System.out.println(" ");


            Notebook thinkPad = new Notebook(1800, 3800, "Lenovo", 2019);
            System.out.println(thinkPad.weight + " " + thinkPad.price + " PLN " + thinkPad.brand);
            thinkPad.checkPrice();
            thinkPad.checkWeight();
            thinkPad.checkYearAndPrice();
        System.out.println(" ");

            Notebook predator = new Notebook(3000, 5999, "Acer", 2020);
            System.out.println(predator.weight + " " + predator.price + " PLN " + predator.brand);
            predator.checkPrice();
            predator.checkWeight();
            predator.checkYearAndPrice();
        System.out.println(" ");
        }
        }

