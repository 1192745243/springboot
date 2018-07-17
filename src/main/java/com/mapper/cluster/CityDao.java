package com.mapper.cluster;

import com.domain.City;
import org.apache.ibatis.annotations.Param;

/**
 * @author: will
 * @Date: 2018/7/12 17:08
 * @Description:
 */
public interface CityDao {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}
