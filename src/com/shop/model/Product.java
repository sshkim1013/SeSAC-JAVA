package com.shop.model;

import com.shop.utils.IdGenerator;

public class Product {

    private String id;
    private String name;
    private int price;
    private int stock;
    private String category;

    public Product(String name, int price, int stock, String category) {
        this.id = IdGenerator.getInstance().generateProductId();
        setName(name);
        setPrice(price);
        setStock(stock);
        setCategory(category);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("상품명은 필수입니다.");
        this.name = name;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("재고는 0 이상이어야 합니다.");
        this.stock = stock;
    }

    public void setCategory(String category) {
        if (category == null || category.isEmpty()) throw new IllegalArgumentException("카테고리는 필수입니다.");
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCategory() {
        return category;
    }

    public void decreaseStock(int quantity) {
        if (stock <= quantity) {
            throw new IllegalArgumentException("재고가 부족합니다. stock = " + stock);
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("수량은 1 이상을 입력해주세요. 입력하신 수량: " + quantity);
        }
        stock -= quantity;
    }

    public void increaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("수량은 1 이상을 입력해주세요. 입력하신 수량: " + quantity);
        }
        stock += quantity;
    }

    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }
}
