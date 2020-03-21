package com.paw.msdemo.controller;

import com.paw.msdemo.model.DataClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

@RestController
public class DemoService {
        @RequestMapping("/list/{name}/{id}")
        public List<DataClass> List(@PathVariable String name, @PathVariable int id)
    {
        return Collections.singletonList(DataClass.Create(name,id));
    }
}
