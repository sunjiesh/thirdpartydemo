package cn.com.sunjiesh.thirdpartdemo.dao;

import cn.com.sunjiesh.thirdpartdemo.model.AppUser;
import cn.com.sunjiesh.thirdpartdemo.model.AppUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int countByExample(AppUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int deleteByExample(AppUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int insert(AppUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int insertSelective(AppUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    List<AppUser> selectByExample(AppUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    AppUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int updateByExampleSelective(@Param("record") AppUser record, @Param("example") AppUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int updateByExample(@Param("record") AppUser record, @Param("example") AppUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int updateByPrimaryKeySelective(AppUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_user
     *
     * @mbggenerated Fri Oct 23 21:12:59 CST 2015
     */
    int updateByPrimaryKey(AppUser record);
}