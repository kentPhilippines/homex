package com.ruoyi.framework.web.page;

import com.ruoyi.common.utils.StringUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 分页数据
 *
 * @author ruoyi
 */
@ApiModel(value="分页数据",description="分页数据")
public class PageDomain {
    /**
     * 当前记录起始索引
     */
    @ApiModelProperty(example = "当前记录起始索引")
    private Integer pageNum;
    /**
     * 每页显示记录数
     */
    @ApiModelProperty(example = "每页显示记录数")
    private Integer pageSize;
    /**
     * 排序列
     */
    @ApiModelProperty(example = "排序列")
    private String orderByColumn;
    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    @ApiModelProperty(example = "排序的方向 \"desc\" 或者 \"asc\".")
    private String isAsc;

    public String getOrderBy() {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "";
        }
        return StringUtils.toUnderScoreCase(orderByColumn) + " " + isAsc;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }
}
