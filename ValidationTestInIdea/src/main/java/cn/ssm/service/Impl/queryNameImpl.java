package cn.ssm.service.Impl;

import cn.ssm.service.queryName;
import cn.ssm.dao.mapper;
import jdk.nashorn.internal.runtime.ECMAException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("queryNameImpl")
public class queryNameImpl  implements queryName {

    @Autowired
    mapper mapper;

    @Override
    public String queryNameFromMovies() throws Exception{
        String name = null;
        name = mapper.queryName();
        return name;
    }
}
