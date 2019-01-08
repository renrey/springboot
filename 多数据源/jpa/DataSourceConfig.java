package com.m.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 获取数据源
 * @author rey
 */

@Configuration
public class DataSourceConfig {
    /**
     * 主數據源
     * 需要加@Primary
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    DataSource primaryDataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * hr數據源
     * @return
     */
    @Bean(name = "hrDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hr")
    DataSource hrDataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 佣金數據源
     * @return
     */
    @Bean(name = "yjdsDataSource")
    @ConfigurationProperties(prefix = "other.datasource.yjds")
    DataSource yjdsDataSource(){
        return DataSourceBuilder.create().build();
    }
}
