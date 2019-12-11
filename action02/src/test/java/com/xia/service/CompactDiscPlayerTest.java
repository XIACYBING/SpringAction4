package com.xia.service;

import com.xia.config.CdPlayerConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author: wang.yubin
 * @date: 2019/12/11
 * @description: CD播放器测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CompactDiscPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Resource
    private CompactDisc sgtPeppers;

    @Inject
    private CompactDisc injectCd;

    @Test
    public void cdPlayerTest() {
        compactDisc.play();
        sgtPeppers.play();
        injectCd.play();
        Assert.assertNotNull("compactDis is null!", compactDisc);
        Assert.assertNotNull("sgtPeppers is null!", sgtPeppers);
        Assert.assertNotNull("injectCd is null!", injectCd);
    }

}
