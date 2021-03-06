package com.jk.model;

/**
 * 广告位表
 */
public class Adpositionid {
    /**
     * 广告位id
     * This field corresponds to the database column t_adpositionid.adPositionId_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String adpositionidId;

    /**
     * 所属页面
     * This field corresponds to the database column t_adpositionid.Their_page
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String theirPage;

    /**
     * 插入方式
     * This field corresponds to the database column t_adpositionid.insert_type
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer insertType;

    /**
     * 在线广告数
     * This field corresponds to the database column t_adpositionid.online_advertisement_count
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer onlineAdvertisementCount;

    /**
     * 排期广告数
     * This field corresponds to the database column t_adpositionid.scheduling_advertising_count
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer schedulingAdvertisingCount;

    /**
     * 广告位描述
     * This field corresponds to the database column t_adpositionid.describe
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String describe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_adpositionid.adPositionId_id
     *
     * @return the value of t_adpositionid.adPositionId_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getAdpositionidId() {
        return adpositionidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_adpositionid.adPositionId_id
     *
     * @param adpositionidId the value for t_adpositionid.adPositionId_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setAdpositionidId(String adpositionidId) {
        this.adpositionidId = adpositionidId == null ? null : adpositionidId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_adpositionid.Their_page
     *
     * @return the value of t_adpositionid.Their_page
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getTheirPage() {
        return theirPage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_adpositionid.Their_page
     *
     * @param theirPage the value for t_adpositionid.Their_page
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setTheirPage(String theirPage) {
        this.theirPage = theirPage == null ? null : theirPage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_adpositionid.insert_type
     *
     * @return the value of t_adpositionid.insert_type
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Integer getInsertType() {
        return insertType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_adpositionid.insert_type
     *
     * @param insertType the value for t_adpositionid.insert_type
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setInsertType(Integer insertType) {
        this.insertType = insertType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_adpositionid.online_advertisement_count
     *
     * @return the value of t_adpositionid.online_advertisement_count
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Integer getOnlineAdvertisementCount() {
        return onlineAdvertisementCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_adpositionid.online_advertisement_count
     *
     * @param onlineAdvertisementCount the value for t_adpositionid.online_advertisement_count
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setOnlineAdvertisementCount(Integer onlineAdvertisementCount) {
        this.onlineAdvertisementCount = onlineAdvertisementCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_adpositionid.scheduling_advertising_count
     *
     * @return the value of t_adpositionid.scheduling_advertising_count
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Integer getSchedulingAdvertisingCount() {
        return schedulingAdvertisingCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_adpositionid.scheduling_advertising_count
     *
     * @param schedulingAdvertisingCount the value for t_adpositionid.scheduling_advertising_count
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setSchedulingAdvertisingCount(Integer schedulingAdvertisingCount) {
        this.schedulingAdvertisingCount = schedulingAdvertisingCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_adpositionid.describe
     *
     * @return the value of t_adpositionid.describe
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_adpositionid.describe
     *
     * @param describe the value for t_adpositionid.describe
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}