package io.zbc.motorecord.service;

import io.zbc.motorecord.mapper.MotorcycleMapper;
import io.zbc.motorecord.mapper.OwnerMapper;
import io.zbc.motorecord.model.Motorcycle;
import io.zbc.motorecord.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MotorcycleService {

    @Resource
    private OwnerMapper ownerMapper;

    @Resource
    private MotorcycleMapper motorcycleMapper;

    public List<Motorcycle> findMyMotorcycle(@RequestBody Integer userId) {
        List<Owner> owners = ownerMapper.selectByUserId(userId);
        Integer motorId = owners.get(0).getMotorId();
        List<Motorcycle> motorcycles = motorcycleMapper.selectByOwner(owners);
        return motorcycles;
    }
}
