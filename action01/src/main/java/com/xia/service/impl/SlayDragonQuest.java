package com.xia.service.impl;

import com.xia.service.Quest;

import java.io.PrintStream;

/**
 * @author: wang.yubin
 * @date: 2019/12/10
 * @description: 杀死恶龙的任务
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("DragonSlaying...");
    }

}
