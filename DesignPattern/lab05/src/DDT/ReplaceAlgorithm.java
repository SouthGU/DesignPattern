package DDT;

import java.util.Arrays;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/9:55
 * @Description:
 */
public class ReplaceAlgorithm {

    String[] candidate = new String[]{"Don","John","Dava"};

    // ÷ÿππ«∞
    String foundPerson(String[] people) {

        for (int i = 0; i < people.length; i++) {
            if (Arrays.asList(candidate).contains(people[i])){
                return people[i];
            }
        }
        return " ";
    }
}
