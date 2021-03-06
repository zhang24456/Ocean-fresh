package com.jk.model;

/**
 * 规格参数表
 */
public class Specification {
    /**
     * 规格参数表id
     * This field corresponds to the database column t_specification.specification_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String specificationId;

    /**
     * 规格编码
     * This field corresponds to the database column t_specification.specification_coding
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String specificationCoding;

    /**
     * 规格
     * This field corresponds to the database column t_specification.specification_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String specificationName;

    /**
     * 原价
     * This field corresponds to the database column t_specification.specification_


     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Double specifiOriginalprice;



    /**
     * 售价
     * This field corresponds to the database column t_specification.

specification_saleprice
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Double specificationSaleprice;

    /**
     * 库存
     * This field corresponds to the database column t_specification.specification_inventory
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Integer specificationInventory;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_specification.specification_id
     *
     * @return the value of t_specification.specification_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getSpecificationId() {
        return specificationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_specification.specification_id
     *
     * @param specificationId the value for t_specification.specification_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId == null ? null : specificationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_specification.specification_coding
     *
     * @return the value of t_specification.specification_coding
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getSpecificationCoding() {
        return specificationCoding;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_specification.specification_coding
     *
     * @param specificationCoding the value for t_specification.specification_coding
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setSpecificationCoding(String specificationCoding) {
        this.specificationCoding = specificationCoding == null ? null : specificationCoding.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_specification.specification_name
     *
     * @return the value of t_specification.specification_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getSpecificationName() {
        return specificationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_specification.specification_name
     *
     * @param specificationName the value for t_specification.specification_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName == null ? null : specificationName.trim();
    }

    public Double getSpecifiOriginalprice() {
        return specifiOriginalprice;
    }

    public void setSpecifiOriginalprice(Double specifiOriginalprice) {
        this.specifiOriginalprice = specifiOriginalprice;
    }

    public Double getSpecificationSaleprice() {
        return specificationSaleprice;
    }

    public void setSpecificationSaleprice(Double specificationSaleprice) {
        this.specificationSaleprice = specificationSaleprice;
    }

    public Integer getSpecificationInventory() {
        return specificationInventory;
    }

    public void setSpecificationInventory(Integer specificationInventory) {
        this.specificationInventory = specificationInventory;
    }
}