package com.it.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import java.sql.Timestamp;

/**
 * @author YangHaixiong
 * @date 2023/12/25 21:53
 */

@Component
public class DateMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("gmtCreate", new Timestamp(System.currentTimeMillis()), metaObject);
        this.setFieldValByName("gmtModified", new Timestamp(System.currentTimeMillis()), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("gmtModified", new Timestamp(System.currentTimeMillis()), metaObject);
    }
}
