package com.cya.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cya.entity.Person;
import com.cya.service.IPersonService;

@Controller
@ResponseBody
public class Test {

    @Resource
    private IPersonService personServiceImpl;

    @RequestMapping("test")
    public List<Person> getPerson() {
      return personServiceImpl.getPerson();
    }
}

