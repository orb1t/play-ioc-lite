package com.github.datalking.beans.factory.support;

import com.github.datalking.io.Resource;

/**
 * 从配置中读取BeanDefinitionReader
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    //把“配置源”转化为多个BeanDefinition并注册到BeanDefinitionRegistry中
    void loadBeanDefinitions(String location) throws Exception;

//    void loadBeanDefinitions(Resource resource) throws Exception;

//    BeanNameGenerator getBeanNameGenerator();


}
