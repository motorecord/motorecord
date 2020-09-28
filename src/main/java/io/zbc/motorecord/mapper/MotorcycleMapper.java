package io.zbc.motorecord.mapper;

import io.zbc.motorecord.model.Motorcycle;
import java.util.List;

public interface MotorcycleMapper {
    int deleteByPrimaryKey(Integer motorId);

    int insert(Motorcycle record);

    Motorcycle selectByPrimaryKey(Integer motorId);

    List<Motorcycle> selectAll();

    int updateByPrimaryKey(Motorcycle record);
}