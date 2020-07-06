package com.qifenqian.bms.meeting.winShow.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.qifenqian.bms.meeting.winShow.bean.BasePrize;
import com.qifenqian.bms.meeting.winShow.bean.BasePrizeExample;

@MapperScan
public interface BasePrizeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int countByExample(BasePrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int deleteByExample(BasePrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int deleteByPrimaryKey(Integer prizeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int insert(BasePrize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int insertSelective(BasePrize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    List<BasePrize> selectByExample(BasePrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    BasePrize selectByPrimaryKey(Integer prizeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int updateByExampleSelective(@Param("record") BasePrize record, @Param("example") BasePrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int updateByExample(@Param("record") BasePrize record, @Param("example") BasePrizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int updateByPrimaryKeySelective(BasePrize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_prize
     *
     * @mbggenerated Tue Jan 05 20:41:06 CST 2016
     */
    int updateByPrimaryKey(BasePrize record);
}