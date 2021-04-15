package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormTowerMapper;
import com.ruoyi.system.domain.DormTower;
import com.ruoyi.system.service.IDormTowerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 楼栋Service业务层处理
 * 
 * @author zhumf
 * @date 2021-04-14
 */
@Service("dormTowerServiceImpl")
public class DormTowerServiceImpl implements IDormTowerService 
{
    @Autowired
    private DormTowerMapper dormTowerMapper;

    /**
     * 查询楼栋
     * 
     * @param id 楼栋ID
     * @return 楼栋
     */
    @Override
    public DormTower selectDormTowerById(Long id)
    {
        return dormTowerMapper.selectDormTowerById(id);
    }

    /**
     * 查询楼栋列表
     * 
     * @param dormTower 楼栋
     * @return 楼栋
     */
    @Override
    public List<DormTower> selectDormTowerList(DormTower dormTower)
    {
        return dormTowerMapper.selectDormTowerList(dormTower);
    }

    /**
     * 新增楼栋
     * 
     * @param dormTower 楼栋
     * @return 结果
     */
    @Override
    public int insertDormTower(DormTower dormTower)
    {
        dormTower.setCreateTime(DateUtils.getNowDate());
        return dormTowerMapper.insertDormTower(dormTower);
    }

    /**
     * 修改楼栋
     * 
     * @param dormTower 楼栋
     * @return 结果
     */
    @Override
    public int updateDormTower(DormTower dormTower)
    {
        dormTower.setUpdateTime(DateUtils.getNowDate());
        return dormTowerMapper.updateDormTower(dormTower);
    }

    /**
     * 删除楼栋对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDormTowerByIds(String ids)
    {
        return dormTowerMapper.deleteDormTowerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除楼栋信息
     * 
     * @param id 楼栋ID
     * @return 结果
     */
    @Override
    public int deleteDormTowerById(Long id)
    {
        return dormTowerMapper.deleteDormTowerById(id);
    }

    /**
     * 获取楼栋map
     * @return map集合
     */
    public List<Map<String,Object>> findTowerKeyValue(){
        return dormTowerMapper.findTowerMap();
    }
}
