package top.josey.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.josey.admin.mapper.TestMapper;
import top.josey.admin.service.TestService;
@Service
public class TestMapperServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;
    @Override
    public String queryCurrentData() {
        return testMapper.queryCurrentData();
    }
}
