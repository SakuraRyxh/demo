package com.hekun.demo.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface SysNewsService {
    List<Map<String,Object>> findObjects();
}
