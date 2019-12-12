package com.xia.service;

import com.xia.config.CdPlayerConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author: wang.yubin
 * @date: 2019/12/11
 * @description: CD播放器测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CompactDiscPlayerTest {

    /**
     * 根据控制台输出的规则类（@Rule用于扩张SystemOutRule）
     */
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Resource
    private CompactDisc sgtPeppers;

    @Test
    public void cdPlayerTest() {
        /*enableLog()开启记录控制台输出，输出一般是CRLF，所以需要行尾符\r*/
        systemOutRule.enableLog();
        sgtPeppers.play();
        Assert.assertEquals("Playing by \r\n", systemOutRule.getLog());
        Assert.assertNotNull("sgtPeppers is null!", sgtPeppers);
    }

}
