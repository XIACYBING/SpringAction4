package com.xia;

import com.xia.service.CompactDisc;
import com.xia.service.MediaPlayer;
import com.xia.service.impl.CdPlayer;
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
        playCdByXml();
        playCdByConfig();
    }

    private static void playCdByConfig() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext("com.xia.config");
        String[] beanDefinitionNameArray = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNameArray) {
            System.out.println("AnnotationConfigApplicationContext:".concat(beanDefinitionName));
        }
    }

    private static void playCdByXml() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CompactDisc compactDisc = (CompactDisc) classPathXmlApplicationContext.getBean("sgtPeppers");
        compactDisc.play();

        MediaPlayer mediaPlayer = (MediaPlayer) classPathXmlApplicationContext.getBean("cdPlayer");
        mediaPlayer.play();

        String[] beanDefinitionNameArray = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNameArray) {
            System.out.println("ClassPathXmlApplicationContext:".concat(beanDefinitionName));
        }

        /*测试c、p和util命名空间*/
        SgtPeppers sgtPeppers = (SgtPeppers) classPathXmlApplicationContext.getBean("com.xia.service.impl.SgtPeppers#0");
        sgtPeppers.play();

        classPathXmlApplicationContext.close();


    }

}
