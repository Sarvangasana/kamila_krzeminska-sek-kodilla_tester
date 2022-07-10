package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
    //given
    Invoice invoice = new Invoice();

    @BeforeEach
    public void initializeInvoice() {
    invoice.addItem(new Item("Table", 35));
    invoice.addItem(new Item("Wardrobe", 50));
    invoice.addItem(new Item("TV", 100));
    }

    @Test
    public void shouldAddItemToTheInvoice() {
        //when
        int result = invoice.getSize();
        int expected = 3;
        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldGetItem() {
        //when
        Item result = invoice.getItem(0);
        //then
        assertEquals("Table", result.getName());
        assertEquals(35, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        Item result = invoice.getItem(4);
        //then
        assertNull(result);
    }

    @Test
    public void shouldClearUpInvoice() {
        //when
        invoice.clear();
        int result = invoice.getSize();
        int expected = 0;
        //then
        assertEquals(expected, result);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}