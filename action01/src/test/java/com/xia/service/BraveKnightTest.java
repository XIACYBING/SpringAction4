package com.xia.service;

import com.xia.service.impl.BraveKnight;
import com.xia.service.impl.RescueDamselQuest;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author: wang.yubin
 * @date: 2019/12/10
 * @description: 勇敢骑士的测试类
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuestTest() {
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }

    @Test
    public void braveKnightShouldOnRescueDamsel() {
        Quest quest = Mockito.mock(RescueDamselQuest.class);
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        Mockito.verify(quest, Mockito.times(1)).embark();
    }

}
