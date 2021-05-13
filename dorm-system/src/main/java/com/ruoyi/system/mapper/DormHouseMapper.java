package com.ruoyi.system.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.DormHouse;

/**
 * 宿舍Mapper接口
 * 
 * @author zhumf
 * @date 2021-04-14
 */
public interface DormHouseMapper 
{
    /**
     * 查询宿舍
     * 
     * @param id 宿舍ID
     * @return 宿舍
     */
    public DormHouse selectDormHouseById(Long id);

    /**
     * 查询宿舍列表
     * 
     * @param dormHouse 宿舍
     * @return 宿舍集合
     */
    public List<DormHouse> selectDormHouseList(DormHouse dormHouse);

    /**
     * 新增宿舍
     * 
     * @param dormHouse 宿舍
     * @return 结果
     */
    public int insertDormHouse(DormHouse dormHouse);

    /**
     * 修改宿舍
     * 
     * @param dormHouse 宿舍
     * @return 结果
     */
    public int updateDormHouse(DormHouse dormHouse);

    /**
     * 删除宿舍
     * 
     * @param id 宿舍ID
     * @return 结果
     */
    public int deleteDormHouseById(Long id);

    /**
     * 批量删除宿舍
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDormHouseByIds(String[] ids);

    /**
     * 获取宿舍map集合
     * @return
     */
    List<Map<String, Object>> findHouseMap();
}
