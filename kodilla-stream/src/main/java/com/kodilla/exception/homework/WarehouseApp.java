package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Order order1 = new Order("123");
        Order order2 = new Order("456");
        Order order3 = new Order("789");

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);


        String searchNumber = "124";
        try {Order foundOrder = warehouse.getOrder(searchNumber);
            System.out.println("Zamówienie o numerze: " + foundOrder.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie nie istnieje");
        }
    }
        }
