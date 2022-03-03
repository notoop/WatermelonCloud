package com.cuit.WatermelonCloud.mapper;

import com.cuit.WatermelonCloud.entity.Menu;
import com.cuit.WatermelonCloud.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author X to Y
 * @date 2021/7/3-23:40
 * 登录相关功能持久层类
 */

@Mapper
@Repository
public interface ILoginDao {

    //根据用户名查询启用状态的用户
    @Select("select * from UserInfo " +
            " where ui_username = #{username} and ui_status = 1;")
    UserInfo getUserByUsername(String username);

    //根据用户名查询所有注册过的用户
    @Select("select * from UserInfo " +
            " where ui_username = #{username}")
    UserInfo getUserByUsername2(String username);

    //更新用户最后登录时间
    @Update("update UserInfo \n" +
            "set ui_last_login=#{uiLastLogin} \n" +
            "WHERE ui_username = #{uiUsername}")
    Integer updateLastLogin(UserInfo user);

    //根据用户名获取用户类型
    @Select("select ui_isAdmin " +
            "from UserInfo " +
            "where ui_username = #{username}")
    Integer getUserTypeByUsername(String username);

    //获取用户类型和序号获取不同的菜单列表
    @Select("select * " +
            "from Menu " +
            "where m_user_type = #{userType} and m_type_order = #{order}")
    List<Menu> getMenuByUserOrder(Integer userType, Integer order);

    //修改密码
    @Update("update UserInfo " +
            "set ui_pwd = #{newPassword} " +
            "where ui_username = #{username};")
    int updatePassword(String username, String newPassword);

    //注册新用户
    @Insert("insert into UserInfo (ui_username,ui_name,ui_pwd,ui_mail,ui_create_time) " +
            "values(#{uiUsername},#{uiName},#{uiPwd},#{uiMail},#{uiCreateTime});")
    int addUser(UserInfo user);
}
