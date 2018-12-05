package com.jk.model;

import java.util.Date;

/**
 * 订单
 */
public class Indent {
    /**
     * 订单 id
     * This field corresponds to the database column t_indent.indent_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String indentId;

    /**
     * 下单时间
     * This field corresponds to the database column t_indent.indent_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Date indentTime;

    /**
     * 订单金额
     * This field corresponds to the database column t_indent.indent_money
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer indentMoney;

    /**
     * 支付方式
     * This field corresponds to the database column t_indent.payment
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String payment;

    /**
     * 订单状态 1:代付款;2:代发货;3:待收货;4:已收货;5退款
     * This field corresponds to the database column t_indent.indent_state
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer indentState;

    /**
     * 用户id
     * This field corresponds to the database column t_indent.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String userId;

    /**
     * 商品id
     * This field corresponds to the database column t_indent.goods_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String goodsId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_indent.indent_id
     *
     * @return the value of t_indent.indent_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getIndentId() {
        return indentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_indent.indent_id
     *
     * @param indentId the value for t_indent.indent_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setIndentId(String indentId) {
        this.indentId = indentId == null ? null : indentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_indent.indent_time
     *
     * @return the value of t_indent.indent_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Date getIndentTime() {
        return indentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_indent.indent_time
     *
     * @param indentTime the value for t_indent.indent_time
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setIndentTime(Date indentTime) {
        this.indentTime = indentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_indent.indent_money
     *
     * @return the value of t_indent.indent_money
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Integer getIndentMoney() {
        return indentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_indent.indent_money
     *
     * @param indentMoney the value for t_indent.indent_money
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setIndentMoney(Integer indentMoney) {
        this.indentMoney = indentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_indent.payment
     *
     * @return the value of t_indent.payment
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_indent.payment
     *
     * @param payment the value for t_indent.payment
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_indent.indent_state
     *
     * @return the value of t_indent.indent_state
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Integer getIndentState() {
        return indentState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_indent.indent_state
     *
     * @param indentState the value for t_indent.indent_state
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setIndentState(Integer indentState) {
        this.indentState = indentState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_indent.user_id
     *
     * @return the value of t_indent.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_indent.user_id
     *
     * @param userId the value for t_indent.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_indent.goods_id
     *
     * @return the value of t_indent.goods_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_indent.goods_id
     *
     * @param goodsId the value for t_indent.goods_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }
}