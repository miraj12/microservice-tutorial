package com.mycompany.microservice.tutorial;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
public class MobileSuitPostDto implements Serializable {

	@NotNull
	private String modelName;
	
	@NotNull
    @Size(min = 1)
	private List<String> weapons;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public List<String> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<String> weapons) {
		this.weapons = weapons;
	}
	
	
}
