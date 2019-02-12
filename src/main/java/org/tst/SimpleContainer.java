package org.tst;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SimpleContainer {
	
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
