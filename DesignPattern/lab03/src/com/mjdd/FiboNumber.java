package com.mjdd;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/2/9:57
 * @Description:
 */
public class FiboNumber {
    public static long getFiboNumber(int index) throws Exception {
        if (index<1 || index>50){
            throw new Exception("不符合规定");
        }
        if (index == 1 || index == 2){
            return 1;
        }else if (index > 2){
            return getFiboNumber(index-1)+getFiboNumber(index-2);
        }
        return 0;
    }
}
