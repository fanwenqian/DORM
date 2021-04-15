package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.DormTower;
import com.ruoyi.system.service.IDormTowerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 楼栋Controller
 * 
 * @author zhumf
 * @date 2021-04-14
 */
@Controller
@RequestMapping("/system/tower")
public class DormTowerController extends BaseController
{
    private String prefix = "system/tower";

    @Autowired
    private IDormTowerService dormTowerService;

    @RequiresPermissions("system:tower:view")
    @GetMapping()
    public String tower()
    {
        return prefix + "/tower";
    }

    /**
     * 查询楼栋列表
     */
    @RequiresPermissions("system:tower:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DormTower dormTower)
    {
        startPage();
        List<DormTower> list = dormTowerService.selectDormTowerList(dormTower);
        return getDataTable(list);
    }

    /**
     * 导出楼栋列表
     */
    @RequiresPermissions("system:tower:export")
    @Log(title = "楼栋", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DormTower dormTower)
    {
        List<DormTower> list = dormTowerService.selectDormTowerList(dormTower);
        ExcelUtil<DormTower> util = new ExcelUtil<DormTower>(DormTower.class);
        return util.exportExcel(list, "tower");
    }

    /**
     * 新增楼栋
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存楼栋
     */
    @RequiresPermissions("system:tower:add")
    @Log(title = "楼栋", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DormTower dormTower)
    {
        return toAjax(dormTowerService.insertDormTower(dormTower));
    }

    /**
     * 修改楼栋
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DormTower dormTower = dormTowerService.selectDormTowerById(id);
        mmap.put("dormTower", dormTower);
        return prefix + "/edit";
    }

    /**
     * 修改保存楼栋
     */
    @RequiresPermissions("system:tower:edit")
    @Log(title = "楼栋", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DormTower dormTower)
    {
        return toAjax(dormTowerService.updateDormTower(dormTower));
    }

    /**
     * 删除楼栋
     */
    @RequiresPermissions("system:tower:remove")
    @Log(title = "楼栋", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dormTowerService.deleteDormTowerByIds(ids));
    }
}
