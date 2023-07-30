package com.hwh.restaurant;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author hwh
 * @description:mp代码生成器
 * @create 2023-07-24 21:55
 */
public class FastAutoGeneratorTest {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/restaurant? serverTimezone=UTC",
                        "root", "12345678")
                .globalConfig(builder -> {
                    builder.author("hwh") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://java_code//Restaurant//src//main//java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.hwh") // 设置父包名
                            .moduleName("restaurant") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://java_code//Restaurant//src//main//resources//mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("restaurant_foot,restaurant_foot_property,restaurant_foot_type,restaurant_order,restaurant_order_detail,restaurant_shopping_trolley,restaurant_shopping_trolley_detail") // 设置需要生成的表名
                            .addTablePrefix("restaurant_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
