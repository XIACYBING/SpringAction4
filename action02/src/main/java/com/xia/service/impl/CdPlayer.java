package com.xia.service.impl;

import com.xia.service.CompactDisc;
import com.xia.service.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author: wang.yubin
 * @date: 2019/12/12
 * @description: CD播放器
 */
@Named
public class CdPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Resource(name = "cantateDomino")
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        System.out.println("CDPlayer playing...");
        compactDisc.play();
    }

}
