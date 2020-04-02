package com.mjdd;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/2/9:35
 * @Description:
 */
public class CouponManageImpl {
    public static int getNumOfcouponsCanUse(int months,int totalCoupons){
        if (months == 1 ){
            return totalCoupons >= 1?1: 0;
        }else if (months ==2 ){
            return totalCoupons >= 2?2:totalCoupons;
        }else if (months == 3){
            return totalCoupons >= 3?3:totalCoupons;
        }else if (months==6){
            return totalCoupons >= 3?3:totalCoupons;
        }
        else {
            return 0;
        }
    }
}
