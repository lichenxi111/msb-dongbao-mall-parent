package com.msb.dongbaoums.service;


import com.msb.dongbaoums.entity.UmsMember;
import com.msb.dongbaoums.entity.dto.UmsMemberDto;
import org.springframework.stereotype.Service;

/**
 * 后台用户表(UmsMember)表服务接口
 *
 * @author makejava
 * @since 2022-05-19 15:23:03
 */
@Service
public interface UmsMemberService {



    /**
     * 注册用户
     *
     * @param umsMemberDto 传入的用户数据
     * @return 处理信息
     */
    Integer insert(UmsMemberDto umsMemberDto);

    /**
     * 修改数据
     *
     * @param  umsMemberDto 实例对象
     * @return 实例对象
     */
    Integer update(UmsMemberDto umsMemberDto);



    /**
     * 根据用户名和密码登录
     * @param umsMemberDto 用户传入的登录名和密码
     * @return 处理信息：是否成功
     */
    boolean login(UmsMemberDto umsMemberDto);
}
