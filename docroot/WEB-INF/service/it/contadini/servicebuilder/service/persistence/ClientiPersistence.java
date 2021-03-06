/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.contadini.servicebuilder.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import it.contadini.servicebuilder.model.Clienti;

/**
 * The persistence interface for the clienti service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author leo
 * @see ClientiPersistenceImpl
 * @see ClientiUtil
 * @generated
 */
public interface ClientiPersistence extends BasePersistence<Clienti> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClientiUtil} to access the clienti persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the clienti in the entity cache if it is enabled.
	*
	* @param clienti the clienti
	*/
	public void cacheResult(it.contadini.servicebuilder.model.Clienti clienti);

	/**
	* Caches the clientis in the entity cache if it is enabled.
	*
	* @param clientis the clientis
	*/
	public void cacheResult(
		java.util.List<it.contadini.servicebuilder.model.Clienti> clientis);

	/**
	* Creates a new clienti with the primary key. Does not add the clienti to the database.
	*
	* @param clientiId the primary key for the new clienti
	* @return the new clienti
	*/
	public it.contadini.servicebuilder.model.Clienti create(long clientiId);

	/**
	* Removes the clienti with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti that was removed
	* @throws it.contadini.servicebuilder.NoSuchClientiException if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.contadini.servicebuilder.model.Clienti remove(long clientiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.contadini.servicebuilder.NoSuchClientiException;

	public it.contadini.servicebuilder.model.Clienti updateImpl(
		it.contadini.servicebuilder.model.Clienti clienti)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the clienti with the primary key or throws a {@link it.contadini.servicebuilder.NoSuchClientiException} if it could not be found.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti
	* @throws it.contadini.servicebuilder.NoSuchClientiException if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.contadini.servicebuilder.model.Clienti findByPrimaryKey(
		long clientiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.contadini.servicebuilder.NoSuchClientiException;

	/**
	* Returns the clienti with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti, or <code>null</code> if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.contadini.servicebuilder.model.Clienti fetchByPrimaryKey(
		long clientiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the clientis.
	*
	* @return the clientis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.contadini.servicebuilder.model.Clienti> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the clientis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.contadini.servicebuilder.model.impl.ClientiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clientis
	* @param end the upper bound of the range of clientis (not inclusive)
	* @return the range of clientis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.contadini.servicebuilder.model.Clienti> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the clientis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.contadini.servicebuilder.model.impl.ClientiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clientis
	* @param end the upper bound of the range of clientis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clientis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.contadini.servicebuilder.model.Clienti> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the clientis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of clientis.
	*
	* @return the number of clientis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}