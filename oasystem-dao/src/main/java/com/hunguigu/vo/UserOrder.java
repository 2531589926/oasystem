package com.hunguigu.vo;
/**
 * 订单表
 */

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserOrder {
    private Integer id;

    private String order_number;//订单号

    private User user;//用户对象

    private User merchants;//商户对象

    @JsonFormat(pattern = "yyyy-MM-dd hh:ss:mm")
    @JSONField(format = "yyyy-MM-dd hh:ss:mm")
    private Date createtime;//订单创建时间

    @JsonFormat(pattern = "yyyy-MM-dd hh:ss:mm")
    @JSONField(format = "yyyy-MM-dd hh:ss:mm")
    private Date shipmenttime;//出库时间

    private Float price;/*单价*/

    private Integer number;/*数量*/

    private Commodity commodity;

    private Float totalmoney;/*总价*/

    private Integer state;//状态(0 待付款|1 (待发货|待收货)|2 待提货|3 已提货 )

    private String remark;//备注

    public UserOrder() {
    }

    public UserOrder(Integer id, String order_number, User user, User merchants, Date createtime, Date shipmenttime, Float price, Integer number, Commodity commodity, Float totalmoney, Integer state, String remark) {
        this.id = id;
        this.order_number = order_number;
        this.user = user;
        this.merchants = merchants;
        this.createtime = createtime;
        this.shipmenttime = shipmenttime;
        this.price = price;
        this.number = number;
        this.commodity = commodity;
        this.totalmoney = totalmoney;
        this.state = state;
        this.remark = remark;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getMerchants() {
        return merchants;
    }

    public void setMerchants(User merchants) {
        this.merchants = merchants;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getShipmenttime() {
        return shipmenttime;
    }

    public void setShipmenttime(Date shipmenttime) {
        this.shipmenttime = shipmenttime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}