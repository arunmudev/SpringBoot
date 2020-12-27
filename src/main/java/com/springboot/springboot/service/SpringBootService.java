package com.springboot.springboot.service;

import java.util.List;

import com.springboot.springboot.model.SpringBootModel;

public interface SpringBootService {
    
    public boolean insertData();

    public boolean updateData();

    public boolean deleteData();

    public List<SpringBootModel> fetchData();

    public List<SpringBootModel> searchData();
}
