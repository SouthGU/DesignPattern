package com.mjdd;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


/**
 * @Auther: sise.xgl
 * @Date: 2020/4/2/9:20
 * @Description:
 */
public class CouponManageImplTest {

    @BeforeAll
    static void setUpUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @Test
    void testGetNumOfCouponsCanUse() {

        assertEquals(0, CouponManageImpl.getNumOfcouponsCanUse(1, 0));
        assertEquals(1, CouponManageImpl.getNumOfcouponsCanUse(1, 1));
        assertEquals(1, CouponManageImpl.getNumOfcouponsCanUse(1, 2));

        assertEquals(0, CouponManageImpl.getNumOfcouponsCanUse(2, 0));
        assertEquals(2, CouponManageImpl.getNumOfcouponsCanUse(2, 2));
        assertEquals(2, CouponManageImpl.getNumOfcouponsCanUse(2, 3));

        assertEquals(0, CouponManageImpl.getNumOfcouponsCanUse(3, 0));
        assertEquals(3, CouponManageImpl.getNumOfcouponsCanUse(3, 3));
        assertEquals(3, CouponManageImpl.getNumOfcouponsCanUse(3, 4));

        assertEquals(0, CouponManageImpl.getNumOfcouponsCanUse(0, 5));
        assertEquals(0, CouponManageImpl.getNumOfcouponsCanUse(4, 2));

    }
}