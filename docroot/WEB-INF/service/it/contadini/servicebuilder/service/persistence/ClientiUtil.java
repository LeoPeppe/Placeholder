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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import it.contadini.servicebuilder.model.Clienti;

import java.util.List;

/**
 * The persistence utility for the clienti service. This utility wraps {@link ClientiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author leo
 * @see ClientiPersistence
 * @see ClientiPersistenceImpl
 * @generated
 */
public class ClientiUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Clienti clienti) {
		getPersistence().clearCache(clienti);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Clienti> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Clienti> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Clienti> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Clienti update(Clienti clienti) throws SystemException {
		return getPersistence().update(clienti);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Clienti update(Clienti clienti, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(clienti, serviceContext);
	}

	/**
	* Caches the clienti in the entity cache if it is enabled.
	*
	* @param clienti the clienti
	*/
	public static void cacheResult(
		it.contadini.servicebuilder.model.Clienti clienti) {
		getPersistence().cacheResult(clienti);
	}

	/**
	* Caches the clientis in the entity cache if it is enabled.
	*
	* @param clientis the clientis
	*/
	public static void cacheResult(
		java.util.List<it.contadini.servicebuilder.model.Clienti> clientis) {
		getPersistence().cacheResult(clientis);
	}

	/**
	* Creates a new clienti with the primary key. Does not add the clienti to the database.
	*
	* @param clientiId the primary key for the new clienti
	* @return the new clienti
	*/
	public static it.contadini.servicebuilder.model.Clienti create(
		long clientiId) {
		return getPersistence().create(clientiId);
	}

	/**
	* Removes the clienti with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti that was removed
	* @throws it.contadini.servicebuilder.NoSuchClientiException if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.contadini.servicebuilder.model.Clienti remove(
		long clientiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.contadini.servicebuilder.NoSuchClientiException {
		return getPersistence().remove(clientiId);
	}

	public static it.contadini.servicebuilder.model.Clienti updateImpl(
		it.contadini.servicebuilder.model.Clienti clienti)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(clienti);
	}

	/**
	* Returns the clienti with the primary key or throws a {@link it.contadini.servicebuilder.NoSuchClientiException} if it could not be found.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti
	* @throws it.contadini.servicebuilder.NoSuchClientiException if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.contadini.servicebuilder.model.Clienti findByPrimaryKey(
		long clientiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.contadini.servicebuilder.NoSuchClientiException {
		return getPersistence().findByPrimaryKey(clientiId);
	}

	/**
	* Returns the clienti with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti, or <code>null</code> if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.contadini.servicebuilder.model.Clienti fetchByPrimaryKey(
		long clientiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(clientiId);
	}

	/**
	* Returns all the clientis.
	*
	* @return the clientis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.contadini.servicebuilder.model.Clienti> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<it.contadini.servicebuilder.model.Clienti> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<it.contadini.servicebuilder.model.Clienti> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the clientis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of clientis.
	*
	* @return the number of clientis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ClientiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ClientiPersistence)PortletBeanLocatorUtil.locate(it.contadini.servicebuilder.service.ClpSerializer.getServletContextName(),
					ClientiPersistence.class.getName());

			ReferenceRegistry.registerReference(ClientiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ClientiPersistence persistence) {
	}

	private static ClientiPersistence _persistence;
}