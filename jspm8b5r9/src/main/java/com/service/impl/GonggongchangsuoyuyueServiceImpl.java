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


import com.dao.GonggongchangsuoyuyueDao;
import com.entity.GonggongchangsuoyuyueEntity;
import com.service.GonggongchangsuoyuyueService;
import com.entity.vo.GonggongchangsuoyuyueVO;
import com.entity.view.GonggongchangsuoyuyueView;

@Service("gonggongchangsuoyuyueService")
public class GonggongchangsuoyuyueServiceImpl extends ServiceImpl<GonggongchangsuoyuyueDao, GonggongchangsuoyuyueEntity> implements GonggongchangsuoyuyueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonggongchangsuoyuyueEntity> page = this.selectPage(
                new Query<GonggongchangsuoyuyueEntity>(params).getPage(),
                new EntityWrapper<GonggongchangsuoyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonggongchangsuoyuyueEntity> wrapper) {
		  Page<GonggongchangsuoyuyueView> page =new Query<GonggongchangsuoyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonggongchangsuoyuyueVO> selectListVO(Wrapper<GonggongchangsuoyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonggongchangsuoyuyueVO selectVO(Wrapper<GonggongchangsuoyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonggongchangsuoyuyueView> selectListView(Wrapper<GonggongchangsuoyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonggongchangsuoyuyueView selectView(Wrapper<GonggongchangsuoyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
