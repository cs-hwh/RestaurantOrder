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
@TableName("restaurant_foot_property")
@ApiModel(value = "FootProperty对象", description = "")
public class FootProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("属性ID")
    private String footPropertyId;

    @ApiModelProperty("所属菜品ID")
    private String footId;

    @ApiModelProperty("属性名")
    private String footPropertyName;

    @ApiModelProperty("属性值")
    private String footPropertyValue;

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
    public String getFootPropertyId() {
        return footPropertyId;
    }

    public void setFootPropertyId(String footPropertyId) {
        this.footPropertyId = footPropertyId;
    }
    public String getFootId() {
        return footId;
    }

    public void setFootId(String footId) {
        this.footId = footId;
    }
    public String getFootPropertyName() {
        return footPropertyName;
    }

    public void setFootPropertyName(String footPropertyName) {
        this.footPropertyName = footPropertyName;
    }
    public String getFootPropertyValue() {
        return footPropertyValue;
    }

    public void setFootPropertyValue(String footPropertyValue) {
        this.footPropertyValue = footPropertyValue;
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
        return "FootProperty{" +
            "id=" + id +
            ", footPropertyId=" + footPropertyId +
            ", footId=" + footId +
            ", footPropertyName=" + footPropertyName +
            ", footPropertyValue=" + footPropertyValue +
            ", sort=" + sort +
            ", enabled=" + enabled +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
