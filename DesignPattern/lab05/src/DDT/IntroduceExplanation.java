package DDT;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/9:38
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
        boolean isMac = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isIEBrowser = platform.toUpperCase().indexOf("IE") > -1;
        boolean isResize = resize > 0;
        if (isMac && isIEBrowser && wasInitialized() && isResize)
        {
            // do something...
        }
    }
}
