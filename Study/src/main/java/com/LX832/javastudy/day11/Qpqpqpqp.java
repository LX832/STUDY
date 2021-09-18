package com.LX832.javastudy.day11;

import java.util.Objects;

public class Qpqpqpqp {
	int data1 = 20;
	String data2 = "dog";
	
	@Override
	public int hashCode() {
		return Objects.hash(data1, data2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Qpqpqpqp other = (Qpqpqpqp) obj;
		return data1 == other.data1 && Objects.equals(data2, other.data2);
	}
	@Override
	public String toString() {
		return "Qpqpqpqp [data1=" + data1 + ", data2=" + data2 + "]";
	}
	public String toString1() {
		return "Qpqpqpqp라는 클래스에는 두개의 필드가 있어요 자료는 " + data1 + "과" + data2 + "입니다.";
	}
	
	
	
	

}
