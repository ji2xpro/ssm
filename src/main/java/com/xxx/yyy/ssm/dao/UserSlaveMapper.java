package com.xxx.yyy.ssm.dao;

import com.xxx.yyy.ssm.model.UserSlave;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserSlaveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sun Jun 19 19:45:13 CST 2022
     */
    @Delete({
        "delete from sys_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sun Jun 19 19:45:13 CST 2022
     */
    @Insert({
        "insert into sys_user (id, userName, ",
        "password, age)",
        "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{age,jdbcType=TINYINT})"
    })
    int insert(UserSlave record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sun Jun 19 19:45:13 CST 2022
     */
    int insertSelective(UserSlave record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sun Jun 19 19:45:13 CST 2022
     */
    @Select({
        "select",
        "id, userName, password, age",
        "from sys_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.xxx.yyy.ssm.dao.UserSlaveMapper.BaseResultMap")
    UserSlave selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sun Jun 19 19:45:13 CST 2022
     */
    int updateByPrimaryKeySelective(UserSlave record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sun Jun 19 19:45:13 CST 2022
     */
    @Update({
        "update sys_user",
        "set userName = #{userName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserSlave record);

    List<UserSlave> selectAllUserSlave();
}