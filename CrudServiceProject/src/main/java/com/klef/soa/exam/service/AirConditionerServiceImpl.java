package com.klef.soa.exam.service;

import com.klef.soa.exam.entity.AirConditionerServiceEntity;
import com.klef.soa.exam.repository.AirConditionerServiceRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AirConditionerServiceImpl
        implements AirConditionerService {

    private final AirConditionerServiceRepository repository;

    public AirConditionerServiceImpl(AirConditionerServiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public AirConditionerServiceEntity add(
            AirConditionerServiceEntity entity) {

        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public List<AirConditionerServiceEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public boolean deleteById(Long id) {

        if (!repository.existsById(id)) {
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}