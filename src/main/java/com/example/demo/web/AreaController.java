package com.example.demo.web;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value="/listarea", method = RequestMethod.GET)
    private Map<String, Object> listArea(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Area> list = areaService.queryArea();
        modelMap.put("areaList", list);
        System.out.println(modelMap.toString());
        return modelMap;
    }
}
