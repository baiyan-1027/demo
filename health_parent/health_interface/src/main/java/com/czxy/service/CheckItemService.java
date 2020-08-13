package com.czxy.service;

import com.czxy.entity.PageResult;
import com.czxy.entity.QueryPageBean;
import com.czxy.pojo.CheckItem;

//服务接口
public interface CheckItemService {
    public void add(CheckItem checkItem);
    public PageResult pageQuery(QueryPageBean queryPageBean);
    public void deleteById(Integer id);
    public void edit(CheckItem checkItem);
    public CheckItem findById(Integer id);
}
