package cn.realphago.dao;

import cn.realphago.pojo.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gaoyizhong
 * @create 2020/08/2020/8/1 17:26
 */
public interface ItemMapper {

    public List<Item> findAll();

    public Item findItemById(@Param("id") int id);

}
