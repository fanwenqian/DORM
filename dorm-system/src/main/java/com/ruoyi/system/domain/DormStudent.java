package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生信息对象 dorm_student
 * 
 * @author zhumf
 * @date 2021-05-11
 */
public class DormStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生id */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 专业 */
    @Excel(name = "专业")
    private String profession;

    /** 班级 */
    @Excel(name = "班级")
    private String classes;

    /** 宿舍号 */
    @Excel(name = "宿舍号")
    private DormHouse houseId;

    /** 分配状态 */
    @Excel(name = "分配状态")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setProfession(String profession) 
    {
        this.profession = profession;
    }

    public String getProfession() 
    {
        return profession;
    }
    public void setClasses(String classes) 
    {
        this.classes = classes;
    }

    public String getClasses() 
    {
        return classes;
    }
    public void setHouseId(DormHouse houseId)
    {
        this.houseId = houseId;
    }

    public DormHouse getHouseId()
    {
        return houseId;
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
            .append("name", getName())
            .append("age", getAge())
            .append("sex", getSex())
            .append("profession", getProfession())
            .append("classes", getClasses())
            .append("houseId", getHouseId())
            .append("status", getStatus())
            .toString();
    }
}
