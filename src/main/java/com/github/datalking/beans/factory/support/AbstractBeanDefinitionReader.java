package com.github.datalking.beans.factory.support;


import com.github.datalking.beans.factory.config.BeanDefinition;
import com.github.datalking.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * 从配置中读取BeanDefinitionReader
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String, BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}