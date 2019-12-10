package com.xia.service.impl;

import com.xia.service.Knight;

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

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}
