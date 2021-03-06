package com.my.oracle;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class XmlConfigWithBeanFactory {

    public static void main(String[] args) {
        
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        
        rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/xmlBeanFactory.xml"));
        
        Oracle oracle = (Oracle) factory.getBean("oracle");
        
        System.out.println(oracle.defineMeaningOfLife());
    }
}
