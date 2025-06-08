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

import com.entity.ShequzhengwufuwuEntity;
import com.entity.view.ShequzhengwufuwuView;

import com.service.ShequzhengwufuwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 社区政务服务
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
@RestController
@RequestMapping("/shequzhengwufuwu")
public class ShequzhengwufuwuController {
    @Autowired
    private ShequzhengwufuwuService shequzhengwufuwuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequzhengwufuwuEntity shequzhengwufuwu, HttpServletRequest request){

        EntityWrapper<ShequzhengwufuwuEntity> ew = new EntityWrapper<ShequzhengwufuwuEntity>();
    	PageUtils page = shequzhengwufuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequzhengwufuwu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequzhengwufuwuEntity shequzhengwufuwu, HttpServletRequest request){
        EntityWrapper<ShequzhengwufuwuEntity> ew = new EntityWrapper<ShequzhengwufuwuEntity>();
    	PageUtils page = shequzhengwufuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequzhengwufuwu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequzhengwufuwuEntity shequzhengwufuwu){
       	EntityWrapper<ShequzhengwufuwuEntity> ew = new EntityWrapper<ShequzhengwufuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequzhengwufuwu, "shequzhengwufuwu")); 
        return R.ok().put("data", shequzhengwufuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequzhengwufuwuEntity shequzhengwufuwu){
        EntityWrapper< ShequzhengwufuwuEntity> ew = new EntityWrapper< ShequzhengwufuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequzhengwufuwu, "shequzhengwufuwu")); 
		ShequzhengwufuwuView shequzhengwufuwuView =  shequzhengwufuwuService.selectView(ew);
		return R.ok("查询社区政务服务成功").put("data", shequzhengwufuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequzhengwufuwuEntity shequzhengwufuwu = shequzhengwufuwuService.selectById(id);
        return R.ok().put("data", shequzhengwufuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequzhengwufuwuEntity shequzhengwufuwu = shequzhengwufuwuService.selectById(id);
        return R.ok().put("data", shequzhengwufuwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequzhengwufuwuEntity shequzhengwufuwu, HttpServletRequest request){
    	shequzhengwufuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequzhengwufuwu);

        shequzhengwufuwuService.insert(shequzhengwufuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequzhengwufuwuEntity shequzhengwufuwu, HttpServletRequest request){
    	shequzhengwufuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequzhengwufuwu);

        shequzhengwufuwuService.insert(shequzhengwufuwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShequzhengwufuwuEntity shequzhengwufuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequzhengwufuwu);
        shequzhengwufuwuService.updateById(shequzhengwufuwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequzhengwufuwuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShequzhengwufuwuEntity> wrapper = new EntityWrapper<ShequzhengwufuwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shequzhengwufuwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
