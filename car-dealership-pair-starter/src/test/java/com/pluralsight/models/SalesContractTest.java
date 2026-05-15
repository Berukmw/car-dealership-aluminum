package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesContractTest {

    Vehicle vehicle = new Vehicle(10001, 1993, "Ford", "Explorer", "SUV", "Red", 182451, 3495.00);
    SalesContract contract = new SalesContract("20210928", "Fred Wyatt", "fred@texas.com", vehicle, true);

    double result = contract.getMonthlyPayment();

    @Test
    void isFinance() {
    }

    @Test
    void setFinance() {
    }

    @Test
    void getSalesTax() {
        System.out.println("Sales tax " + contract.getSalesTax());
    }

    @Test
    void getRecordFee() {
        System.out.println("Recording fee " + contract.getRecordFee());
    }

    @Test
    void getProcessingFee() {
        System.out.println("Processing fee " + contract.getProcessingFee());
    }

    @Test
    void getTotalPrice() {
        System.out.println("Total price " + contract.getTotalPrice());
    }

    @Test
    void getMonthlyPayment() {
        System.out.println("Monthly payment: " + contract.getMonthlyPayment());
    }
}