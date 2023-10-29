package com.api.restfulapi.service;

import com.api.restfulapi.entity.Local;

import java.util.List;

public interface LocalService {

    List<Local> findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocal(Long id);
}
