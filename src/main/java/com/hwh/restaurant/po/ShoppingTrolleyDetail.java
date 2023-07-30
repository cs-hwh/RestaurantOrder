package com.hwh.restaurant.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("restaurant_shopping_trolley_detail")
@ApiModel(value = "ShoppingTrolleyDetail对象", description = "")
public class ShoppingTrolleyDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("购物车明细ID")
    private String shoppingTrolleyDetailId;

    @ApiModelProperty("购物车ID")
    private String shoppingTrolleyId;

    @ApiModelProperty("菜品ID")
    private String footId;

    @ApiModelProperty("菜名")
    private String footName;

    @ApiModelProperty("价格")
    private String footPrice;

    @ApiModelProperty("口味")
    private String taste;

    @ApiModelProperty("菜品封面路径")
    private String footCover;

    @ApiModelProperty("数量")
    private Integer num;

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
    public String getShoppingTrolleyDetailId() {
        return shoppingTrolleyDetailId;
    }

    public void setShoppingTrolleyDetailId(String shoppingTrolleyDetailId) {
        this.shoppingTrolleyDetailId = shoppingTrolleyDetailId;
    }
    public String getShoppingTrolleyId() {
        return shoppingTrolleyId;
    }

    public void setShoppingTrolleyId(String shoppingTrolleyId) {
        this.shoppingTrolleyId = shoppingTrolleyId;
    }
    public String getFootId() {
        return footId;
    }

    public void setFootId(String footId) {
        this.footId = footId;
    }
    public String getFootName() {
        return footName;
    }

    public void setFootName(String footName) {
        this.footName = footName;
    }
    public String getFootPrice() {
        return footPrice;
    }

    public void setFootPrice(String footPrice) {
        this.footPrice = footPrice;
    }
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String getFootCover() {
        return footCover;
    }

    public void setFootCover(String footCover) {
        this.footCover = footCover;
    }
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
        return "ShoppingTrolleyDetail{" +
            "id=" + id +
            ", shoppingTrolleyDetailId=" + shoppingTrolleyDetailId +
            ", shoppingTrolleyId=" + shoppingTrolleyId +
            ", footId=" + footId +
            ", footName=" + footName +
            ", footPrice=" + footPrice +
            ", taste=" + taste +
            ", footCover=" + footCover +
            ", num=" + num +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
