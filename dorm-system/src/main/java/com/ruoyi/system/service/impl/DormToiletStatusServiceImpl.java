package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormToiletStatusMapper;
import com.ruoyi.system.domain.DormToiletStatus;
import com.ruoyi.system.service.IDormToiletStatusService;
import com.ruoyi.common.core.text.Convert;

/**
 * 宿舍卫生记录Service业务层处理
 * 
 * @author zhumf
 * @date 2021-05-10
 */
@Service
public class DormToiletStatusServiceImpl implements IDormToiletStatusService 
{
    @Autowired
    private DormToiletStatusMapper dormToiletStatusMapper;

    /**
     * 查询宿舍卫生记录
     * 
     * @param id 宿舍卫生记录ID
     * @return 宿舍卫生记录
     */
    @Override
    public DormToiletStatus selectDormToiletStatusById(Long id)
    {
        return dormToiletStatusMapper.selectDormToiletStatusById(id);
    }

    /**
     * 查询宿舍卫生记录列表
     * 
     * @param dormToiletStatus 宿舍卫生记录
     * @return 宿舍卫生记录
     */
    @Override
    public List<DormToiletStatus> selectDormToiletStatusList(DormToiletStatus dormToiletStatus)
    {
        return dormToiletStatusMapper.selectDormToiletStatusList(dormToiletStatus);
    }

    /**
     * 新增宿舍卫生记录
     * 
     * @param dormToiletStatus 宿舍卫生记录
     * @return 结果
     */
    @Override
    public int insertDormToiletStatus(DormToiletStatus dormToiletStatus)
    {
        dormToiletStatus.setCreateTime(DateUtils.getNowDate());
        return dormToiletStatusMapper.insertDormToiletStatus(dormToiletStatus);
    }

    /**
     * 修改宿舍卫生记录
     * 
     * @param dormToiletStatus 宿舍卫生记录
     * @return 结果
     */
    @Override
    public int updateDormToiletStatus(DormToiletStatus dormToiletStatus)
    {
        return dormToiletStatusMapper.updateDormToiletStatus(dormToiletStatus);
    }

    /**
     * 删除宿舍卫生记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDormToiletStatusByIds(String ids)
    {
        return dormToiletStatusMapper.deleteDormToiletStatusByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除宿舍卫生记录信息
     * 
     * @param id 宿舍卫生记录ID
     * @return 结果
     */
    @Override
    public int deleteDormToiletStatusById(Long id)
    {
        return dormToiletStatusMapper.deleteDormToiletStatusById(id);
    }
}
