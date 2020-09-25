/*
*
* UserMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-09-25
*/
package io.zbc.motorecord.mapper;

import io.zbc.motorecord.model.User;
import java.util.List;

public interface UserMapper {
    /**
     *
     * @mbg.generated 2020-09-25
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    User selectByPrimaryKey(Integer userId);

    /**
     *
     * @mbg.generated 2020-09-25
     */
    List<User> selectAll();

    /**
     *
     * @mbg.generated 2020-09-25
     */
    int updateByPrimaryKey(User record);
}