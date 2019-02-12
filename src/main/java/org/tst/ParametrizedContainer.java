package org.tst;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ParametrizedContainer<T> {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
