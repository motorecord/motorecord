package io.zbc.motorecord.dao;

import io.zbc.motorecord.entity.Motorecord;
import java.util.List;

public interface MotorecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(Motorecord record);

    Motorecord selectByPrimaryKey(Integer recordId);

    List<Motorecord> selectAll();

    int updateByPrimaryKey(Motorecord record);
}