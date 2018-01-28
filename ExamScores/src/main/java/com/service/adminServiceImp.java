package com.service;

import com.domain.Join;

import java.util.List;

/**
 * Created by wxq on 17-9-19.
 */
public interface adminServiceImp {
    public Join adminJoin();
    public int  addInformation();
    public int deleteInformation();
    public int updateInformation();
    public List queryInformation();
}
