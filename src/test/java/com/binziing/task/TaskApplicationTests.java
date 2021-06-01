package com.binziing.task;

import com.binziing.task.jooq.Tables;
import com.binziing.task.jooq.tables.daos.TAdminDao;
import com.binziing.task.jooq.tables.pojos.TAdmin;
import com.binziing.task.jooq.tables.records.TAdminRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectConditionStep;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskApplicationTests {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private TAdminDao adminDao;

    // 日志的记录器
    Logger logger = LoggerFactory.getLogger(this.getClass());

    private com.binziing.task.jooq.tables.TAdmin T_ADMIN = com.binziing.task.jooq.tables.TAdmin.T_ADMIN;

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

    @Test
    public void addTest(){
        TAdmin tAdmin = new TAdmin(7, "jooq", "mima", "jooq@.com");
        adminDao.insert(tAdmin);
    }

    @Test
    public void selectTest(){
        List<TAdmin> all = adminDao.findAll();
        System.out.println(all);
    }

    @Test
    public void dsl(){
        Result<TAdminRecord> fetch = dslContext.selectFrom(T_ADMIN).where("id=6").fetch();
        System.out.println(fetch);

    }

}
