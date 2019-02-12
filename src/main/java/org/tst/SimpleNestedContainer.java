package org.tst;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SimpleNestedContainer {
	
	private SimpleContainer data;

	public SimpleContainer getData() {
		return data;
	}

	public void setData(SimpleContainer data) {
		this.data = data;
	}

}
