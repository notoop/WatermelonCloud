package com.cuit.WatermelonCloud.mapper;

import com.cuit.WatermelonCloud.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author X to Y
 * @date 2021/7/4-15:20
 *  用户相关功能持久层
 */

@Mapper
@Repository
public interface IUserDao {

    //根据用户名查询启用状态的用户
    @Select("select * from UserInfo " +
            " where ui_username = #{uiName} and ui_status = 1;")
    UserInfo getUserByUsername(String username);

    //修改密码
    @Update("update UserInfo " +
            "set ui_pwd = #{newPassword} " +
            "where ui_username = #{username};")
    int updatePassword(String username, String newPassword);

}
