package com.xia.service.impl;

import com.xia.service.Quest;

/**
 * @author: wang.yubin
 * @date: 2019/12/09
 * @description: 拯救少女的任务
 */
public class RescueDamselQuest implements Quest {

    @Override
    public void embark() {
        System.out.println("questing...");
    }

}
