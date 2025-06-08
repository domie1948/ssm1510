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

import com.entity.GonggongchangsuoyuyueEntity;
import com.entity.view.GonggongchangsuoyuyueView;

import com.service.GonggongchangsuoyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 公共场所预约
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
@RestController
@RequestMapping("/gonggongchangsuoyuyue")
public class GonggongchangsuoyuyueController {
    @Autowired
    private GonggongchangsuoyuyueService gonggongchangsuoyuyueService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GonggongchangsuoyuyueEntity gonggongchangsuoyuyue, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shequyonghu")) {
			gonggongchangsuoyuyue.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GonggongchangsuoyuyueEntity> ew = new EntityWrapper<GonggongchangsuoyuyueEntity>();
    	PageUtils page = gonggongchangsuoyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggongchangsuoyuyue), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GonggongchangsuoyuyueEntity gonggongchangsuoyuyue, HttpServletRequest request){
        EntityWrapper<GonggongchangsuoyuyueEntity> ew = new EntityWrapper<GonggongchangsuoyuyueEntity>();
    	PageUtils page = gonggongchangsuoyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gonggongchangsuoyuyue), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GonggongchangsuoyuyueEntity gonggongchangsuoyuyue){
       	EntityWrapper<GonggongchangsuoyuyueEntity> ew = new EntityWrapper<GonggongchangsuoyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gonggongchangsuoyuyue, "gonggongchangsuoyuyue")); 
        return R.ok().put("data", gonggongchangsuoyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GonggongchangsuoyuyueEntity gonggongchangsuoyuyue){
        EntityWrapper< GonggongchangsuoyuyueEntity> ew = new EntityWrapper< GonggongchangsuoyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gonggongchangsuoyuyue, "gonggongchangsuoyuyue")); 
		GonggongchangsuoyuyueView gonggongchangsuoyuyueView =  gonggongchangsuoyuyueService.selectView(ew);
		return R.ok("查询公共场所预约成功").put("data", gonggongchangsuoyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GonggongchangsuoyuyueEntity gonggongchangsuoyuyue = gonggongchangsuoyuyueService.selectById(id);
        return R.ok().put("data", gonggongchangsuoyuyue);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GonggongchangsuoyuyueEntity gonggongchangsuoyuyue = gonggongchangsuoyuyueService.selectById(id);
        return R.ok().put("data", gonggongchangsuoyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GonggongchangsuoyuyueEntity gonggongchangsuoyuyue, HttpServletRequest request){
    	gonggongchangsuoyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggongchangsuoyuyue);

        gonggongchangsuoyuyueService.insert(gonggongchangsuoyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GonggongchangsuoyuyueEntity gonggongchangsuoyuyue, HttpServletRequest request){
    	gonggongchangsuoyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gonggongchangsuoyuyue);

        gonggongchangsuoyuyueService.insert(gonggongchangsuoyuyue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GonggongchangsuoyuyueEntity gonggongchangsuoyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gonggongchangsuoyuyue);
        gonggongchangsuoyuyueService.updateById(gonggongchangsuoyuyue);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gonggongchangsuoyuyueService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GonggongchangsuoyuyueEntity> wrapper = new EntityWrapper<GonggongchangsuoyuyueEntity>();
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

		int count = gonggongchangsuoyuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
