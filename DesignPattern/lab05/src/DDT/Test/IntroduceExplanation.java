package DDT.Test;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/15:22
 * @Description:
 */
public class IntroduceExplanation {
    Boolean wasInitialized()
    {
        // do something...
        return true;
    }
    void Func(String platform, int resize)
    {
        if (platform.toUpperCase().indexOf("MAC") > -1 &&
                platform.toUpperCase().indexOf("IE") > -1 &&
                wasInitialized() && resize > 0)
        {
            // do something...
        }
    }
}
