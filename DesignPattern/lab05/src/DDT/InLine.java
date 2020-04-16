package DDT;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/9:45
 * @Description:
 */
public class InLine {

    int getRation(int numberOfLateDeliveries)
    {
        return ((numberOfLateDeliveries > 5)) ? 2 : 1;
    }

//    Boolean moreThanFiveLateDeliveries(int numberOfLateDeliveries)
//    {return (numberOfLateDeliveries > 5);}

    Boolean moreThanOneThousand()
    {
//        int nResult = 10 * 10 * 10;
        return (10 * 10 * 10 > 1000);
    }
}
