package com.yeelight.springboot.mapper;

import com.yeelight.springboot.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-6
 * Time: 下午7:52
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Mapper
public interface CategoryMapper {

    @Select("select * from category_")
    List<Category> findAll();

    @Insert(" insert into category_ ( name ) values (#{name}) ")
    public int save(Category category);

    @Delete(" delete from category_ where id= #{id} ")
    public void delete(int id);

    @Select("select * from category_ where id= #{id} ")
    public Category get(int id);

    @Update("update category_ set name=#{name} where id=#{id} ")
    public int update(Category category);
}
