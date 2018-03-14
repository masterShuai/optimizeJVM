package cn.jvm.overflow;

/**
 * @Author: 王帅
 * @Description: VM Arg: -Xss2M 单线程设大 多线程更大
 * @Date:Created in 21:25 2018/3/14
 * @Modified By:
 */
public class StackOutOfMemoryTest {
    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(() -> dontStop());
            thread.start();
        }
    }

    public static void main(String[] args) {
        StackOutOfMemoryTest soomt = new StackOutOfMemoryTest();
        soomt.stackLeakByThread();
    }
}
