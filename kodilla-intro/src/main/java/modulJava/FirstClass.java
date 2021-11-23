package modulJava;

import modulJava.Notebook;

public class FirstClass {
    public static void main(String[] args) {

            Notebook notebook = new Notebook(600, 3999, "HP", 2019);
            System.out.println(notebook.getWeight() + " " + notebook.getPrice() + " PLN " + notebook.getBrand());
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYearAndPrice();
        System.out.println(" ");


            Notebook heavyNotebook = new Notebook(2000, 999, "Dell", 2012);
            System.out.println(heavyNotebook.getWeight() + " " + heavyNotebook.getPrice() + " PLN " + heavyNotebook.getBrand());
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.checkYearAndPrice();
        System.out.println(" ");


            Notebook oldNotebook = new Notebook(1200, 599, "Acer", 2009);
            System.out.println(oldNotebook.getWeight() + " " + oldNotebook.getPrice() + " PLN " + oldNotebook.getBrand());
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.checkYearAndPrice();
        System.out.println(" ");


            Notebook ultrabook = new Notebook(700, 4999, "Asus", 2020);
            System.out.println(ultrabook.getWeight() + " " + ultrabook.getPrice() + " PLN " + ultrabook.getBrand());
            ultrabook.checkPrice();
            ultrabook.checkWeight();
            ultrabook.checkYearAndPrice();
        System.out.println(" ");

            Notebook macbook = new Notebook(1000, 3500, "Apple", 2018);
            System.out.println(macbook.getWeight() + " " + macbook.getPrice() + " PLN " + macbook.getBrand());
            macbook.checkPrice();
            macbook.checkWeight();
            macbook.checkYearAndPrice();
        System.out.println(" ");


            Notebook thinkPad = new Notebook(1800, 3800, "Lenovo", 2019);
            System.out.println(thinkPad.getWeight() + " " + thinkPad.getPrice() + " PLN " + thinkPad.getBrand());
            thinkPad.checkPrice();
            thinkPad.checkWeight();
            thinkPad.checkYearAndPrice();
        System.out.println(" ");

            Notebook predator = new Notebook(3000, 5999, "Acer", 2020);
            System.out.println(predator.getWeight() + " " + predator.getPrice() + " PLN " + predator.getBrand());
            predator.checkPrice();
            predator.checkWeight();
            predator.checkYearAndPrice();
        System.out.println(" ");
        }
        }

