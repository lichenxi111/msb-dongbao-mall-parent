package com.msb.dongbaoums.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户表(UmsMember)实体类
 *
 * @author makejava
 * @since 2022-05-19 15:23:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ums_member")
public class UmsMember implements Serializable {
    private static final long serialVersionUID = -17060734951300675L;
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    
    private String username;
    
    private String password;
    /**
     * 头像
     */
    private String icon;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 备注信息
     */
    private String note;
    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * 最后登录时间
     */
    @TableField(value = "login_time",fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginTime;
    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    private Integer status;




}

