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


import com.dao.ShequyonghuDao;
import com.entity.ShequyonghuEntity;
import com.service.ShequyonghuService;
import com.entity.vo.ShequyonghuVO;
import com.entity.view.ShequyonghuView;

@Service("shequyonghuService")
public class ShequyonghuServiceImpl extends ServiceImpl<ShequyonghuDao, ShequyonghuEntity> implements ShequyonghuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequyonghuEntity> page = this.selectPage(
                new Query<ShequyonghuEntity>(params).getPage(),
                new EntityWrapper<ShequyonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequyonghuEntity> wrapper) {
		  Page<ShequyonghuView> page =new Query<ShequyonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequyonghuVO> selectListVO(Wrapper<ShequyonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequyonghuVO selectVO(Wrapper<ShequyonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequyonghuView> selectListView(Wrapper<ShequyonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequyonghuView selectView(Wrapper<ShequyonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
