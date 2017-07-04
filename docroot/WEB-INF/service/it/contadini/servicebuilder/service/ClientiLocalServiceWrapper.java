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

package it.contadini.servicebuilder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ClientiLocalService}.
 *
 * @author leo
 * @see ClientiLocalService
 * @generated
 */
public class ClientiLocalServiceWrapper implements ClientiLocalService,
	ServiceWrapper<ClientiLocalService> {
	public ClientiLocalServiceWrapper(ClientiLocalService clientiLocalService) {
		_clientiLocalService = clientiLocalService;
	}

	/**
	* Adds the clienti to the database. Also notifies the appropriate model listeners.
	*
	* @param clienti the clienti
	* @return the clienti that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.contadini.servicebuilder.model.Clienti addClienti(
		it.contadini.servicebuilder.model.Clienti clienti)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.addClienti(clienti);
	}

	/**
	* Creates a new clienti with the primary key. Does not add the clienti to the database.
	*
	* @param clientiId the primary key for the new clienti
	* @return the new clienti
	*/
	@Override
	public it.contadini.servicebuilder.model.Clienti createClienti(
		long clientiId) {
		return _clientiLocalService.createClienti(clientiId);
	}

	/**
	* Deletes the clienti with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti that was removed
	* @throws PortalException if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.contadini.servicebuilder.model.Clienti deleteClienti(
		long clientiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.deleteClienti(clientiId);
	}

	/**
	* Deletes the clienti from the database. Also notifies the appropriate model listeners.
	*
	* @param clienti the clienti
	* @return the clienti that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.contadini.servicebuilder.model.Clienti deleteClienti(
		it.contadini.servicebuilder.model.Clienti clienti)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.deleteClienti(clienti);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _clientiLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.contadini.servicebuilder.model.impl.ClientiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.contadini.servicebuilder.model.impl.ClientiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public it.contadini.servicebuilder.model.Clienti fetchClienti(
		long clientiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.fetchClienti(clientiId);
	}

	/**
	* Returns the clienti with the primary key.
	*
	* @param clientiId the primary key of the clienti
	* @return the clienti
	* @throws PortalException if a clienti with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.contadini.servicebuilder.model.Clienti getClienti(long clientiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.getClienti(clientiId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<it.contadini.servicebuilder.model.Clienti> getClientis(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.getClientis(start, end);
	}

	/**
	* Returns the number of clientis.
	*
	* @return the number of clientis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getClientisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.getClientisCount();
	}

	/**
	* Updates the clienti in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clienti the clienti
	* @return the clienti that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public it.contadini.servicebuilder.model.Clienti updateClienti(
		it.contadini.servicebuilder.model.Clienti clienti)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _clientiLocalService.updateClienti(clienti);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _clientiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_clientiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _clientiLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ClientiLocalService getWrappedClientiLocalService() {
		return _clientiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedClientiLocalService(
		ClientiLocalService clientiLocalService) {
		_clientiLocalService = clientiLocalService;
	}

	@Override
	public ClientiLocalService getWrappedService() {
		return _clientiLocalService;
	}

	@Override
	public void setWrappedService(ClientiLocalService clientiLocalService) {
		_clientiLocalService = clientiLocalService;
	}

	private ClientiLocalService _clientiLocalService;
}