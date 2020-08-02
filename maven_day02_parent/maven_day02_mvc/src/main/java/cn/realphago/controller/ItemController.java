package cn.realphago.controller;

import cn.realphago.pojo.Item;
import cn.realphago.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author gaoyizhong
 * @create 2020/08/2020/8/1 10:02
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/detail/{id}")
    public String findDetail(HttpServletRequest response, @PathVariable("id") int id, Model model) throws UnsupportedEncodingException {
        response.setCharacterEncoding("utf8");
        Item item = itemService.findItemById(id);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
