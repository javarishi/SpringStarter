package com.h2k.spring.factory;

public class RuleFactory {
	
	private String param;
	
	/**
	 * @return the param
	 */
	public String getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(String param) {
		this.param = param;
	}

	public Rule getRule() {
		if(param.equalsIgnoreCase("INS")) {
			return new InsuranceRule();
		}
		return null;
	}

}
