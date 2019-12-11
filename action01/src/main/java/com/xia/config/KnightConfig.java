package com.xia.config;

import com.xia.service.Knight;
import com.xia.service.Quest;
import com.xia.service.impl.BraveKnight;
import com.xia.service.impl.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wang.yubin
 * @date: 2019/12/11
 * @description: 骑士的Java配置类
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(this.quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
