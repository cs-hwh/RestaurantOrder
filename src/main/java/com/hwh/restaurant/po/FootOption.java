package com.hwh.restaurant.po;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("restaurant_foot_Option")
@ApiModel(value = "FootOption对象", description = "")
public class FootOption implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("属性ID")
    private String footOptionId;

    @ApiModelProperty("所属菜品ID")
    private String footId;

    @ApiModelProperty("属性名")
    private String footOptionName;

    @ApiModelProperty("属性值")
    private String footOptionValue;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("是否启用：0不启用，1启用")
    @TableField("is_enabled")
    private Integer enabled;

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
    public String getFootOptionId() {
        return footOptionId;
    }

    public void setFootOptionId(String footOptionId) {
        this.footOptionId = footOptionId;
    }
    public String getFootId() {
        return footId;
    }

    public void setFootId(String footId) {
        this.footId = footId;
    }
    public String getFootOptionName() {
        return footOptionName;
    }

    public void setFootOptionName(String footOptionName) {
        this.footOptionName = footOptionName;
    }
    public String getFootOptionValue() {
        return footOptionValue;
    }

    public void setFootOptionValue(String footOptionValue) {
        this.footOptionValue = footOptionValue;
    }
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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
        return "FootOption{" +
                "id=" + id +
                ", footOptionId='" + footOptionId + '\'' +
                ", footId='" + footId + '\'' +
                ", footOptionName='" + footOptionName + '\'' +
                ", footOptionValue='" + footOptionValue + '\'' +
                ", sort=" + sort +
                ", enabled=" + enabled +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
