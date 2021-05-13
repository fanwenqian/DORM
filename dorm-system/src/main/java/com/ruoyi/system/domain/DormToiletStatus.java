package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 宿舍卫生记录对象 dorm_toilet_status
 * 
 * @author zhumf
 * @date 2021-05-10
 */
public class DormToiletStatus extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 卫生记录id */
    private Long id;

    /** 宿舍id */
    @Excel(name = "宿舍id")
    private DormHouse houseId;

    /** 卫生评级 */
    @Excel(name = "卫生评级")
    private String toiletType;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /**查询时间*/
    private String createTimeStart;
    private String createTimeEnd;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHouseId(DormHouse houseId)
    {
        this.houseId = houseId;
    }

    public DormHouse getHouseId()
    {
        return houseId;
    }
    
    public void setToiletType(String toiletType) 
    {
        this.toiletType = toiletType;
    }

    public String getToiletType() 
    {
        return toiletType;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    public String getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("houseId", getHouseId())
            .append("toiletType", getToiletType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("remarks", getRemarks())
            .toString();
    }
}
