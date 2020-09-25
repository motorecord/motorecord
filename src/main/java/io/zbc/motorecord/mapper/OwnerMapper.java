/*
*
* OwnerMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-09-25
*/
package io.zbc.motorecord.mapper;

import io.zbc.motorecord.model.Owner;
import java.util.List;

public interface OwnerMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Integer ownerId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(Owner record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    Owner selectByPrimaryKey(Integer ownerId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<Owner> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(Owner record);
}