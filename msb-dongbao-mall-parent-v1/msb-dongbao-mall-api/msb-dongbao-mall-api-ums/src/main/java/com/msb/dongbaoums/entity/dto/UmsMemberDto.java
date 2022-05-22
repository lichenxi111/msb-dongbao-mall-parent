package com.msb.dongbaoums.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: li
 * @Date: 2022/5/21 - 05 - 21 - 15:47
 * @Description: com.msb.dongbaoums.entity.dto
 * @version: 1.0
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UmsMemberDto {
    //private Long id;

    private String username;

    private String password;
    /**
     * 头像
     */
    private String icon;
    /**
     * 邮箱
     */
    //private String email;
    /**
     * 昵称
     */
    //private String nickName;
    /**
     * 备注信息
     */
    //private String note;
}
