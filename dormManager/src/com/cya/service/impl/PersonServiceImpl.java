package com.cya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cya.entity.Person;
import com.cya.mapper.IPersonMapper;
import com.cya.service.IPersonService;

@Service()
public class PersonServiceImpl implements IPersonService{

    @Autowired
    private IPersonMapper personMapperImpl;
    @Override
    public List<Person> getPerson() {
        // TODO Auto-generated method stub
        return  personMapperImpl.getPerson();
    }   

}
