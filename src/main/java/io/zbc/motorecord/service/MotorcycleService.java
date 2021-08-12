package io.zbc.motorecord.service;

import io.zbc.motorecord.dao.MotorcycleMapper;
import io.zbc.motorecord.dao.OwnerMapper;
import io.zbc.motorecord.entity.Motorcycle;
import io.zbc.motorecord.entity.Owner;
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
