package com.yeelight.mapper;

import com.yeelight.pojo.OrderItem;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-3
 * Time: 下午5:10
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public interface OrderItemMapper {
    @Select(" select * from order_item_ where oid = #{oid} ")
    @Results({
            @Result(property = "product", column = "pid", one = @One(select = "com.yeelight.mapper.ProductMapper.get"))
    })
    public List<OrderItem> listByOrder(int oid);
}
