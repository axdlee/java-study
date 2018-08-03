package com.yeelight.provider;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-3
 * Time: 下午5:20
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class CategoryDynaSqlProvider {
    public String list() {
        return new SQL()
                .SELECT("*")
                .FROM("category_")
                .toString();
    }

    public String get() {
        return new SQL()
                .SELECT("*")
                .FROM("category_")
                .WHERE("id = #{id}")
                .toString();
    }

    public String add() {
        return new SQL()
                .INSERT_INTO("category_")
                .VALUES("name", "#{name}")
                .toString();
    }

    public String update() {
        return new SQL()
                .UPDATE("category_")
                .SET("name", "#{name}")
                .WHERE("id = #{id}")
                .toString();
    }

    public String delete(){
        return new SQL()
                .DELETE_FROM("category_")
                .WHERE("id=#{id}")
                .toString();
    }
}
