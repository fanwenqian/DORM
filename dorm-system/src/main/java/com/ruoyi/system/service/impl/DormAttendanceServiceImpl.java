package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormAttendanceMapper;
import com.ruoyi.system.domain.DormAttendance;
import com.ruoyi.system.service.IDormAttendanceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出勤管理Service业务层处理
 * 
 * @author zhumf
 * @date 2021-05-12
 */
@Service
public class DormAttendanceServiceImpl implements IDormAttendanceService 
{
    @Autowired
    private DormAttendanceMapper dormAttendanceMapper;

    /**
     * 查询出勤管理
     * 
     * @param id 出勤管理ID
     * @return 出勤管理
     */
    @Override
    public DormAttendance selectDormAttendanceById(Long id)
    {
        return dormAttendanceMapper.selectDormAttendanceById(id);
    }

    /**
     * 查询出勤管理列表
     * 
     * @param dormAttendance 出勤管理
     * @return 出勤管理
     */
    @Override
    public List<DormAttendance> selectDormAttendanceList(DormAttendance dormAttendance)
    {
        return dormAttendanceMapper.selectDormAttendanceList(dormAttendance);
    }

    /**
     * 新增出勤管理
     * 
     * @param dormAttendance 出勤管理
     * @return 结果
     */
    @Override
    public int insertDormAttendance(DormAttendance dormAttendance)
    {
        dormAttendance.setCreateTime(DateUtils.getNowDate());
        return dormAttendanceMapper.insertDormAttendance(dormAttendance);
    }

    /**
     * 修改出勤管理
     * 
     * @param dormAttendance 出勤管理
     * @return 结果
     */
    @Override
    public int updateDormAttendance(DormAttendance dormAttendance)
    {
        return dormAttendanceMapper.updateDormAttendance(dormAttendance);
    }

    /**
     * 删除出勤管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDormAttendanceByIds(String ids)
    {
        return dormAttendanceMapper.deleteDormAttendanceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出勤管理信息
     * 
     * @param id 出勤管理ID
     * @return 结果
     */
    @Override
    public int deleteDormAttendanceById(Long id)
    {
        return dormAttendanceMapper.deleteDormAttendanceById(id);
    }
}
