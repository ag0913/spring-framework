package org.springframework.selfEditor;

import java.beans.PropertyEditorSupport;

public class AdressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] t = text.split("_");
		Address address = new Address();
		address.setProvince(t[0]);
		address.setCity(t[1]);
		address.setTown(t[2]);
		setValue(address);
	}
}
