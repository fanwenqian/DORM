package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DormToiletStatus;

/**
 * 宿舍卫生记录Service接口
 * 
 * @author zhumf
 * @date 2021-05-10
 */
public interface IDormToiletStatusService 
{
    /**
     * 查询宿舍卫生记录
     * 
     * @param id 宿舍卫生记录ID
     * @return 宿舍卫生记录
     */
    public DormToiletStatus selectDormToiletStatusById(Long id);

    /**
     * 查询宿舍卫生记录列表
     * 
     * @param dormToiletStatus 宿舍卫生记录
     * @return 宿舍卫生记录集合
     */
    public List<DormToiletStatus> selectDormToiletStatusList(DormToiletStatus dormToiletStatus);

    /**
     * 新增宿舍卫生记录
     * 
     * @param dormToiletStatus 宿舍卫生记录
     * @return 结果
     */
    public int insertDormToiletStatus(DormToiletStatus dormToiletStatus);

    /**
     * 修改宿舍卫生记录
     * 
     * @param dormToiletStatus 宿舍卫生记录
     * @return 结果
     */
    public int updateDormToiletStatus(DormToiletStatus dormToiletStatus);

    /**
     * 批量删除宿舍卫生记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDormToiletStatusByIds(String ids);

    /**
     * 删除宿舍卫生记录信息
     * 
     * @param id 宿舍卫生记录ID
     * @return 结果
     */
    public int deleteDormToiletStatusById(Long id);
}
