package com.kodilla.exception.homework;
public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {

       Warehouse warehouse = new Warehouse();

       warehouse.addOrder(new Order("123"));
       warehouse.addOrder(new Order("234"));
       warehouse.addOrder(new Order("456"));
       warehouse.addOrder(new Order("456z"));
       warehouse.addOrder(new Order("4523"));

try {
    Order checkForOrder111 = warehouse.getOrder("111");
    System.out.println("order: " + checkForOrder111);
}
catch (OrderDoesntExistException e) {
    System.out.println("order doesnt exist");}

try {
    Order checkForOrder123 = warehouse.getOrder("123");
    System.out.println("order: " + checkForOrder123);
}
catch (OrderDoesntExistException e){
    System.out.println("order doesnt exist");
}
    }
}
