package fr.spark.testonline.services;

import java.io.Serializable;

/**
 * @author
 */
public interface CrudService<T, ID extends Serializable> {

	T save(T entity);

	Iterable<T> save(Iterable<T> entities);

	T findOne(ID id);

	boolean exists(ID id);

	long count();

	void delete(ID id);

	void delete(T entity);

	void delete(Iterable<? extends T> entities);

	void deleteAll();

	Iterable<T> findAll();

}
