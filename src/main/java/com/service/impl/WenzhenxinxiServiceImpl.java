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


import com.dao.WenzhenxinxiDao;
import com.entity.WenzhenxinxiEntity;
import com.service.WenzhenxinxiService;
import com.entity.vo.WenzhenxinxiVO;
import com.entity.view.WenzhenxinxiView;

@Service("wenzhenxinxiService")
public class WenzhenxinxiServiceImpl extends ServiceImpl<WenzhenxinxiDao, WenzhenxinxiEntity> implements WenzhenxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhenxinxiEntity> page = this.selectPage(
                new Query<WenzhenxinxiEntity>(params).getPage(),
                new EntityWrapper<WenzhenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhenxinxiEntity> wrapper) {
		  Page<WenzhenxinxiView> page =new Query<WenzhenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhenxinxiVO> selectListVO(Wrapper<WenzhenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhenxinxiVO selectVO(Wrapper<WenzhenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhenxinxiView> selectListView(Wrapper<WenzhenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhenxinxiView selectView(Wrapper<WenzhenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
