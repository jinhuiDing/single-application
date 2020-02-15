package com.gbicc.auth.mapper;


import com.gbicc.entity.SysRole;
import com.gbicc.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@org.apache.ibatis.annotations.Mapper

public interface RoleMapper extends Mapper<SysRole> {
    List<SysRole> findRoleByUser(@Param("user") SysUser user);
}