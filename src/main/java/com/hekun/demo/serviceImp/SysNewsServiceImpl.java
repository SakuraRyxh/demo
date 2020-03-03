package com.hekun.demo.serviceImp;

import com.hekun.demo.dao.SysNewsDao;
import com.hekun.demo.service.SysNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class SysNewsServiceImpl implements SysNewsService {
    @Autowired
    private SysNewsDao sysNewsDao;
    @Override
    public List<Map<String, Object>> findObjects() {
        List<Map<String, Object>> list = sysNewsDao.findObjects();
        return list;
    }
}
