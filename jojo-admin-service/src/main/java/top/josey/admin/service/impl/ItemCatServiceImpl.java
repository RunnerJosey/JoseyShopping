package top.josey.admin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.josey.admin.mapper.ItemCatMapper;
import top.josey.admin.pojo.ItemCat;
import top.josey.admin.service.ItemService;

import java.util.List;
@Service
public class ItemCatServiceImpl implements ItemService {
    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<ItemCat> findItemCatByPage(Integer page, Integer row) {
        Page<Object> objects = PageHelper.startPage(page, row);
        itemCatMapper.selectAll();
        //to do
        return null;
    }
}
