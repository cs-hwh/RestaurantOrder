package com.hwh.restaurant.po;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("restaurant_foot")
@ApiModel(value = "Foot对象", description = "")
public class Foot implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("食物ID")
    private String footId;

    @ApiModelProperty("菜名")
    private String footName;

    @ApiModelProperty("价格")
    private BigDecimal footPrice;

    @ApiModelProperty("分类ID")
    private String footTypeId;

    @ApiModelProperty("封面路径")
    private String footCover;

    @ApiModelProperty("简单描述")
    private String footDescribed;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("是否上架：0下架，上架")
    @TableField("is_sale")
    private Integer sale;

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
    public BigDecimal getFootPrice() {
        return footPrice;
    }

    public void setFootPrice(BigDecimal footPrice) {
        this.footPrice = footPrice;
    }
    public String getFootTypeId() {
        return footTypeId;
    }

    public void setFootTypeId(String footTypeId) {
        this.footTypeId = footTypeId;
    }
    public String getFootCover() {
        return footCover;
    }

    public void setFootCover(String footCover) {
        this.footCover = footCover;
    }
    public String getFootDescribed() {
        return footDescribed;
    }

    public void setFootDescribed(String footDescribed) {
        this.footDescribed = footDescribed;
    }
    public Integer getSort() {
        return sort;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        return "Foot{" +
            "id=" + id +
            ", footId=" + footId +
            ", footName=" + footName +
            ", footPrice=" + footPrice +
            ", footTypeId=" + footTypeId +
            ", footCover=" + footCover +
            ", footDescribed=" + footDescribed +
            ", sort=" + sort +
            ", sale=" + sale +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
