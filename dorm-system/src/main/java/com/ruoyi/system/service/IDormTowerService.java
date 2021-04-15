package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DormTower;

/**
 * 楼栋Service接口
 * 
 * @author zhumf
 * @date 2021-04-14
 */
public interface IDormTowerService 
{
    /**
     * 查询楼栋
     * 
     * @param id 楼栋ID
     * @return 楼栋
     */
    public DormTower selectDormTowerById(Long id);

    /**
     * 查询楼栋列表
     * 
     * @param dormTower 楼栋
     * @return 楼栋集合
     */
    public List<DormTower> selectDormTowerList(DormTower dormTower);

    /**
     * 新增楼栋
     * 
     * @param dormTower 楼栋
     * @return 结果
     */
    public int insertDormTower(DormTower dormTower);

    /**
     * 修改楼栋
     * 
     * @param dormTower 楼栋
     * @return 结果
     */
    public int updateDormTower(DormTower dormTower);

    /**
     * 批量删除楼栋
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDormTowerByIds(String ids);

    /**
     * 删除楼栋信息
     * 
     * @param id 楼栋ID
     * @return 结果
     */
    public int deleteDormTowerById(Long id);
}
