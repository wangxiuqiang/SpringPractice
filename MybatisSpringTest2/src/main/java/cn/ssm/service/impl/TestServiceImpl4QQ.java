package cn.ssm.service.impl;

import cn.ssm.mapper.mapperQuery;
import cn.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService4qq")
public class TestServiceImpl4QQ implements TestService {

    @Autowired
    mapperQuery mapperQuery;

    public void test() {
        System.out.println("test service QQ");
        System.out.println(mapperQuery.query());
    }
}
