package com.msb.dongbaoums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.dongbaoums.entity.UmsMember;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户表(UmsMember)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-19 15:23:01
 */
@Mapper
public interface UmsMemberMapper extends BaseMapper<UmsMember> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMember queryById(Long id);



    /**
     * 统计总行数
     *
     * @param umsMember 查询条件
     * @return 总行数
     */
    long count(UmsMember umsMember);

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 影响行数
     */
    int insert1(UmsMember umsMember);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsMember> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UmsMember> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsMember> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UmsMember> entities);

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 影响行数
     */
    int update(UmsMember umsMember);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

