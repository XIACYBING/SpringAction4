package com.xia.service.impl;

import com.xia.service.CompactDisc;
import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * @author: wang.yubin
 * @date: 2019/12/12
 * @description: 黑教堂
 */
@Named
public class CantateDomino implements CompactDisc {

    @Override
    public void play() {
        System.out.println("Cantate Domino playing...");
    }
}
