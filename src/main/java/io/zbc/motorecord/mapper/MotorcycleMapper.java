/*
*
* MotorcycleMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-09-25
*/
package io.zbc.motorecord.mapper;

import io.zbc.motorecord.model.Motorcycle;
import java.util.List;

public interface MotorcycleMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Integer motorId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(Motorcycle record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    Motorcycle selectByPrimaryKey(Integer motorId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<Motorcycle> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(Motorcycle record);
}