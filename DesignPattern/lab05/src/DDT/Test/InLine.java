package DDT.Test;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/15:23
 * @Description:
 */
public class InLine {

    int getRation(int numberOfLateDeliveries)
    {
        return (moreThanFiveLateDeliveries(numberOfLateDeliveries)) ? 2 : 1;
    }

    Boolean moreThanFiveLateDeliveries(int numberOfLateDeliveries)
    {
        return (numberOfLateDeliveries > 5);
    }
    Boolean moreThanOneThousand()
    {
        int nResult = 10 * 10 * 10;
        return (nResult > 1000);
    }
}
