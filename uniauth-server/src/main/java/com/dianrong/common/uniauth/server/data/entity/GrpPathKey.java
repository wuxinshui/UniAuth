package com.dianrong.common.uniauth.server.data.entity;

public class GrpPathKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grp_path.ancestor
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    private Integer ancestor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grp_path.descendant
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    private Integer descendant;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column grp_path.ancestor
     *
     * @return the value of grp_path.ancestor
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Integer getAncestor() {
        return ancestor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grp_path.ancestor
     *
     * @param ancestor the value for grp_path.ancestor
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setAncestor(Integer ancestor) {
        this.ancestor = ancestor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grp_path.descendant
     *
     * @return the value of grp_path.descendant
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Integer getDescendant() {
        return descendant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grp_path.descendant
     *
     * @param descendant the value for grp_path.descendant
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setDescendant(Integer descendant) {
        this.descendant = descendant;
    }
}