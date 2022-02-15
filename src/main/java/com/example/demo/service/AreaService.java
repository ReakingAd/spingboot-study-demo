package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    boolean addArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
