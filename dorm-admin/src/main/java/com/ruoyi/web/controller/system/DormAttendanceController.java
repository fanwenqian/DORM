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
import com.ruoyi.system.domain.DormAttendance;
import com.ruoyi.system.service.IDormAttendanceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出勤管理Controller
 * 
 * @author zhumf
 * @date 2021-05-12
 */
@Controller
@RequestMapping("/system/attendance")
public class DormAttendanceController extends BaseController
{
    private String prefix = "system/attendance";

    @Autowired
    private IDormAttendanceService dormAttendanceService;

    @RequiresPermissions("system:attendance:view")
    @GetMapping()
    public String attendance()
    {
        return prefix + "/attendance";
    }

    /**
     * 查询出勤管理列表
     */
    @RequiresPermissions("system:attendance:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DormAttendance dormAttendance)
    {
        startPage();
        List<DormAttendance> list = dormAttendanceService.selectDormAttendanceList(dormAttendance);
        return getDataTable(list);
    }

    /**
     * 导出出勤管理列表
     */
    @RequiresPermissions("system:attendance:export")
    @Log(title = "出勤管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DormAttendance dormAttendance)
    {
        List<DormAttendance> list = dormAttendanceService.selectDormAttendanceList(dormAttendance);
        ExcelUtil<DormAttendance> util = new ExcelUtil<DormAttendance>(DormAttendance.class);
        return util.exportExcel(list, "attendance");
    }

    /**
     * 新增出勤管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出勤管理
     */
    @RequiresPermissions("system:attendance:add")
    @Log(title = "出勤管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DormAttendance dormAttendance)
    {
        return toAjax(dormAttendanceService.insertDormAttendance(dormAttendance));
    }

    /**
     * 修改出勤管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DormAttendance dormAttendance = dormAttendanceService.selectDormAttendanceById(id);
        mmap.put("dormAttendance", dormAttendance);
        return prefix + "/edit";
    }

    /**
     * 修改保存出勤管理
     */
    @RequiresPermissions("system:attendance:edit")
    @Log(title = "出勤管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DormAttendance dormAttendance)
    {
        return toAjax(dormAttendanceService.updateDormAttendance(dormAttendance));
    }

    /**
     * 删除出勤管理
     */
    @RequiresPermissions("system:attendance:remove")
    @Log(title = "出勤管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dormAttendanceService.deleteDormAttendanceByIds(ids));
    }
}
