package com.mjdd;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


/**
 * @Auther: sise.xgl
 * @Date: 2020/4/2/9:20
 * @Description:
 */
public class FiboNumberTest {

    @BeforeAll
    static void setUpUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @Test
    void testGetNumOfCouponsCanUse() throws Exception {

        assertEquals(1,FiboNumber.getFiboNumber(1) );
        assertEquals(1,FiboNumber.getFiboNumber(2) );
        assertEquals(2,FiboNumber.getFiboNumber(3) );
        assertEquals(3,FiboNumber.getFiboNumber(4) );
        assertEquals(5,FiboNumber.getFiboNumber(5) );
        assertEquals(8,FiboNumber.getFiboNumber(6) );

//        assertEquals(-1,FiboNumber.getFiboNumber(6) );
    }
}