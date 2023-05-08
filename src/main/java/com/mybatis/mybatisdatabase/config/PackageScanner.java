package com.mybatis.mybatisdatabase.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 包扫描
 * @Author xuz_Ben
 * @Date 2023/5/8
 */
@Configuration
public class PackageScanner {

    @Value("${mybatis-plus.page.scan}")
    private String packageScanner;

    
}
