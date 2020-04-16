package DDT;

/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/9:42
 * @Description:
 */
public class Student {

    private String name;
    private int age;

    public void printOwing() {
        printBanner();
        printDetails();
    }

    public void printBanner(){
        System.out.println("***************************");
        System.out.println("*****  Customer Owes  *****");
        System.out.println("***************************");
    }

    public void printDetails(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
