package com.xia.service.impl;

import com.xia.service.CompactDisc;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author: wang.yubin
 * @date: 2019/12/11
 * @description: sgtPepper的CD盘
 */
@Component
public class SgtPeppers implements CompactDisc {

    private List<String> appendList;

    private List<String> addList;

    private Set<String> outSet;

    public SgtPeppers(List<String> appendList) {
        this.appendList = appendList;
    }

    public void setAddList(List<String> addList) {
        this.addList = addList;
        this.appendList.addAll(addList);
    }

    public void setOutSet(Set<String> outSet) {
        this.outSet = outSet;
        outSet.forEach(out -> this.appendList.add(out.concat(",")));
    }

    @Override
    public void play() {
        StringBuilder playString = new StringBuilder();
        playString.append("Playing ");
        appendList.forEach(append -> playString.append(append).append(","));
        playString.append("by ");
        System.out.println(playString.toString());
    }

}
