package com.yeelight.action;

import com.yeelight.pojo.Product;
import com.yeelight.service.ProductService;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-1
 * Time: 下午2:02
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class ProductAction {
    ProductService productService;
    List<Product> products;

    /**
     * 列表页
     * @return
     */
    public String list() {
        products = productService.list();
        return "listJsp";
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
