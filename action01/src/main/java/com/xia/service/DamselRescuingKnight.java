package com.xia.service;

/**
 * @author: wang.yubin
 * @date: 2019/12/09
 * @description: 拯救少女的骑士
 */
@SuppressWarnings("unused")
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}
