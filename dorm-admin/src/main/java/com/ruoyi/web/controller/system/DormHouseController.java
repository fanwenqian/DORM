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
import com.ruoyi.system.domain.DormHouse;
import com.ruoyi.system.service.IDormHouseService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍Controller
 * 
 * @author zhumf
 * @date 2021-04-14
 */
@Controller
@RequestMapping("/system/house")
public class DormHouseController extends BaseController
{
    private String prefix = "system/house";

    @Autowired
    private IDormHouseService dormHouseService;

    @RequiresPermissions("system:house:view")
    @GetMapping()
    public String house()
    {
        return prefix + "/house";
    }

    /**
     * 查询宿舍列表
     */
    @RequiresPermissions("system:house:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DormHouse dormHouse)
    {
        startPage();
        List<DormHouse> list = dormHouseService.selectDormHouseList(dormHouse);
        return getDataTable(list);
    }

    /**
     * 导出宿舍列表
     */
    @RequiresPermissions("system:house:export")
    @Log(title = "宿舍", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DormHouse dormHouse)
    {
        List<DormHouse> list = dormHouseService.selectDormHouseList(dormHouse);
        ExcelUtil<DormHouse> util = new ExcelUtil<DormHouse>(DormHouse.class);
        return util.exportExcel(list, "house");
    }

    /**
     * 新增宿舍
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存宿舍
     */
    @RequiresPermissions("system:house:add")
    @Log(title = "宿舍", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DormHouse dormHouse)
    {
        return toAjax(dormHouseService.insertDormHouse(dormHouse));
    }

    /**
     * 修改宿舍
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DormHouse dormHouse = dormHouseService.selectDormHouseById(id);
        mmap.put("dormHouse", dormHouse);
        return prefix + "/edit";
    }

    /**
     * 修改保存宿舍
     */
    @RequiresPermissions("system:house:edit")
    @Log(title = "宿舍", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DormHouse dormHouse)
    {
        return toAjax(dormHouseService.updateDormHouse(dormHouse));
    }

    /**
     * 删除宿舍
     */
    @RequiresPermissions("system:house:remove")
    @Log(title = "宿舍", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dormHouseService.deleteDormHouseByIds(ids));
    }
}
