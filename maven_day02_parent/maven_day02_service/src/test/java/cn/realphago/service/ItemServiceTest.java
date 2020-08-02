package cn.realphago.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaoyizhong
 * @create 2020/08/2020/8/1 9:51
 */
public class ItemServiceTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
    private ItemService itemService = applicationContext.getBean(ItemService.class);

    @Test
    public void findItemById() {
        System.out.println(itemService.findItemById(1));
    }

}
