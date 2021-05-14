package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.DormHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DormStudentMapper;
import com.ruoyi.system.domain.DormStudent;
import com.ruoyi.system.service.IDormStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生Service业务层处理
 * 
 * @author zhumf
 * @date 2021-05-11
 */
@Service("dormStudentServiceImpl")
public class DormStudentServiceImpl implements IDormStudentService
{
    @Autowired
    private DormStudentMapper dormStudentMapper;

    /**
     * 查询学生
     * 
     * @param id 学生ID
     * @return 学生
     */
    @Override
    public DormStudent selectDormStudentById(Long id)
    {
        return dormStudentMapper.selectDormStudentById(id);
    }

    /**
     * 查询学生列表
     * 
     * @param dormStudent 学生
     * @return 学生
     */
    @Override
    public List<DormStudent> selectDormStudentList(DormStudent dormStudent)
    {
        return dormStudentMapper.selectDormStudentList(dormStudent);
    }

    /**
     * 新增学生
     * 
     * @param dormStudent 学生
     * @return 结果
     */
    @Override
    public int insertDormStudent(DormStudent dormStudent)
    {
        return dormStudentMapper.insertDormStudent(dormStudent);
    }

    /**
     * 修改学生
     * 
     * @param dormStudent 学生
     * @return 结果
     */
    @Override
    public int updateDormStudent(DormStudent dormStudent)
    {
        DormHouse houseId = dormStudent.getHouseId();
        if(houseId != null && houseId.getId() != null){
            //1表示已分配，写法不规范，这里就不单独新建一个类写常量了
            dormStudent.setStatus("1");
        }
        return dormStudentMapper.updateDormStudent(dormStudent);
    }

    /**
     * 删除学生对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDormStudentByIds(String ids)
    {
        return dormStudentMapper.deleteDormStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生信息
     * 
     * @param id 学生ID
     * @return 结果
     */
    @Override
    public int deleteDormStudentById(Long id)
    {
        return dormStudentMapper.deleteDormStudentById(id);
    }

    /**
     * 获取学生map
     * @return map集合
     */
    public List<Map<String,Object>> findStudentKeyValue() {
        return dormStudentMapper.findStudentMap();
    }
}
