package com.MotherSon.CRM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MotherSon.CRM.models.HotelPrice;
import com.MotherSon.CRM.security.services.HotelPriceService;

@RestController
	@RequestMapping("/Motherson/crm/v1/hotelprice")
	public class HotelPriceController {
		
		@Autowired
		private HotelPriceService hotelpriceService;
		
		
		//@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
		@PostMapping("/create")
		public HotelPrice addHotelPrice(@RequestBody HotelPrice hotelprice) {
			return this.hotelpriceService.addHotelPrice(hotelprice);

	}
}
