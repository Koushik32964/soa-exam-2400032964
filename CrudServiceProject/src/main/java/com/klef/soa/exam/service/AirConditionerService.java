
package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.AirConditionerServiceEntity;

public interface AirConditionerService {

    AirConditionerServiceEntity add(
        AirConditionerServiceEntity entity);

    List<AirConditionerServiceEntity> displayAll();

    boolean deleteById(Long id);
}
