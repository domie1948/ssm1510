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


import com.dao.ShequzhengwufuwuDao;
import com.entity.ShequzhengwufuwuEntity;
import com.service.ShequzhengwufuwuService;
import com.entity.vo.ShequzhengwufuwuVO;
import com.entity.view.ShequzhengwufuwuView;

@Service("shequzhengwufuwuService")
public class ShequzhengwufuwuServiceImpl extends ServiceImpl<ShequzhengwufuwuDao, ShequzhengwufuwuEntity> implements ShequzhengwufuwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequzhengwufuwuEntity> page = this.selectPage(
                new Query<ShequzhengwufuwuEntity>(params).getPage(),
                new EntityWrapper<ShequzhengwufuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequzhengwufuwuEntity> wrapper) {
		  Page<ShequzhengwufuwuView> page =new Query<ShequzhengwufuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequzhengwufuwuVO> selectListVO(Wrapper<ShequzhengwufuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequzhengwufuwuVO selectVO(Wrapper<ShequzhengwufuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequzhengwufuwuView> selectListView(Wrapper<ShequzhengwufuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequzhengwufuwuView selectView(Wrapper<ShequzhengwufuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
