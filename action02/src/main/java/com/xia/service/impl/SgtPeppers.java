package com.xia.service.impl;

import com.xia.service.CompactDisc;
import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * @author: wang.yubin
 * @date: 2019/12/11
 * @description: sgtPepper的CD盘
 */
@Named("lonelyHeartClub")
@Component("sgtPeppers")
public class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        StringBuilder playString = new StringBuilder();
        playString.append("Playing ");
        playString.append("by ");
        System.out.println(playString.toString());
    }

}
