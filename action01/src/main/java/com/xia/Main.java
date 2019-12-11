package com.xia;

import com.xia.service.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wang.yubin
 * @date: 2019/12/10
 * @description: 主类
 */
@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        slayDragonByXml();
    }

    private static void slayDragonByXml() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Knight knight = (Knight) classPathXmlApplicationContext.getBean("braveKnight");
        knight.embarkOnQuest();
        classPathXmlApplicationContext.close();
    }

    private static void slayDragonByConfig() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext("com.xia.config");
        Knight knight = annotationConfigApplicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
        annotationConfigApplicationContext.close();
    }

}
