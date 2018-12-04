package com.jk.model;

/**
 * 商品表
 */
public class Goods {
    /**
     * 商品id
     * This field corresponds to the database column t_goods.goods_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String goodsId;

    /**
     * 商品名称
     * This field corresponds to the database column t_goods.goods_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String goodsName;

    /**
     * 商品价格
     * This field corresponds to the database column t_goods.goods_price
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String goodsPrice;

    /**
     * 商品图片
     * This field corresponds to the database column t_goods.goods_img
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String goodsImg;

    /**
     * 商品简述
     * This field corresponds to the database column t_goods.goods_sketch
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String goodsSketch;

    /**
     * 商品状态
     * This field corresponds to the database column t_goods.goods_state
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer goodsState;

    /**
     * 商品销量
     * This field corresponds to the database column t_goods.goods_sales
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer goodsSales;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_id
     *
     * @return the value of t_goods.goods_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_id
     *
     * @param goodsId the value for t_goods.goods_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_name
     *
     * @return the value of t_goods.goods_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_name
     *
     * @param goodsName the value for t_goods.goods_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_price
     *
     * @return the value of t_goods.goods_price
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_price
     *
     * @param goodsPrice the value for t_goods.goods_price
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_img
     *
     * @return the value of t_goods.goods_img
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getGoodsImg() {
        return goodsImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_img
     *
     * @param goodsImg the value for t_goods.goods_img
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_sketch
     *
     * @return the value of t_goods.goods_sketch
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getGoodsSketch() {
        return goodsSketch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_sketch
     *
     * @param goodsSketch the value for t_goods.goods_sketch
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setGoodsSketch(String goodsSketch) {
        this.goodsSketch = goodsSketch == null ? null : goodsSketch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_state
     *
     * @return the value of t_goods.goods_state
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Integer getGoodsState() {
        return goodsState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_goods.goods_state
     *
     * @param goodsState the value for t_goods.goods_state
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }
}