package com.hekun.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hekun.demo.service.SysNewsService;
import com.hekun.demo.vo.JsonResult;

@RestController
@RequestMapping("/news/")
public class SysNewsController {
    @Autowired
    private SysNewsService sysNewsService;
    @RequestMapping("doFindObjects")
    public JsonResult doFindObjects() {

        return new JsonResult(sysNewsService.findObjects());
    }
}
