package com.dianrong.common.uniauth.server.data.entity;

public class UserRoleKey {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * user_role.user_id
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * user_role.role_id
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    private Integer roleId;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column user_role.user_id
     *
     * @return the value of user_role.user_id
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column user_role.user_id
     *
     * @param userId the value for user_role.user_id
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column user_role.role_id
     *
     * @return the value of user_role.role_id
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column user_role.role_id
     *
     * @param roleId the value for user_role.role_id
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
