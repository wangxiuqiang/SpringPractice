package cn.ssm.service.impl;

import cn.ssm.dao.Query;
import cn.ssm.service.MoviesQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("moviesQueryImpl")
public class MoviesQueryImpl implements MoviesQuery {

    @Autowired
    Query query;

    @Override
    public String queryMovies() {
       String name = query.queryName();
        return name;
    }
}
