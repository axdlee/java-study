package com.yeelight.springboot.dao;

import com.yeelight.springboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-6
 * Time: 下午6:32
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
