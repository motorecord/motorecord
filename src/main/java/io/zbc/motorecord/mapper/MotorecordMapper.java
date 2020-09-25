/*
*
* MotorecordMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-09-25
*/
package io.zbc.motorecord.mapper;

import io.zbc.motorecord.model.Motorecord;
import java.util.List;

public interface MotorecordMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Integer recordId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(Motorecord record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    Motorecord selectByPrimaryKey(Integer recordId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<Motorecord> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(Motorecord record);
}