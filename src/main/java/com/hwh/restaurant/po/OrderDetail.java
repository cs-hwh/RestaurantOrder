package com.hwh.restaurant.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
@TableName("restaurant_order_detail")
@ApiModel(value = "OrderDetail对象", description = "")
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("订单明细ID")
    private String orderDetailId;

    @ApiModelProperty("订单ID")
    private String orderId;

    @ApiModelProperty("食物ID")
    private String footId;

    @ApiModelProperty("口味")
    private String taste;

    @ApiModelProperty("数量")
    private Integer num;

    @ApiModelProperty("单价")
    private BigDecimal money;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getFootId() {
        return footId;
    }

    public void setFootId(String footId) {
        this.footId = footId;
    }
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
            "id=" + id +
            ", orderDetailId=" + orderDetailId +
            ", orderId=" + orderId +
            ", footId=" + footId +
            ", taste=" + taste +
            ", num=" + num +
            ", money=" + money +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
