package cn.ssm.service;

import cn.ssm.dao.mapperQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class queryService {
    @Autowired
    public mapperQuery mapperQuery;

    public String queryName() {
        String name = mapperQuery.query();
        return name;
    }

}
