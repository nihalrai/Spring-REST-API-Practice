package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.CarPartsInventory;
import com.lti.entity.CarPart;

@RestController
@CrossOrigin
public class CarPartsRestController {

	@Autowired
	private CarPartsInventory carPartsInventory;

	@RequestMapping(path = "/viewCarParts.api", produces = "application/json")
	public List<CarPart> getCarParts() {
	List<CarPart> list = carPartsInventory.getAvailableParts();
	return list;
}

	@RequestMapping(path = "/addCarPart.api", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	public Status addCarPart(@RequestBody CarPart carpart) {
		carPartsInventory.addNewPart(carpart);
		Status status = new Status();
		status.setMessage("Success");
		return status;
	}
	
	public static class Status {
		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}
}