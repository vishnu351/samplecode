package com.javainuse.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.FPIns;
import com.javainuse.model.Product;
import com.javainuse.model.Result;
import com.javainuse.service.EscrowRemovalService;

@RestController
public class EscrowRemovalController {

	private final EscrowRemovalService escrowRemovalService;

	@Autowired
	public EscrowRemovalController(EscrowRemovalService escrowRemovalService) {
		this.escrowRemovalService = escrowRemovalService;
	}

	@RequestMapping(value = "/guidlines", method = RequestMethod.GET, produces = "application/json")
	public List<Result> getQuestions() {

		Product product = new Product();
		Result result= new Result();
		product.setManufactured("08");
		FPIns fpins = new FPIns();
		List<FPIns> fplist = new ArrayList<FPIns>();
		fpins.setFLOAN("458855");
		fpins.setFLTEXT("flood ltr place");
		fplist.add(fpins);
		product.setfPInsList(fplist);

		List<Result> resultlist =escrowRemovalService.getProductDiscount(product,result);

		return resultlist;
	}

}
