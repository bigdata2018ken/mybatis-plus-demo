package com.orm.demo.config;

import java.time.LocalDateTime;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");

        this.setFieldValByName( "created", LocalDateTime.now(), metaObject); // 起始版本 3.3.3(推荐)
        this.setFieldValByName( "updated", LocalDateTime.now(), metaObject); // 起始版本 3.3.3(推荐)
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "updated", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
    }
}