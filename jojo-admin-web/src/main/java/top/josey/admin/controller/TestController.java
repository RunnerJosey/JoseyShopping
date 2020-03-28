package top.josey.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.josey.admin.service.TestService;

@Controller
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping("/date")
    @ResponseBody
    public String queryCurrentDate(){
        return testService.queryCurrentData();
    }
}
