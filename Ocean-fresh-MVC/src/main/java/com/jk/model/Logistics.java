package com.jk.model;

import java.util.Date;

/**
 * 物流表
 */
public class Logistics {
    /**
     * 物流表Id
     * This field corresponds to the database column t_logistics.logistics_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String logisticsId;

    /**
     * 订单id
     * This field corresponds to the database column t_logistics.indent_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String indentId;

    /**
     * 发货时间
     * This field corresponds to the database column t_logistics.delivery_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Date deliveryTime;

    /**
     * 收货时间
     * This field corresponds to the database column t_logistics.receiving_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Date receivingTime;

    /**
     * 1:已发货;2:未发货;3:待收货;4:已发货
     * This field corresponds to the database column t_logistics.is_status
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_logistics.logistics_id
     *
     * @return the value of t_logistics.logistics_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getLogisticsId() {
        return logisticsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_logistics.logistics_id
     *
     * @param logisticsId the value for t_logistics.logistics_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId == null ? null : logisticsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_logistics.indent_id
     *
     * @return the value of t_logistics.indent_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getIndentId() {
        return indentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_logistics.indent_id
     *
     * @param indentId the value for t_logistics.indent_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setIndentId(String indentId) {
        this.indentId = indentId == null ? null : indentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_logistics.delivery_time
     *
     * @return the value of t_logistics.delivery_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_logistics.delivery_time
     *
     * @param deliveryTime the value for t_logistics.delivery_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_logistics.receiving_time
     *
     * @return the value of t_logistics.receiving_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Date getReceivingTime() {
        return receivingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_logistics.receiving_time
     *
     * @param receivingTime the value for t_logistics.receiving_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setReceivingTime(Date receivingTime) {
        this.receivingTime = receivingTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}