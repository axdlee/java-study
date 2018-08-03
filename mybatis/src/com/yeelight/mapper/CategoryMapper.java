package com.yeelight.mapper;

import com.yeelight.pojo.Category;
import com.yeelight.provider.CategoryDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-3
 * Time: 下午4:37
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public interface CategoryMapper {
    @Insert(" insert into category_ ( name ) values (#{name}) ")
    @InsertProvider(type = CategoryDynaSqlProvider.class, method = "add")
    public int add(Category category);

    @Delete(" delete from category_ where id = #{id} ")
    @InsertProvider(type = CategoryDynaSqlProvider.class, method = "delete")
    public void delete(int id);

    @Select(" select * from category_ where id = #{id} ")
    public Category get(int id);

    @Update(" update category_ set name = #{name} where id = #{id} ")
    public void update(Category category);

    @Select(" select * from category_ ")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "products", javaType = List.class, column = "id", many = @Many(
                    select = "com.yeelight.mapper.ProductMapper.listByCategory"
            ))
    })
    public List<Category> list();
}
