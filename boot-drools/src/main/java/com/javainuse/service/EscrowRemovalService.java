package com.javainuse.service;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.FPIns;
import com.javainuse.model.Product;
import com.javainuse.model.Result;

@Service
public class EscrowRemovalService {

	private final KieContainer kieContainer;

	@Autowired
	public EscrowRemovalService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public List<Result> getProductDiscount(Product product,Result result) {
		//get the stateful session
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(product);
		kieSession.insert(result);
		kieSession.setGlobal("res", new ArrayList<Result>());
		kieSession.fireAllRules();
		kieSession.dispose();
		return product.getResult();
	}
}