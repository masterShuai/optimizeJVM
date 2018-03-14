package cn.jvm.overflow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 王帅
 * @Description: 模拟java堆溢出
 * @VM Args: -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 * @Date: Created in 18:05 2018/3/14
 * @Modified By:
 */
public class HeapOverFlowTest {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> testList = new ArrayList<OOMObject>();
        while (true){
            testList.add(new OOMObject());
        }
    }
}
