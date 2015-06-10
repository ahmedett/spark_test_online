package fr.spark.testonline.services;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.util.Assert;

public abstract class AbstractCrudService<T, ID extends Serializable>
		implements CrudService<T, ID> {

	private final CrudRepository<T, ID> crudRepository;

	/**
	 * @param crudRepository
	 *            repository must not be {@literal null}.
	 */
	public AbstractCrudService(CrudRepository<T, ID> crudRepository) {
		Assert.notNull(crudRepository);
		this.crudRepository = crudRepository;
	}

	@Override
	public T save(T entity) {
		return crudRepository.save(entity);
	}

	@Override
	public Iterable<T> save(Iterable<T> entities) {
		return crudRepository.save(entities);
	}

	@Override
	public T findOne(ID id) {
		return crudRepository.findOne(id);
	}

	@Override
	public boolean exists(ID id) {
		return crudRepository.exists(id);
	}

	@Override
	public long count() {
		return crudRepository.count();
	}

	@Override
	public void delete(ID id) {
		crudRepository.delete(id);
	}

	@Override
	public void delete(T entity) {
		crudRepository.delete(entity);
	}

	@Override
	public void delete(Iterable<? extends T> entities) {
		crudRepository.delete(entities);
	}

	@Override
	public void deleteAll() {
		crudRepository.deleteAll();
	}

	@Override
	public Iterable<T> findAll() {
		return crudRepository.findAll();
	}
}
