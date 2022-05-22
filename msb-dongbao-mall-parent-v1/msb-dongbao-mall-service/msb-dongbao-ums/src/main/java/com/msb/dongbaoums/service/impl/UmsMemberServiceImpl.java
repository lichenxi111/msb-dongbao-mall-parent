package com.msb.dongbaoums.service.impl;

import com.msb.dongbaoums.entity.UmsMember;
import com.msb.dongbaoums.entity.dto.UmsMemberDto;
import com.msb.dongbaoums.util.MyEntityConvert;

import com.msb.dongbaoums.mapper.UmsMemberMapper;

import com.msb.dongbaoums.service.UmsMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 后台用户表(UmsMember)表服务实现类
 *
 * @author makejava
 * @since 2022-05-19 15:23:03
 */
@Service("umsMemberService")
public class UmsMemberServiceImpl implements UmsMemberService {

    @Resource
    private UmsMemberMapper umsMemberMapper;
    @Autowired
    private MyEntityConvert myEntityConvert;
    @Autowired
    private PasswordEncoder passwordEncoder;


    /**
     * 注册用户
     *
     * @param umsMember 传入的用户信息
     * @return 处理信息
     */
    @Override
    public Integer insert(UmsMemberDto umsMemberDto) {
        UmsMember umsMember = myEntityConvert.umsMemberDtoToUmsMember(umsMemberDto);
        Integer insert = this.umsMemberMapper.insert(umsMember);
        return insert;
    }

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(UmsMemberDto umsMemberDto) {
//        UmsMember umsMember = myEntityConvert.umsMemberDtoToUmsMember(umsMemberDto);
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMemberDto,umsMember);
        int update = this.umsMemberMapper.update(umsMember);
        return update;
    }

    /**
     * 根据用户名和密码登录
     * @param umsMemberDto 用户传入的登录名和密码
     * @return 处理信息：是否成功
     */
    @Override
    public boolean login(UmsMemberDto umsMemberDto) {
        //验证用户名和密码是否正确
        UmsMember umsMember = umsMemberMapper.selectByUsername(umsMemberDto.getUsername());
        if (null != umsMember){
            String passwordDb = umsMember.getPassword();
            if (!passwordEncoder.matches(umsMemberDto.getPassword(),passwordDb)){
                return false;
            }
        }else {
            return false;
        }
        //验证通过后，更新最紧登录时间(这里的更新时间不是关键的，所以可以用消息队列，但是需要立马返回登录成功的信息)
        int update = umsMemberMapper.updateById(umsMember);
        System.out.println(update);
        return true;
    }
}
