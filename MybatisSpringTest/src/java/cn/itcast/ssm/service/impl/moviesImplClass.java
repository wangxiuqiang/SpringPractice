package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.moviesQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class moviesImplClass implements moviesQuery{
      @Autowired
      moviesQuery moviesQuery;


      public String queryInfo() throws Exception {
          String name =  moviesQuery.queryInfo();
            return name;
      }
}
