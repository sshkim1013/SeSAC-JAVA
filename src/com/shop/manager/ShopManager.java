package com.shop.manager;

import com.shop.model.Order;
import com.shop.model.Product;

public class ShopManager {

    private Product[] products;  // 상품 배열 (크기 50)
    private int productCount;    // 현재 등록된 상품 수
    private Order[] orders;      // 주문 배열 (크기 50)
    private int orderCount;      // 현재 주문 수

    public ShopManager() {
        products = new Product[50];
        productCount = 0;
        orders = new Order[50];
        orderCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount >= products.length) {
            throw new IllegalArgumentException("제품을 더 이상 등록할 수 없습니다.");
        }
        products[productCount++] = product;
        System.out.println("[상품 등록] " + product.getName() + " - " + product.getPrice() + "원");
    }

    public Product findProductById(String id) {
        for (int i = 0; i < productCount; i++) {
            if (id.equals(products[i].getId())) {
                return products[i];
            }
        }
        return null;
    }

    public Product[] searchProductsByName(String keyword) {
        Product[] newProductArr = new Product[productCount];
        String key = keyword.toLowerCase();

        int index = 0;
        for (int i = 0; i < productCount; i++) {
            if (products[i].getName().toLowerCase().contains(key)) {
                newProductArr[index++] = products[i];
            }
        }

        return newProductArr;
    }

    public Product[] searchProductsByCategory(String category) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }

        Product[] newProductArr = new Product[count];
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategory().equalsIgnoreCase(category)) {
                newProductArr[index++] = products[i];
            }
        }

        return newProductArr;
    }

    public void printAllProducts() {
        for (int i = 0; i < productCount; i++) {
            System.out.println((i+1) + ". [" + products[i].getId() + "] " + products[i].getName() + " - " + products[i].getPrice() + "원 (재고: " + products[i].getStock() + "개)");
        }
    }

    public Order createOrder() {
        Order order = new Order();
        System.out.println("[주문 생성] " + order.getOrderId());
        return order;
    }

    public void addOrderItem(Order order, String productId, int quantity) {
        Product product = findProductById(productId);

        if (product == null) {
            throw new IllegalArgumentException("해당 물품이 존재하지 않습니다.");
        }

        if (!product.isAvailable(quantity)) {
            throw new IllegalArgumentException("재고가 부족합니다.");
        }

        order.addItem(product.getId(), quantity);

        System.out.println("[주문 항목 추가] " + product.getName() + " X " + quantity);
    }

    public void processOrder(Order order) {
        order.calculateTotal(this); // 총 금액 계산 메서드

        // 하나의 주문 안에 있는 제품 정보를 모두 출력해야 한다.
        // order 목록 자체(orders) 횟수를 반복 중.
        System.out.println("주문번호: " + order.getOrderId());
        System.out.println("-------------------------------");
        for (int i = 0; i < order.getItemCount(); i++) {
            String productId = order.getProductIds()[i];    // ex) P1, P2, P4
            Product product = findProductById(productId);
            int quantity = order.getQuantities()[i];
            product.decreaseStock(quantity);
            System.out.println(product.getName() + " X " + quantity + " = " + product.getPrice() * quantity + "원");
        }
        System.out.println("-------------------------------");
        System.out.println("총 금액: " + order.getTotalAmount() + "원");

        order.complete();

        orders[orderCount] = order;
        orderCount++;

        System.out.println();
        System.out.println("[" + order.getStatus() + "] " + order.getOrderId());
    }

    public Order findOrderById(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public void printAllOrders() {
        for (int i = 0; i < orderCount; i++) {
            Order order = orders[i];
            System.out.println((i+1) + ". [" + order.getOrderId() + "] " + order.getTotalAmount() + "원 (" + order.getStatus() + ")");
        }
    }
}
