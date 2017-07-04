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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import it.contadini.servicebuilder.service.ClientiLocalServiceUtil;
import it.contadini.servicebuilder.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leo
 */
public class ClientiClp extends BaseModelImpl<Clienti> implements Clienti {
	public ClientiClp() {
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
	public long getPrimaryKey() {
		return _clientiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setClientiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _clientiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getClientiId() {
		return _clientiId;
	}

	@Override
	public void setClientiId(long clientiId) {
		_clientiId = clientiId;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setClientiId", long.class);

				method.invoke(_clientiRemoteModel, clientiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNome() {
		return _nome;
	}

	@Override
	public void setNome(String nome) {
		_nome = nome;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setNome", String.class);

				method.invoke(_clientiRemoteModel, nome);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCognome() {
		return _cognome;
	}

	@Override
	public void setCognome(String cognome) {
		_cognome = cognome;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setCognome", String.class);

				method.invoke(_clientiRemoteModel, cognome);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_clientiRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIndirizzo() {
		return _indirizzo;
	}

	@Override
	public void setIndirizzo(String indirizzo) {
		_indirizzo = indirizzo;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setIndirizzo", String.class);

				method.invoke(_clientiRemoteModel, indirizzo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCap() {
		return _cap;
	}

	@Override
	public void setCap(String cap) {
		_cap = cap;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setCap", String.class);

				method.invoke(_clientiRemoteModel, cap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTelefono() {
		return _telefono;
	}

	@Override
	public void setTelefono(String telefono) {
		_telefono = telefono;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setTelefono", String.class);

				method.invoke(_clientiRemoteModel, telefono);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDataCompilazione() {
		return _dataCompilazione;
	}

	@Override
	public void setDataCompilazione(String dataCompilazione) {
		_dataCompilazione = dataCompilazione;

		if (_clientiRemoteModel != null) {
			try {
				Class<?> clazz = _clientiRemoteModel.getClass();

				Method method = clazz.getMethod("setDataCompilazione",
						String.class);

				method.invoke(_clientiRemoteModel, dataCompilazione);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getClientiRemoteModel() {
		return _clientiRemoteModel;
	}

	public void setClientiRemoteModel(BaseModel<?> clientiRemoteModel) {
		_clientiRemoteModel = clientiRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _clientiRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_clientiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ClientiLocalServiceUtil.addClienti(this);
		}
		else {
			ClientiLocalServiceUtil.updateClienti(this);
		}
	}

	@Override
	public Clienti toEscapedModel() {
		return (Clienti)ProxyUtil.newProxyInstance(Clienti.class.getClassLoader(),
			new Class[] { Clienti.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ClientiClp clone = new ClientiClp();

		clone.setClientiId(getClientiId());
		clone.setNome(getNome());
		clone.setCognome(getCognome());
		clone.setEmail(getEmail());
		clone.setIndirizzo(getIndirizzo());
		clone.setCap(getCap());
		clone.setTelefono(getTelefono());
		clone.setDataCompilazione(getDataCompilazione());

		return clone;
	}

	@Override
	public int compareTo(Clienti clienti) {
		int value = 0;

		if (getClientiId() < clienti.getClientiId()) {
			value = -1;
		}
		else if (getClientiId() > clienti.getClientiId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClientiClp)) {
			return false;
		}

		ClientiClp clienti = (ClientiClp)obj;

		long primaryKey = clienti.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{clientiId=");
		sb.append(getClientiId());
		sb.append(", nome=");
		sb.append(getNome());
		sb.append(", cognome=");
		sb.append(getCognome());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", indirizzo=");
		sb.append(getIndirizzo());
		sb.append(", cap=");
		sb.append(getCap());
		sb.append(", telefono=");
		sb.append(getTelefono());
		sb.append(", dataCompilazione=");
		sb.append(getDataCompilazione());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("it.contadini.servicebuilder.model.Clienti");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>clientiId</column-name><column-value><![CDATA[");
		sb.append(getClientiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nome</column-name><column-value><![CDATA[");
		sb.append(getNome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cognome</column-name><column-value><![CDATA[");
		sb.append(getCognome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>indirizzo</column-name><column-value><![CDATA[");
		sb.append(getIndirizzo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cap</column-name><column-value><![CDATA[");
		sb.append(getCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefono</column-name><column-value><![CDATA[");
		sb.append(getTelefono());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataCompilazione</column-name><column-value><![CDATA[");
		sb.append(getDataCompilazione());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _clientiId;
	private String _nome;
	private String _cognome;
	private String _email;
	private String _indirizzo;
	private String _cap;
	private String _telefono;
	private String _dataCompilazione;
	private BaseModel<?> _clientiRemoteModel;
	private Class<?> _clpSerializerClass = it.contadini.servicebuilder.service.ClpSerializer.class;
}