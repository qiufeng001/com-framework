package com.framework.web.controller;

import com.framework.core.query.PageResult;
import com.framework.core.query.Pagenation;
import com.framework.core.query.Query;
import com.framework.core.security.IEntity;
import java.util.List;


/**
 * 
 * 控制层接口
 * 
 * @author zhonghui
 *
 * @param <T>
 * @param <K>
 */
public interface IController<T extends IEntity, K> {

	public T create(T entity);

 	public T update(T entity);

 	public Integer deleteByParams(Query query);
 	
 	public Integer deleteByPrimaryKey(K id);
	
	public T findByParam(Query query);
	
	public T findByPrimaryKey(K id);

	public List<T> selectByParams(Query query);
	
	public PageResult<T> selectByPage(Query query, Pagenation page);
	
}
