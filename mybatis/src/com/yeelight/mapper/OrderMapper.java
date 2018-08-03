package com.yeelight.mapper;

import com.yeelight.pojo.Order;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-3
 * Time: 下午5:14
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public interface OrderMapper {
    @Select(" select * from order_ ")
    @Results({
            @Result(property = "orderItems", javaType = List.class, column = "id", many = @Many(select = "com.yeelight.mapper.OrderItemMapper.listByOrder"))
    })
    public List<Order> list();
}
