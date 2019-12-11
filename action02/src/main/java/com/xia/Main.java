package com.xia;

import com.xia.service.CompactDisc;
import com.xia.service.impl.SgtPeppers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wang.yubin
 * @date: 2019/12/11
 * @description: 主类
 */
public class Main {

    public static void main(String[] args) {
        playCdByConfig();
        playCdByXml();
    }

    private static void playCdByConfig() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext("com.xia.config");
        String[] beanDefinitionNameArray = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNameArray) {
            System.out.println(beanDefinitionName);
        }
    }

    private static void playCdByXml() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SgtPeppers sgtPeppers = (SgtPeppers) classPathXmlApplicationContext.getBean("sgtPeppers");
        sgtPeppers.play();
        classPathXmlApplicationContext.close();
    }

}
