package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item testItem = new Item("test", 1);
    int counter = 1;

    @Test
    public void shouldAddItemToTheList() {
int numberOfItems = invoice.getSize();
    assertEquals(1, numberOfItems);
    }

    @Test
    public void shouldAddItemsToTheListAndReturnOneOfThem() {
        Item result = invoice.getItem(0);
        assertEquals("test", result.getName());
        assertEquals(1, result.getPrice());
    }

    @Test
    public void shouldReturnNullAfterGettingAnItemWithNegativeIndex(){
        Item result = invoice.getItem(-1);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullAfterGettingAnItemWithIndexOutOfBounds(){
        Item result = invoice.getItem(1);
        assertNull(result);
    }

    @Test
    public void shouldBeNoItemsOnTheListAfterClearing() {
        assertEquals(1, invoice.getSize());
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice(){
        invoice.addItem(testItem);
    }

    @AfterEach
    public void resetValues(){
        System.out.println("Resetting values...");
    }
    @BeforeAll
    public static void displayIntroMessage(){
        System.out.println("Starting testing");
    }
    @AfterAll
    public static void displayGoodByeMessage(){
        System.out.println("Finishing testing");
    }
}