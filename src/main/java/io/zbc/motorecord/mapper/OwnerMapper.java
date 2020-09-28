package io.zbc.motorecord.mapper;

import io.zbc.motorecord.model.Owner;
import java.util.List;

public interface OwnerMapper {
    int deleteByPrimaryKey(Integer ownerId);

    int insert(Owner record);

    Owner selectByPrimaryKey(Integer ownerId);

    List<Owner> selectAll();

    int updateByPrimaryKey(Owner record);
}