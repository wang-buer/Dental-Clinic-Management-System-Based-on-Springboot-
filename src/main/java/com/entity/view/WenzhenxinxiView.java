package com.entity.view;

import com.entity.WenzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问诊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-18 10:11:18
 */
@TableName("wenzhenxinxi")
public class WenzhenxinxiView  extends WenzhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhenxinxiView(){
	}
 
 	public WenzhenxinxiView(WenzhenxinxiEntity wenzhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}