package com.xia.service;

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

    public void embarkOnQuest() {
        this.quest.embark();
    }

}
