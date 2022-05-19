package com.msb.dongbaoums.service.impl;

import com.msb.dongbaoums.config.MyHandler;
import com.msb.dongbaoums.entity.UmsMember;
import com.msb.dongbaoums.mapper.UmsMemberMapper;
import com.msb.dongbaoums.service.UmsMemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMember queryById(Long id) {
        return this.umsMemberMapper.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMember insert(UmsMember umsMember) {
        this.umsMemberMapper.insert1(umsMember);
        return umsMember;
    }

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMember update(UmsMember umsMember) {
        this.umsMemberMapper.update(umsMember);
        return this.queryById(umsMember.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberMapper.deleteById(id) > 0;
    }
}
