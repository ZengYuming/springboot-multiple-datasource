package com.example.springbootmultipledatasource.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 第二数据源
 * 生活缴费
 */
@Configuration
public class SecondDataSourceConfig {
    /**
     * 扫描spring.datasource.second开头的配置信息
     *
     * @return 数据源配置信息
     */
    @Bean(name = "secondDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.second")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * 获取从库数据源对象
     *
     * @param properties 注入名为secondDataSourceProperties的bean
     * @return 数据源对象
     */
    @Bean(name = "secondDataSource")
    public DataSource dataSource(@Qualifier("secondDataSourceProperties") DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().build();
    }

    /**
     * 该方法仅在需要使用JdbcTemplate对象时选用
     *
     * @param dataSource 注入名为secondDataSource的bean
     * @return 数据源JdbcTemplate对象
     */
    @Bean(name = "secondJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("secondDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
