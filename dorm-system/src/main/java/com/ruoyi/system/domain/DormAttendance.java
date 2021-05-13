package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出勤管理对象 dorm_attendance
 * 
 * @author zhumf
 * @date 2021-05-12
 */
public class DormAttendance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 出勤id */
    private Long id;

    /** 学生id */
    @Excel(name = "学生id")
    private Long studentId;

    /** 出勤状况 */
    @Excel(name = "出勤状况")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentId", getStudentId())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
