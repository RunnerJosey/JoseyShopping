package top.josey.admin.service;

import top.josey.admin.pojo.ItemCat;

import java.util.List;

public interface ItemService {
    public List<ItemCat> findItemCatByPage(Integer page,Integer row);
}
