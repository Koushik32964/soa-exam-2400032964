package com.klef.soa.exam.service;

import com.klef.soa.exam.entity.AirConditionerServiceEntity;
import java.util.List;

public interface AirConditionerService {

    AirConditionerServiceEntity add(
        AirConditionerServiceEntity entity);

    List<AirConditionerServiceEntity> getAll();

    boolean deleteById(Long id);
}