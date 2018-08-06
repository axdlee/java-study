package com.yeelight.service;

import com.yeelight.pojo.Category;
import com.yeelight.util.Page;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-6
 * Time: 上午10:11
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public interface CategoryService {
    List<Category> list();

    int total();

    List<Category> list(Page page);
}
