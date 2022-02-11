package com.example.demo.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
//import org.junit.Test;
import com.example.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;
//    @Test
//    public void queryArea() {
//        List<Area> areaList = areaDao.queryArea();
//        assertEquals(2, areaList.size());
//    }
    @Test
    @Ignore
	public void testAQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		// 验证预期值和实际值是否相符
		assertEquals(4, areaList.size());
	}

    @Test
    @Ignore
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(4);
        assertEquals("nanyuan3333", area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("xiyuan");
        area.setPriority(1);
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("xxxxx");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(3);
        assertEquals(1, effectedNum);
    }
}