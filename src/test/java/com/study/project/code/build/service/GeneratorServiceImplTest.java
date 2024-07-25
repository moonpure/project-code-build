package com.study.project.code.build.service;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.apache.ibatis.type.JdbcType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GeneratorServiceImplTest {

    @Test
    void buildCodegen() {
        FastAutoGenerator.create("jdbc:mysql://rm-2ze646jn2u65s0b4wyo.mysql.rds.aliyuncs.com:8306/saas_care", "kcalldev", "123456QAZwsx")
                .globalConfig(builder -> builder
                        .author("huangQiJun")
                        .outputDir( "/Users/huangqijun/tem/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.baomidou.mybatisplus")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableLombok()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}