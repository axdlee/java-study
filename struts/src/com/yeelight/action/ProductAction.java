package com.yeelight.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yeelight.bean.Product;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-31
 * Time: 下午4:27
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class ProductAction extends ActionSupport {
    private Product product;

    public String show() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        System.out.println("request:\t" + request);
        System.out.println("response:\t" + response);

        product = new Product();
        product.setName("iphone7");
        return "show";
    }

    public String add() {
        Map m = ActionContext.getContext().getSession();
        m.put("name", product.getName());
        System.out.println("product.name:"+product.getName());
        return "show";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void validate() {
        if (product.getName().length() == 0) {
            addFieldError("product.name", "name can't be empty!");
        }
    }
}
