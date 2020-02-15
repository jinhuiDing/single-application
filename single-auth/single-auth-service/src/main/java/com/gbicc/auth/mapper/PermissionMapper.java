package com.gbicc.auth.mapper;


import com.gbicc.entity.SysPermission;
import com.gbicc.entity.SysRole;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface PermissionMapper extends Mapper<SysPermission> {
    List<SysPermission> findPermissionByRole(SysRole role);

    List<SysPermission> selectAuthorityByUserId(@Param("userId") String userId);
}