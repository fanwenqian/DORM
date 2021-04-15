package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宿舍对象 dorm_house
 * 
 * @author zhumf
 * @date 2021-04-14
 */
public class DormHouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 宿舍id */
    private Long id;

    /** 宿舍编号 */
    @Excel(name = "宿舍编号")
    private String code;

    /** 楼栋id */
    @Excel(name = "楼栋id")
    private DormTower towerId;

    /** 使用情况 */
    @Excel(name = "使用情况")
    private String isUse;

    /** 可容纳人数 */
    @Excel(name = "可容纳人数")
    private Long size;

    /** 在住人数 */
    @Excel(name = "在住人数")
    private Long liveNum;

    /** 宿舍图片 */
    @Excel(name = "宿舍图片")
    private String img;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }

    public DormTower getTowerId() {
        return towerId;
    }

    public void setTowerId(DormTower towerId) {
        this.towerId = towerId;
    }

    public void setIsUse(String isUse)
    {
        this.isUse = isUse;
    }

    public String getIsUse() 
    {
        return isUse;
    }
    public void setSize(Long size) 
    {
        this.size = size;
    }

    public Long getSize() 
    {
        return size;
    }
    public void setLiveNum(Long liveNum) 
    {
        this.liveNum = liveNum;
    }

    public Long getLiveNum() 
    {
        return liveNum;
    }
    public void setImg(String img) 
    {
        this.img = img;
    }

    public String getImg() 
    {
        return img;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("towerId", getTowerId())
            .append("isUse", getIsUse())
            .append("size", getSize())
            .append("liveNum", getLiveNum())
            .append("img", getImg())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remarks", getRemarks())
            .toString();
    }
}
