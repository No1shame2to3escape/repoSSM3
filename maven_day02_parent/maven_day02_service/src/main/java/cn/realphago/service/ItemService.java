package cn.realphago.service;

import cn.realphago.pojo.Item;

import java.util.List;

/**
 * @author gaoyizhong
 * @create 2020/08/2020/8/1 9:33
 */
public interface ItemService {

    public List<Item> findAll();

    public Item findItemById(int id);
}
