package com.springboot.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.springboot.springboot.model.SpringBootModel;

import org.springframework.stereotype.Service;

@Service
public class SpringBootServiceImple implements SpringBootService {

    @Override
    public boolean insertData() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateData() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteData() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<SpringBootModel> fetchData() {
        List<SpringBootModel> list = new ArrayList<>();
        list.add(new SpringBootModel(1,"Arun",10));
        list.add(new SpringBootModel(1,"Arun",10));
        return list;
    }

    @Override
    public List<SpringBootModel> searchData() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
