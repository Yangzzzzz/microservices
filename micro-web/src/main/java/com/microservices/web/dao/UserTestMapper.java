package com.microservices.web.dao;

import com.yangz.web.pojo.UserTest;
import java.util.Date;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbggenerated
     */
    @Delete({
        "delete from user_test",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbggenerated
     */
    @Insert({
        "insert into user_test (user_id, user_name, ",
        "pass_word, create_time)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{passWord,jdbcType=VARCHAR}, #{createTime,jdbcType=DATE})"
    })
    int insert(UserTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbggenerated
     */
    @InsertProvider(type=UserTestSqlProvider.class, method="insertSelective")
    int insertSelective(UserTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "user_id, user_name, pass_word, create_time",
        "from user_test",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="user_id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="user_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pass_word", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_time", javaType=Date.class, jdbcType=JdbcType.DATE)
    })
    UserTest selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbggenerated
     */
    @UpdateProvider(type=UserTestSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_test
     *
     * @mbggenerated
     */
    @Update({
        "update user_test",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "pass_word = #{passWord,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=DATE}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserTest record);
}