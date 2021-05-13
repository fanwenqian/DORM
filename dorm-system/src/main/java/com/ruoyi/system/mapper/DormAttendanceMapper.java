package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DormAttendance;

/**
 * 出勤管理Mapper接口
 * 
 * @author zhumf
 * @date 2021-05-12
 */
public interface DormAttendanceMapper 
{
    /**
     * 查询出勤管理
     * 
     * @param id 出勤管理ID
     * @return 出勤管理
     */
    public DormAttendance selectDormAttendanceById(Long id);

    /**
     * 查询出勤管理列表
     * 
     * @param dormAttendance 出勤管理
     * @return 出勤管理集合
     */
    public List<DormAttendance> selectDormAttendanceList(DormAttendance dormAttendance);

    /**
     * 新增出勤管理
     * 
     * @param dormAttendance 出勤管理
     * @return 结果
     */
    public int insertDormAttendance(DormAttendance dormAttendance);

    /**
     * 修改出勤管理
     * 
     * @param dormAttendance 出勤管理
     * @return 结果
     */
    public int updateDormAttendance(DormAttendance dormAttendance);

    /**
     * 删除出勤管理
     * 
     * @param id 出勤管理ID
     * @return 结果
     */
    public int deleteDormAttendanceById(Long id);

    /**
     * 批量删除出勤管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDormAttendanceByIds(String[] ids);
}
