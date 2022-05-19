package com.msb.dongbaoums.controller;

import com.msb.dongbaoums.entity.UmsMember;
import com.msb.dongbaoums.service.UmsMemberService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 后台用户表(UmsMember)表控制层
 *
 * @author makejava
 * @since 2022-05-19 15:23:00
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMember> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMember 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMember> add(UmsMember umsMember) {
        return ResponseEntity.ok(this.umsMemberService.insert(umsMember));
    }

    /**
     * 编辑数据
     *
     * @param umsMember 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMember> edit(UmsMember umsMember) {
        return ResponseEntity.ok(this.umsMemberService.update(umsMember));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberService.deleteById(id));
    }

}

