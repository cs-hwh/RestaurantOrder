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
@TableName("restaurant_shopping_trolley")
@ApiModel(value = "ShoppingTrolley对象", description = "")
public class ShoppingTrolley implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("购物车ID")
    private String shoppingTrolleyId;

    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("总计金额")
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
    public String getShoppingTrolleyId() {
        return shoppingTrolleyId;
    }

    public void setShoppingTrolleyId(String shoppingTrolleyId) {
        this.shoppingTrolleyId = shoppingTrolleyId;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        return "ShoppingTrolley{" +
            "id=" + id +
            ", shoppingTrolleyId=" + shoppingTrolleyId +
            ", userId=" + userId +
            ", money=" + money +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
