package com.how2java.tmall.pojo;

import java.util.List;

public class Category {
    private Integer id;

    private String name;

    /*如下是非数据库字段*/

//    products: 代表一个分类下有多个产品
    private List<Product> products;

//    productsByRow: 这个属性的类型是 List<List<Product>> productsByRow。 及一个分类有对应多个List<Product>，提供这个属性，是为了在首页竖状导航的分类名称右边显示推荐产品列表

    private List<List<Product>> productsByRow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<List<Product>> getProductsByRow() {
        return productsByRow;
    }

    public void setProductsByRow(List<List<Product>> productsByRow) {
        this.productsByRow = productsByRow;
    }
}
