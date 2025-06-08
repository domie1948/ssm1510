package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuhufankuiEntity;
import com.entity.view.ZhuhufankuiView;

import com.service.ZhuhufankuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 住户反馈
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
@RestController
@RequestMapping("/zhuhufankui")
public class ZhuhufankuiController {
    @Autowired
    private ZhuhufankuiService zhuhufankuiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuhufankuiEntity zhuhufankui, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shequyonghu")) {
			zhuhufankui.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuhufankuiEntity> ew = new EntityWrapper<ZhuhufankuiEntity>();
    	PageUtils page = zhuhufankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuhufankui), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuhufankuiEntity zhuhufankui, HttpServletRequest request){
        EntityWrapper<ZhuhufankuiEntity> ew = new EntityWrapper<ZhuhufankuiEntity>();
    	PageUtils page = zhuhufankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuhufankui), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuhufankuiEntity zhuhufankui){
       	EntityWrapper<ZhuhufankuiEntity> ew = new EntityWrapper<ZhuhufankuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuhufankui, "zhuhufankui")); 
        return R.ok().put("data", zhuhufankuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuhufankuiEntity zhuhufankui){
        EntityWrapper< ZhuhufankuiEntity> ew = new EntityWrapper< ZhuhufankuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuhufankui, "zhuhufankui")); 
		ZhuhufankuiView zhuhufankuiView =  zhuhufankuiService.selectView(ew);
		return R.ok("查询住户反馈成功").put("data", zhuhufankuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuhufankuiEntity zhuhufankui = zhuhufankuiService.selectById(id);
        return R.ok().put("data", zhuhufankui);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuhufankuiEntity zhuhufankui = zhuhufankuiService.selectById(id);
        return R.ok().put("data", zhuhufankui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuhufankuiEntity zhuhufankui, HttpServletRequest request){
    	zhuhufankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuhufankui);

        zhuhufankuiService.insert(zhuhufankui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuhufankuiEntity zhuhufankui, HttpServletRequest request){
    	zhuhufankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuhufankui);

        zhuhufankuiService.insert(zhuhufankui);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuhufankuiEntity zhuhufankui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuhufankui);
        zhuhufankuiService.updateById(zhuhufankui);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuhufankuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhuhufankuiEntity> wrapper = new EntityWrapper<ZhuhufankuiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shequyonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuhufankuiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
