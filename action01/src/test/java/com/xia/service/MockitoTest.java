package com.xia.service;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

/**
 * @author wang.yubin
 * @date 2019/12/10
 * @description mockito的使用说明/测试
 */
public class MockitoTest {

    @Test
    @SuppressWarnings("unchecked")
    public void mockTest() {
        /*mock的作用是模拟出一个接口/类，这种方法适用于那些类内部依赖了很多其他类，然后自身也被某个类依赖的接口/类*/
        List mockList = Mockito.mock(List.class);
        mockList.add("a");
        /*verify的作用是验证模拟出来的接口/类是否进行了对应的操作行为，times的作用是验证对应方法被调用的次数*/
        Mockito.verify(mockList, Mockito.times(1)).add("a");
    }

}
