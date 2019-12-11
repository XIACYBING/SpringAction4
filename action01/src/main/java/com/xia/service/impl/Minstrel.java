package com.xia.service.impl;

import com.xia.service.Poet;

import java.io.PrintStream;

/**
 * @author: wang.yubin
 * @date: 2019/12/11
 * @description: 吟游诗人
 */
public class Minstrel implements Poet {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void signBeforeQuest() {
        printStream.println("Fa la la, the knight is so brave!");
    }

    @Override
    public void singAfterQuest() {
        printStream.println("Tee hee hee, the brave knight did embark on a quest!");
    }

}
