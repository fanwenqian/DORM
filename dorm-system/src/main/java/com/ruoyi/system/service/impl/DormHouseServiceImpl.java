package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormHouseMapper;
import com.ruoyi.system.domain.DormHouse;
import com.ruoyi.system.service.IDormHouseService;
import com.ruoyi.common.core.text.Convert;

/**
 * 宿舍Service业务层处理
 * 
 * @author zhumf
 * @date 2021-04-14
 */
@Service
public class DormHouseServiceImpl implements IDormHouseService 
{
    @Autowired
    private DormHouseMapper dormHouseMapper;

    /**
     * 查询宿舍
     * 
     * @param id 宿舍ID
     * @return 宿舍
     */
    @Override
    public DormHouse selectDormHouseById(Long id)
    {
        return dormHouseMapper.selectDormHouseById(id);
    }

    /**
     * 查询宿舍列表
     * 
     * @param dormHouse 宿舍
     * @return 宿舍
     */
    @Override
    public List<DormHouse> selectDormHouseList(DormHouse dormHouse)
    {
        return dormHouseMapper.selectDormHouseList(dormHouse);
    }

    /**
     * 新增宿舍
     * 
     * @param dormHouse 宿舍
     * @return 结果
     */
    @Override
    public int insertDormHouse(DormHouse dormHouse)
    {
        dormHouse.setCreateTime(DateUtils.getNowDate());
        return dormHouseMapper.insertDormHouse(dormHouse);
    }

    /**
     * 修改宿舍
     * 
     * @param dormHouse 宿舍
     * @return 结果
     */
    @Override
    public int updateDormHouse(DormHouse dormHouse)
    {
        dormHouse.setUpdateTime(DateUtils.getNowDate());
        return dormHouseMapper.updateDormHouse(dormHouse);
    }

    /**
     * 删除宿舍对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDormHouseByIds(String ids)
    {
        return dormHouseMapper.deleteDormHouseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除宿舍信息
     * 
     * @param id 宿舍ID
     * @return 结果
     */
    @Override
    public int deleteDormHouseById(Long id)
    {
        return dormHouseMapper.deleteDormHouseById(id);
    }
}
