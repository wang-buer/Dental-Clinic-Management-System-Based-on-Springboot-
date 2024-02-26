package com.dao;

import com.entity.WenzhenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhenxinxiVO;
import com.entity.view.WenzhenxinxiView;


/**
 * 问诊信息
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:11:18
 */
public interface WenzhenxinxiDao extends BaseMapper<WenzhenxinxiEntity> {
	
	List<WenzhenxinxiVO> selectListVO(@Param("ew") Wrapper<WenzhenxinxiEntity> wrapper);
	
	WenzhenxinxiVO selectVO(@Param("ew") Wrapper<WenzhenxinxiEntity> wrapper);
	
	List<WenzhenxinxiView> selectListView(@Param("ew") Wrapper<WenzhenxinxiEntity> wrapper);

	List<WenzhenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhenxinxiEntity> wrapper);
	
	WenzhenxinxiView selectView(@Param("ew") Wrapper<WenzhenxinxiEntity> wrapper);
	

}
