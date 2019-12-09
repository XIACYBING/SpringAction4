package com.xia.service;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author: wang.yubin
 * @date: 2019/12/10
 * @description: 勇敢骑士的测试类
 */
public class BraveKnightTest {

    @Test
    public void KnightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}
