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
@TableName("restaurant_foot_type")
@ApiModel(value = "FootType对象", description = "")
public class FootType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    private Long id;

    @ApiModelProperty("分类ID")
    private String footTypeId;

    @ApiModelProperty("分类名")
    private String footTypeName;

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
    public String getFootTypeId() {
        return footTypeId;
    }

    public void setFootTypeId(String footTypeId) {
        this.footTypeId = footTypeId;
    }
    public String getFootTypeName() {
        return footTypeName;
    }

    public void setFootTypeName(String footTypeName) {
        this.footTypeName = footTypeName;
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
        return "FootType{" +
            "id=" + id +
            ", footTypeId=" + footTypeId +
            ", footTypeName=" + footTypeName +
            ", sort=" + sort +
            ", enabled=" + enabled +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
        "}";
    }
}
