package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhenxinxiView;


/**
 * 问诊信息
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:11:18
 */
public interface WenzhenxinxiService extends IService<WenzhenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhenxinxiVO> selectListVO(Wrapper<WenzhenxinxiEntity> wrapper);
   	
   	WenzhenxinxiVO selectVO(@Param("ew") Wrapper<WenzhenxinxiEntity> wrapper);
   	
   	List<WenzhenxinxiView> selectListView(Wrapper<WenzhenxinxiEntity> wrapper);
   	
   	WenzhenxinxiView selectView(@Param("ew") Wrapper<WenzhenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhenxinxiEntity> wrapper);
   	

}

