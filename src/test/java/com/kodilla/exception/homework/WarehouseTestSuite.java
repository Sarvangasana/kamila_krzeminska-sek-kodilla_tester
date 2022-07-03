package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {
    @Test
    public void testGetOrder_withOrderDoesntExistException_1() {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("GZL/29/2022"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("GZL/30/2022"));
    }
}