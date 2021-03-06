package com.jk.model;

import java.util.Date;

/**
 * 管理员表
 */
public class Administrators {
    /**
     * 管理员详情表id
     * This field corresponds to the database column t_administrators.details_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String detailsId;

    /**
     * 用户id
     * This field corresponds to the database column t_administrators.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String userId;

    /**
     * 管理员名称
     * This field corresponds to the database column t_administrators.administrators_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String administratorsName;

    /**
     * 1:男;2:女
     * This field corresponds to the database column t_administrators.is_sex
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Boolean sex;

    /**
     * 管理员邮箱
     * This field corresponds to the database column t_administrators.administrators_mail
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String administratorsMail;

    /**
     * 手机号码
     * This field corresponds to the database column t_administrators.administrators_phone
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String administratorsPhone;

    /**
     * 创建时间
     * This field corresponds to the database column t_administrators.create_date
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Date createDate;

    /**
     * 工号
     * This field corresponds to the database column t_administrators.job_number
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String jobNumber;

    /**
     * 头像
     * This field corresponds to the database column t_administrators.head_portrait
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String headPortrait;

    /**
     * 1:已用;2:未用
     * This field corresponds to the database column t_administrators.is_status
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.details_id
     *
     * @return the value of t_administrators.details_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getDetailsId() {
        return detailsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.details_id
     *
     * @param detailsId the value for t_administrators.details_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId == null ? null : detailsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.user_id
     *
     * @return the value of t_administrators.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.user_id
     *
     * @param userId the value for t_administrators.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.administrators_name
     *
     * @return the value of t_administrators.administrators_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getAdministratorsName() {
        return administratorsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.administrators_name
     *
     * @param administratorsName the value for t_administrators.administrators_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setAdministratorsName(String administratorsName) {
        this.administratorsName = administratorsName == null ? null : administratorsName.trim();
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.administrators_mail
     *
     * @return the value of t_administrators.administrators_mail
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getAdministratorsMail() {
        return administratorsMail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.administrators_mail
     *
     * @param administratorsMail the value for t_administrators.administrators_mail
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setAdministratorsMail(String administratorsMail) {
        this.administratorsMail = administratorsMail == null ? null : administratorsMail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.administrators_phone
     *
     * @return the value of t_administrators.administrators_phone
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getAdministratorsPhone() {
        return administratorsPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.administrators_phone
     *
     * @param administratorsPhone the value for t_administrators.administrators_phone
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setAdministratorsPhone(String administratorsPhone) {
        this.administratorsPhone = administratorsPhone == null ? null : administratorsPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.create_date
     *
     * @return the value of t_administrators.create_date
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.create_date
     *
     * @param createDate the value for t_administrators.create_date
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.job_number
     *
     * @return the value of t_administrators.job_number
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.job_number
     *
     * @param jobNumber the value for t_administrators.job_number
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_administrators.head_portrait
     *
     * @return the value of t_administrators.head_portrait
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_administrators.head_portrait
     *
     * @param headPortrait the value for t_administrators.head_portrait
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}