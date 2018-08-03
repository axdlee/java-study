package com.yeelight.mapper;

import com.yeelight.pojo.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-3
 * Time: 下午4:59
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public interface ProductMapper {
    @Select(" select * from product_ where cid = #{cid} ")
    public List<Product> listByCategory(int cid);

    @Select("select * from product_ where id = #{id}")
    public Product get(int id);

    @Select(" select * from product_ ")
    @Results({
            @Result(property = "category", column = "cid", one = @One(select = "com.yeelight.mapper.CategoryMapper.get"))
    })
    public List<Product> list();
}
