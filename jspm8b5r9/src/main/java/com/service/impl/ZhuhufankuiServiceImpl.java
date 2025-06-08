package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuhufankuiDao;
import com.entity.ZhuhufankuiEntity;
import com.service.ZhuhufankuiService;
import com.entity.vo.ZhuhufankuiVO;
import com.entity.view.ZhuhufankuiView;

@Service("zhuhufankuiService")
public class ZhuhufankuiServiceImpl extends ServiceImpl<ZhuhufankuiDao, ZhuhufankuiEntity> implements ZhuhufankuiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuhufankuiEntity> page = this.selectPage(
                new Query<ZhuhufankuiEntity>(params).getPage(),
                new EntityWrapper<ZhuhufankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuhufankuiEntity> wrapper) {
		  Page<ZhuhufankuiView> page =new Query<ZhuhufankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuhufankuiVO> selectListVO(Wrapper<ZhuhufankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuhufankuiVO selectVO(Wrapper<ZhuhufankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuhufankuiView> selectListView(Wrapper<ZhuhufankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuhufankuiView selectView(Wrapper<ZhuhufankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
