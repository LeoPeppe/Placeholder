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

package it.contadini.servicebuilder.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import it.contadini.servicebuilder.model.Clienti;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Clienti in entity cache.
 *
 * @author leo
 * @see Clienti
 * @generated
 */
public class ClientiCacheModel implements CacheModel<Clienti>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{clientiId=");
		sb.append(clientiId);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", cognome=");
		sb.append(cognome);
		sb.append(", email=");
		sb.append(email);
		sb.append(", indirizzo=");
		sb.append(indirizzo);
		sb.append(", cap=");
		sb.append(cap);
		sb.append(", telefono=");
		sb.append(telefono);
		sb.append(", dataCompilazione=");
		sb.append(dataCompilazione);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Clienti toEntityModel() {
		ClientiImpl clientiImpl = new ClientiImpl();

		clientiImpl.setClientiId(clientiId);

		if (nome == null) {
			clientiImpl.setNome(StringPool.BLANK);
		}
		else {
			clientiImpl.setNome(nome);
		}

		if (cognome == null) {
			clientiImpl.setCognome(StringPool.BLANK);
		}
		else {
			clientiImpl.setCognome(cognome);
		}

		if (email == null) {
			clientiImpl.setEmail(StringPool.BLANK);
		}
		else {
			clientiImpl.setEmail(email);
		}

		if (indirizzo == null) {
			clientiImpl.setIndirizzo(StringPool.BLANK);
		}
		else {
			clientiImpl.setIndirizzo(indirizzo);
		}

		if (cap == null) {
			clientiImpl.setCap(StringPool.BLANK);
		}
		else {
			clientiImpl.setCap(cap);
		}

		if (telefono == null) {
			clientiImpl.setTelefono(StringPool.BLANK);
		}
		else {
			clientiImpl.setTelefono(telefono);
		}

		if (dataCompilazione == null) {
			clientiImpl.setDataCompilazione(StringPool.BLANK);
		}
		else {
			clientiImpl.setDataCompilazione(dataCompilazione);
		}

		clientiImpl.resetOriginalValues();

		return clientiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		clientiId = objectInput.readLong();
		nome = objectInput.readUTF();
		cognome = objectInput.readUTF();
		email = objectInput.readUTF();
		indirizzo = objectInput.readUTF();
		cap = objectInput.readUTF();
		telefono = objectInput.readUTF();
		dataCompilazione = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(clientiId);

		if (nome == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (cognome == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cognome);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (indirizzo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(indirizzo);
		}

		if (cap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cap);
		}

		if (telefono == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telefono);
		}

		if (dataCompilazione == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dataCompilazione);
		}
	}

	public long clientiId;
	public String nome;
	public String cognome;
	public String email;
	public String indirizzo;
	public String cap;
	public String telefono;
	public String dataCompilazione;
}