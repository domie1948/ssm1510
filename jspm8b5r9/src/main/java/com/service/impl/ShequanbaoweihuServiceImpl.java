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


import com.dao.ShequanbaoweihuDao;
import com.entity.ShequanbaoweihuEntity;
import com.service.ShequanbaoweihuService;
import com.entity.vo.ShequanbaoweihuVO;
import com.entity.view.ShequanbaoweihuView;

@Service("shequanbaoweihuService")
public class ShequanbaoweihuServiceImpl extends ServiceImpl<ShequanbaoweihuDao, ShequanbaoweihuEntity> implements ShequanbaoweihuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequanbaoweihuEntity> page = this.selectPage(
                new Query<ShequanbaoweihuEntity>(params).getPage(),
                new EntityWrapper<ShequanbaoweihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequanbaoweihuEntity> wrapper) {
		  Page<ShequanbaoweihuView> page =new Query<ShequanbaoweihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequanbaoweihuVO> selectListVO(Wrapper<ShequanbaoweihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequanbaoweihuVO selectVO(Wrapper<ShequanbaoweihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequanbaoweihuView> selectListView(Wrapper<ShequanbaoweihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequanbaoweihuView selectView(Wrapper<ShequanbaoweihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
