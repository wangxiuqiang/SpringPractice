package cn.ssm.service.impl;

import cn.ssm.dao.mapperQuery;
import cn.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class TestServiceImpl implements TestService {

    @Autowired
    mapperQuery mapperQuery;

    public void test() {
        System.out.println("test service");
        System.out.println(mapperQuery.query());
    }
}
