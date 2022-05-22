package com.msb.dongbao.portal.web.controller;

import com.msb.dongbaoums.entity.dto.UmsMemberDto;
import com.msb.dongbaoums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 后台用户表(UmsMember)表控制层
 *
 * @author makejava
 * @since 2022-05-19 15:23:00
 */
@RestController
@RequestMapping("/umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Autowired
    private UmsMemberService umsMemberService;

    /**
     * 获取验证码
     * @return
     */
    @GetMapping("/get-captcha")
    public String getCaptcha(){

        return "获取验证码";
    }

    /**
     * 注册用户
     * @param umsMemberDto 传入的用户信息
     * @return 处理信息
     */

    @PostMapping("/register")
    public Integer addUser(@RequestBody  UmsMemberDto umsMemberDto){
        Integer insert = umsMemberService.insert(umsMemberDto);
        return insert;
    }
   /* public Integer addUser(String username,String password){
        UmsMemberDto umsMemberDto = new UmsMemberDto();
        umsMemberDto.setUsername(username);
        umsMemberDto.setPassword(password);
        Integer insert = umsMemberService.insert(umsMemberDto);
        return insert;
    }*/

    /**
     * 根据用户名和密码登录
     * @param umsMemberDto 传入的用户名和密码
     * @return 处理信息：是否成功
     */
    @PostMapping("/login")
   public String loginUser(@RequestBody UmsMemberDto umsMemberDto){
        System.out.println(umsMemberDto);
        boolean login = umsMemberService.login(umsMemberDto);
        if (!login) {
            return "用户名或密码错误，请确认";
        }
        return "success";
   }
}

