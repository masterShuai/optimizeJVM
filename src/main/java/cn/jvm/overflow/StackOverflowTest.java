package cn.jvm.overflow;

/**
 * @Author: 王帅
 * @Description: VM Args: -Xss128k
 * @Date:Created in 21:11 2018/3/14
 * @Modified By:
 */
public class StackOverflowTest {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength ++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        StackOverflowTest sot = new StackOverflowTest();
        try {
            sot.stackLeak();
        }catch (Throwable e){
            System.out.printf("stack length:" + sot.stackLength);
            throw e;
        }
    }
}
