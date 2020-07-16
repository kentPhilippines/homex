package com.ruoyi.framework.web.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 表格分页数据对象
 *
 * @author ruoyi
 */
@ApiModel(value="表格数据返回",description="全部分页返回")
public class TableDataInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    @ApiModelProperty(example="总记录数")
    private long total;

    /**
     * 列表数据
     */
    @ApiModelProperty(example="列表数据")
    private List<?> rows;

    /**
     * 消息状态码
     */
    @ApiModelProperty(example="消息状态码")
    private int code;

    /**
     * 消息内容
     */
    @ApiModelProperty(example="消息内容")
    private String msg;

    /**
     * 表格数据对象
     */
    public TableDataInfo() {
    }

    /**
     * 分页
     *
     * @param list  列表数据
     * @param total 总记录数
     */
    public TableDataInfo(List<?> list, int total) {
        this.rows = list;
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}