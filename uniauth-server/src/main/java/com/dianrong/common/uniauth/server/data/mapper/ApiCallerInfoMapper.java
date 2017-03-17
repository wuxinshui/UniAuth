package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.ApiCallerInfo;
import com.dianrong.common.uniauth.server.data.entity.ApiCallerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiCallerInfoMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int countByExample(ApiCallerInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int deleteByExample(ApiCallerInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int insert(ApiCallerInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int insertSelective(ApiCallerInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    List<ApiCallerInfo> selectByExample(ApiCallerInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    ApiCallerInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByExampleSelective(@Param("record") ApiCallerInfo record, @Param("example") ApiCallerInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByExample(@Param("record") ApiCallerInfo record, @Param("example") ApiCallerInfoExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByPrimaryKeySelective(ApiCallerInfo record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * api_caller_info
     *
     * @mbggenerated Mon Jan 23 17:45:27 CST 2017
     */
    int updateByPrimaryKey(ApiCallerInfo record);

    /**
     * search ApiCallerInfo by account
     * 
     * @param account domainCode
     * @return ApiCallerInfo list
     */
    List<ApiCallerInfo> searchApiCaller(String account);
}
