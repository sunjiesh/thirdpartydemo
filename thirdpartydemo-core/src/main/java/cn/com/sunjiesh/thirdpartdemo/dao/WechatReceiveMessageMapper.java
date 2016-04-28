package cn.com.sunjiesh.thirdpartdemo.dao;

import cn.com.sunjiesh.thirdpartdemo.model.WechatReceiveMessage;
import cn.com.sunjiesh.thirdpartdemo.model.WechatReceiveMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatReceiveMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int countByExample(WechatReceiveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int deleteByExample(WechatReceiveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int insert(WechatReceiveMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int insertSelective(WechatReceiveMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    List<WechatReceiveMessage> selectByExample(WechatReceiveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    WechatReceiveMessage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int updateByExampleSelective(@Param("record") WechatReceiveMessage record, @Param("example") WechatReceiveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int updateByExample(@Param("record") WechatReceiveMessage record, @Param("example") WechatReceiveMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int updateByPrimaryKeySelective(WechatReceiveMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_receive_message
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    int updateByPrimaryKey(WechatReceiveMessage record);
}