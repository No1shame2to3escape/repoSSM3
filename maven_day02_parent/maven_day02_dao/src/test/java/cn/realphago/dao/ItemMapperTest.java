package cn.realphago.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaoyizhong
 * @create 2020/08/2020/8/1 7:10
 */
public class ItemMapperTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_dao.xml");
    private ItemMapper itemMapper = applicationContext.getBean("itemMapper", ItemMapper.class);

    @Test
    public void findItemById() {
        System.out.println(itemMapper.findItemById(1));
    }

    @Test
    public void springContainer() {
        System.out.println("itemMapper = " + itemMapper);
    }
}
