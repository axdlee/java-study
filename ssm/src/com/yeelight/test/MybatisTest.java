package com.yeelight.test;

import com.yeelight.mapper.CategoryMapper;
import com.yeelight.pojo.Category;
import com.yeelight.util.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-6
 * Time: 上午10:50
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {
    @Autowired
    private CategoryMapper categoryMapper;

    // @Test
    public void testAdd() {
        for (int i = 0; i < 100; i++) {
            Category c = new Category();
            c.setName("category" + i);
            categoryMapper.add(c);
        }
    }

    @Test
    public void testTotal() {
        int total = categoryMapper.total();
        System.out.println(total);
    }

    @Test
    public void testList() {
        Page p = new Page();
        p.setStart(2);
        p.setCount(3);
        List<Category> cs = categoryMapper.list(p);
        for (Category c:cs
             ) {
            System.out.println(c.getName());
        }
    }
}
