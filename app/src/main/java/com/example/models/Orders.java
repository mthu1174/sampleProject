package com.example.models;

public class Orders {
    private int id;
    private String code;
    private String name;
    private int employeeId;
    private double customerId;
    private String orderDate;
    private String description;
    private int status;
    private String statusDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getCustomerId() {
        return customerId;
    }

    public void setCustomerId(double customerId) {
        this.customerId = customerId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Orders() {
    }

    public Orders(int id, String code, String name, int employeeId, double customerId, String orderDate, String description, int status, String statusDescription) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.description = description;
        this.status = status;
        this.statusDescription = statusDescription;
    }
}
