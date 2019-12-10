package com.xia;

import com.xia.service.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wang.yubin
 * @date: 2019/12/10
 * @description: 主类
 */
public class Main {

    public static void main(String[] args) {
        slayDragonByXml();
    }

    private static void slayDragonByXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Knight knight = (Knight) applicationContext.getBean("knight");
        knight.embarkOnQuest();
    }

}
