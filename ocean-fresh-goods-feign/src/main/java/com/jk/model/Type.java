package com.jk.model;

/**
 * 分类表
 */
public class Type {
    /**
     * 分类id
     * This field corresponds to the database column t_type.type_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String typeId;

    /**
     * 分类名称
     * This field corresponds to the database column t_type.type_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String typeName;

    /**
     * This field was generated by pid
     * This field corresponds to the database column t_type.pid
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String pid;

    /**
     * 分类描述
     * This field corresponds to the database column t_type.type_info
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String typeInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.type_id
     *
     * @return the value of t_type.type_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.type_id
     *
     * @param typeId the value for t_type.type_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.type_name
     *
     * @return the value of t_type.type_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.type_name
     *
     * @param typeName the value for t_type.type_name
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.pid
     *
     * @return the value of t_type.pid
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.pid
     *
     * @param pid the value for t_type.pid
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_type.type_info
     *
     * @return the value of t_type.type_info
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getTypeInfo() {
        return typeInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_type.type_info
     *
     * @param typeInfo the value for t_type.type_info
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo == null ? null : typeInfo.trim();
    }
}