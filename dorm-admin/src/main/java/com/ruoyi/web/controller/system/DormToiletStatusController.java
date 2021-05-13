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
import com.ruoyi.system.domain.DormToiletStatus;
import com.ruoyi.system.service.IDormToiletStatusService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍卫生记录Controller
 * 
 * @author zhumf
 * @date 2021-05-10
 */
@Controller
@RequestMapping("/system/status")
public class DormToiletStatusController extends BaseController
{
    private String prefix = "system/status";

    @Autowired
    private IDormToiletStatusService dormToiletStatusService;

    @RequiresPermissions("system:status:view")
    @GetMapping()
    public String status()
    {
        return prefix + "/status";
    }

    /**
     * 查询宿舍卫生记录列表
     */
    @RequiresPermissions("system:status:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DormToiletStatus dormToiletStatus)
    {
        startPage();
        List<DormToiletStatus> list = dormToiletStatusService.selectDormToiletStatusList(dormToiletStatus);
        return getDataTable(list);
    }

    /**
     * 导出宿舍卫生记录列表
     */
    @RequiresPermissions("system:status:export")
    @Log(title = "宿舍卫生记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DormToiletStatus dormToiletStatus)
    {
        List<DormToiletStatus> list = dormToiletStatusService.selectDormToiletStatusList(dormToiletStatus);
        ExcelUtil<DormToiletStatus> util = new ExcelUtil<DormToiletStatus>(DormToiletStatus.class);
        return util.exportExcel(list, "status");
    }

    /**
     * 新增宿舍卫生记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存宿舍卫生记录
     */
    @RequiresPermissions("system:status:add")
    @Log(title = "宿舍卫生记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DormToiletStatus dormToiletStatus)
    {
        return toAjax(dormToiletStatusService.insertDormToiletStatus(dormToiletStatus));
    }

    /**
     * 修改宿舍卫生记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DormToiletStatus dormToiletStatus = dormToiletStatusService.selectDormToiletStatusById(id);
        mmap.put("dormToiletStatus", dormToiletStatus);
        return prefix + "/edit";
    }

    /**
     * 修改保存宿舍卫生记录
     */
    @RequiresPermissions("system:status:edit")
    @Log(title = "宿舍卫生记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DormToiletStatus dormToiletStatus)
    {
        return toAjax(dormToiletStatusService.updateDormToiletStatus(dormToiletStatus));
    }

    /**
     * 删除宿舍卫生记录
     */
    @RequiresPermissions("system:status:remove")
    @Log(title = "宿舍卫生记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dormToiletStatusService.deleteDormToiletStatusByIds(ids));
    }
}
