package cn.ssm.service.impl;

import cn.ssm.dao.mapperQuery;
import cn.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService4sina")
public class TestServiceImpl4Sina implements TestService {

    @Autowired
    mapperQuery mapperQuery;

    public void test() {
        System.out.println("test service Sina");
        System.out.println(mapperQuery.query());
    }
}
