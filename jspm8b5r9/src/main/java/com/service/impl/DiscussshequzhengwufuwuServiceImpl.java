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


import com.dao.DiscussshequzhengwufuwuDao;
import com.entity.DiscussshequzhengwufuwuEntity;
import com.service.DiscussshequzhengwufuwuService;
import com.entity.vo.DiscussshequzhengwufuwuVO;
import com.entity.view.DiscussshequzhengwufuwuView;

@Service("discussshequzhengwufuwuService")
public class DiscussshequzhengwufuwuServiceImpl extends ServiceImpl<DiscussshequzhengwufuwuDao, DiscussshequzhengwufuwuEntity> implements DiscussshequzhengwufuwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshequzhengwufuwuEntity> page = this.selectPage(
                new Query<DiscussshequzhengwufuwuEntity>(params).getPage(),
                new EntityWrapper<DiscussshequzhengwufuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshequzhengwufuwuEntity> wrapper) {
		  Page<DiscussshequzhengwufuwuView> page =new Query<DiscussshequzhengwufuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshequzhengwufuwuVO> selectListVO(Wrapper<DiscussshequzhengwufuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshequzhengwufuwuVO selectVO(Wrapper<DiscussshequzhengwufuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshequzhengwufuwuView> selectListView(Wrapper<DiscussshequzhengwufuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshequzhengwufuwuView selectView(Wrapper<DiscussshequzhengwufuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
