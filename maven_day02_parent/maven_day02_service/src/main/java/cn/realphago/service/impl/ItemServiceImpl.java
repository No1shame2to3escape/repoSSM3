package cn.realphago.service.impl;

import cn.realphago.dao.ItemMapper;
import cn.realphago.pojo.Item;
import cn.realphago.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gaoyizhong
 * @create 2020/08/2020/8/1 9:34
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    @Resource(name = "itemMapper")
    private ItemMapper itemMapper;

    @Override
    public List<Item> findAll() {
        return itemMapper.findAll();
    }

    @Override
    public Item findItemById(int id) {
        return itemMapper.findItemById(id);
    }
}
