package DDT.Test;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/15:23
 * @Description:
 */
public class ReplaceAlgorithm {
    // ÷ÿππ«∞
    String foundPerson(String[] people)
    {
        for (int i = 0; i < people.length; ++i)
        {
            if (people[i].compareTo("Don") == 0)
            {
                return "Don";
            }

            if (people[i].compareTo("John") == 0)
            {
                return "John";
            }

            if (people[i].compareTo("Dave") == 0)
            {
                return "Dave";
            }
        }
        return " ";
    }
}
