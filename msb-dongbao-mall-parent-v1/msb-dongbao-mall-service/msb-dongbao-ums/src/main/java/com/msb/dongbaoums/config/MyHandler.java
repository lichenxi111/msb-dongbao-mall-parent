package com.msb.dongbaoums.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Auther: li
 * @Date: 2022/5/19 - 05 - 19 - 18:01
 * @Description: com.msb.dongbaoums.config
 * @version: 1.0
 */
@Component
public class MyHandler {
    @Bean
    public MetaObjectHandler metaObjectHandler(){
        return new MetaObjectHandler() {
            @Override
            public void insertFill(MetaObject metaObject) {
                System.out.println("insert时间");
                this.setFieldValByName("createTime", new Date(), metaObject);
                this.setFieldValByName("loginTime", new Date(), metaObject);

            }

            @Override
            public void updateFill(MetaObject metaObject) {
                System.out.println("update时间");
                this.setFieldValByName("loginTime", new Date(), metaObject);
            }
        };
    }

}
