package com.devsuperior.dslearnbds.entities.enums;

public enum DeliverStatus {
	
	PENDING(0),
	ACCEPTED(1),
	REJECTED(2);

	private int code;
	
	DeliverStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static DeliverStatus valueOf(int code) {
		for (DeliverStatus value : DeliverStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid DeliverStatus code");
	}
}
