package com.xia.service.impl;

import com.xia.service.Knight;
import com.xia.service.Quest;

/**
 * @author: wang.yubin
 * @date: 2019/12/10
 * @description: 勇敢的骑士
 */
@SuppressWarnings("unused")
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        this.quest.embark();
    }

}
