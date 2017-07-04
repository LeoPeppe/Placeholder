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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.contadini.servicebuilder.service.http.ClientiServiceSoap}.
 *
 * @author leo
 * @see it.contadini.servicebuilder.service.http.ClientiServiceSoap
 * @generated
 */
public class ClientiSoap implements Serializable {
	public static ClientiSoap toSoapModel(Clienti model) {
		ClientiSoap soapModel = new ClientiSoap();

		soapModel.setClientiId(model.getClientiId());
		soapModel.setNome(model.getNome());
		soapModel.setCognome(model.getCognome());
		soapModel.setEmail(model.getEmail());
		soapModel.setIndirizzo(model.getIndirizzo());
		soapModel.setCap(model.getCap());
		soapModel.setTelefono(model.getTelefono());
		soapModel.setDataCompilazione(model.getDataCompilazione());

		return soapModel;
	}

	public static ClientiSoap[] toSoapModels(Clienti[] models) {
		ClientiSoap[] soapModels = new ClientiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ClientiSoap[][] toSoapModels(Clienti[][] models) {
		ClientiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ClientiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ClientiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ClientiSoap[] toSoapModels(List<Clienti> models) {
		List<ClientiSoap> soapModels = new ArrayList<ClientiSoap>(models.size());

		for (Clienti model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ClientiSoap[soapModels.size()]);
	}

	public ClientiSoap() {
	}

	public long getPrimaryKey() {
		return _clientiId;
	}

	public void setPrimaryKey(long pk) {
		setClientiId(pk);
	}

	public long getClientiId() {
		return _clientiId;
	}

	public void setClientiId(long clientiId) {
		_clientiId = clientiId;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getCognome() {
		return _cognome;
	}

	public void setCognome(String cognome) {
		_cognome = cognome;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getIndirizzo() {
		return _indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		_indirizzo = indirizzo;
	}

	public String getCap() {
		return _cap;
	}

	public void setCap(String cap) {
		_cap = cap;
	}

	public String getTelefono() {
		return _telefono;
	}

	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	public String getDataCompilazione() {
		return _dataCompilazione;
	}

	public void setDataCompilazione(String dataCompilazione) {
		_dataCompilazione = dataCompilazione;
	}

	private long _clientiId;
	private String _nome;
	private String _cognome;
	private String _email;
	private String _indirizzo;
	private String _cap;
	private String _telefono;
	private String _dataCompilazione;
}