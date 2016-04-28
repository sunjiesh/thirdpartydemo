package cn.com.sunjiesh.thirdpartdemo.model;

import java.util.Date;

public class WechatReceiveMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.id
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.from_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private String fromUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.message_content
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private String messageContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.message_type
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private String messageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.status
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.create_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.create_time
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.update_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_receive_message.update_time
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.id
     *
     * @return the value of wechat_receive_message.id
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.id
     *
     * @param id the value for wechat_receive_message.id
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.from_user
     *
     * @return the value of wechat_receive_message.from_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public String getFromUser() {
        return fromUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.from_user
     *
     * @param fromUser the value for wechat_receive_message.from_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setFromUser(String fromUser) {
        this.fromUser = fromUser == null ? null : fromUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.message_content
     *
     * @return the value of wechat_receive_message.message_content
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.message_content
     *
     * @param messageContent the value for wechat_receive_message.message_content
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.message_type
     *
     * @return the value of wechat_receive_message.message_type
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.message_type
     *
     * @param messageType the value for wechat_receive_message.message_type
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.status
     *
     * @return the value of wechat_receive_message.status
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.status
     *
     * @param status the value for wechat_receive_message.status
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.create_user
     *
     * @return the value of wechat_receive_message.create_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.create_user
     *
     * @param createUser the value for wechat_receive_message.create_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.create_time
     *
     * @return the value of wechat_receive_message.create_time
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.create_time
     *
     * @param createTime the value for wechat_receive_message.create_time
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.update_user
     *
     * @return the value of wechat_receive_message.update_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.update_user
     *
     * @param updateUser the value for wechat_receive_message.update_user
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_receive_message.update_time
     *
     * @return the value of wechat_receive_message.update_time
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_receive_message.update_time
     *
     * @param updateTime the value for wechat_receive_message.update_time
     *
     * @mbggenerated Wed Apr 20 22:55:12 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}