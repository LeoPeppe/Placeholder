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

package it.contadini.servicebuilder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Clienti}.
 * </p>
 *
 * @author leo
 * @see Clienti
 * @generated
 */
public class ClientiWrapper implements Clienti, ModelWrapper<Clienti> {
	public ClientiWrapper(Clienti clienti) {
		_clienti = clienti;
	}

	@Override
	public Class<?> getModelClass() {
		return Clienti.class;
	}

	@Override
	public String getModelClassName() {
		return Clienti.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("clientiId", getClientiId());
		attributes.put("nome", getNome());
		attributes.put("cognome", getCognome());
		attributes.put("email", getEmail());
		attributes.put("indirizzo", getIndirizzo());
		attributes.put("cap", getCap());
		attributes.put("telefono", getTelefono());
		attributes.put("dataCompilazione", getDataCompilazione());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long clientiId = (Long)attributes.get("clientiId");

		if (clientiId != null) {
			setClientiId(clientiId);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String cognome = (String)attributes.get("cognome");

		if (cognome != null) {
			setCognome(cognome);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String indirizzo = (String)attributes.get("indirizzo");

		if (indirizzo != null) {
			setIndirizzo(indirizzo);
		}

		String cap = (String)attributes.get("cap");

		if (cap != null) {
			setCap(cap);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		String dataCompilazione = (String)attributes.get("dataCompilazione");

		if (dataCompilazione != null) {
			setDataCompilazione(dataCompilazione);
		}
	}

	/**
	* Returns the primary key of this clienti.
	*
	* @return the primary key of this clienti
	*/
	@Override
	public long getPrimaryKey() {
		return _clienti.getPrimaryKey();
	}

	/**
	* Sets the primary key of this clienti.
	*
	* @param primaryKey the primary key of this clienti
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_clienti.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the clienti ID of this clienti.
	*
	* @return the clienti ID of this clienti
	*/
	@Override
	public long getClientiId() {
		return _clienti.getClientiId();
	}

	/**
	* Sets the clienti ID of this clienti.
	*
	* @param clientiId the clienti ID of this clienti
	*/
	@Override
	public void setClientiId(long clientiId) {
		_clienti.setClientiId(clientiId);
	}

	/**
	* Returns the nome of this clienti.
	*
	* @return the nome of this clienti
	*/
	@Override
	public java.lang.String getNome() {
		return _clienti.getNome();
	}

	/**
	* Sets the nome of this clienti.
	*
	* @param nome the nome of this clienti
	*/
	@Override
	public void setNome(java.lang.String nome) {
		_clienti.setNome(nome);
	}

	/**
	* Returns the cognome of this clienti.
	*
	* @return the cognome of this clienti
	*/
	@Override
	public java.lang.String getCognome() {
		return _clienti.getCognome();
	}

	/**
	* Sets the cognome of this clienti.
	*
	* @param cognome the cognome of this clienti
	*/
	@Override
	public void setCognome(java.lang.String cognome) {
		_clienti.setCognome(cognome);
	}

	/**
	* Returns the email of this clienti.
	*
	* @return the email of this clienti
	*/
	@Override
	public java.lang.String getEmail() {
		return _clienti.getEmail();
	}

	/**
	* Sets the email of this clienti.
	*
	* @param email the email of this clienti
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_clienti.setEmail(email);
	}

	/**
	* Returns the indirizzo of this clienti.
	*
	* @return the indirizzo of this clienti
	*/
	@Override
	public java.lang.String getIndirizzo() {
		return _clienti.getIndirizzo();
	}

	/**
	* Sets the indirizzo of this clienti.
	*
	* @param indirizzo the indirizzo of this clienti
	*/
	@Override
	public void setIndirizzo(java.lang.String indirizzo) {
		_clienti.setIndirizzo(indirizzo);
	}

	/**
	* Returns the cap of this clienti.
	*
	* @return the cap of this clienti
	*/
	@Override
	public java.lang.String getCap() {
		return _clienti.getCap();
	}

	/**
	* Sets the cap of this clienti.
	*
	* @param cap the cap of this clienti
	*/
	@Override
	public void setCap(java.lang.String cap) {
		_clienti.setCap(cap);
	}

	/**
	* Returns the telefono of this clienti.
	*
	* @return the telefono of this clienti
	*/
	@Override
	public java.lang.String getTelefono() {
		return _clienti.getTelefono();
	}

	/**
	* Sets the telefono of this clienti.
	*
	* @param telefono the telefono of this clienti
	*/
	@Override
	public void setTelefono(java.lang.String telefono) {
		_clienti.setTelefono(telefono);
	}

	/**
	* Returns the data compilazione of this clienti.
	*
	* @return the data compilazione of this clienti
	*/
	@Override
	public java.lang.String getDataCompilazione() {
		return _clienti.getDataCompilazione();
	}

	/**
	* Sets the data compilazione of this clienti.
	*
	* @param dataCompilazione the data compilazione of this clienti
	*/
	@Override
	public void setDataCompilazione(java.lang.String dataCompilazione) {
		_clienti.setDataCompilazione(dataCompilazione);
	}

	@Override
	public boolean isNew() {
		return _clienti.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_clienti.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _clienti.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_clienti.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _clienti.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _clienti.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_clienti.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _clienti.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_clienti.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_clienti.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_clienti.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ClientiWrapper((Clienti)_clienti.clone());
	}

	@Override
	public int compareTo(it.contadini.servicebuilder.model.Clienti clienti) {
		return _clienti.compareTo(clienti);
	}

	@Override
	public int hashCode() {
		return _clienti.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<it.contadini.servicebuilder.model.Clienti> toCacheModel() {
		return _clienti.toCacheModel();
	}

	@Override
	public it.contadini.servicebuilder.model.Clienti toEscapedModel() {
		return new ClientiWrapper(_clienti.toEscapedModel());
	}

	@Override
	public it.contadini.servicebuilder.model.Clienti toUnescapedModel() {
		return new ClientiWrapper(_clienti.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _clienti.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _clienti.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_clienti.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClientiWrapper)) {
			return false;
		}

		ClientiWrapper clientiWrapper = (ClientiWrapper)obj;

		if (Validator.equals(_clienti, clientiWrapper._clienti)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Clienti getWrappedClienti() {
		return _clienti;
	}

	@Override
	public Clienti getWrappedModel() {
		return _clienti;
	}

	@Override
	public void resetOriginalValues() {
		_clienti.resetOriginalValues();
	}

	private Clienti _clienti;
}