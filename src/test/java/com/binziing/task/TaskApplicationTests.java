package com.binziing.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskApplicationTests {

    // 日志的记录器
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void contextLoads() {
        // 日志级别由低到高trace<debug<info<warn<error
        // 可以调整输出的日志级别，日志就只会在这个级别及以后的高级别生效
        // Springboot默认使用info级别
        logger.trace("trace...");
        logger.debug("debug...");
        logger.info("info...");
        logger.warn("warn...");
        logger.error("error...");
    }

}
