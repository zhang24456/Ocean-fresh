package com.jk.model;

import java.util.Date;

/**
 * 回复表
 */
public class Reply {
    /**
     * 回复id
     * This field corresponds to the database column t_reply.reply_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String replyId;

    /**
     * 评论id
     * This field corresponds to the database column t_reply.comment_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String commentId;

    /**
     * 回复时间
     * This field corresponds to the database column t_reply.reply_date
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private Date replyDate;

    /**
     * 回复详情
     * This field corresponds to the database column t_reply.reply_details
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String replyDetails;

    /**
     * 管理员Id
     * This field corresponds to the database column t_reply.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_reply.reply_id
     *
     * @return the value of t_reply.reply_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getReplyId() {
        return replyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_reply.reply_id
     *
     * @param replyId the value for t_reply.reply_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_reply.comment_id
     *
     * @return the value of t_reply.comment_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_reply.comment_id
     *
     * @param commentId the value for t_reply.comment_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_reply.reply_date
     *
     * @return the value of t_reply.reply_date
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public Date getReplyDate() {
        return replyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_reply.reply_date
     *
     * @param replyDate the value for t_reply.reply_date
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_reply.reply_details
     *
     * @return the value of t_reply.reply_details
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getReplyDetails() {
        return replyDetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_reply.reply_details
     *
     * @param replyDetails the value for t_reply.reply_details
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setReplyDetails(String replyDetails) {
        this.replyDetails = replyDetails == null ? null : replyDetails.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_reply.user_id
     *
     * @return the value of t_reply.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_reply.user_id
     *
     * @param userId the value for t_reply.user_id
     *
     * @mbggenerated Tue Dec 04 15:42:25 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}