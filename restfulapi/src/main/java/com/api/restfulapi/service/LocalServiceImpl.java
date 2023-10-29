package com.api.restfulapi.service;

import com.api.restfulapi.entity.Local;
import com.api.restfulapi.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements LocalService{

    @Autowired
    LocalRepository localRepository;

    @Override
    public List<Local> findAllLocals() {
        return localRepository.findAll();
    }
}
