package com.formacionbdi.springboot.app.siga.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.siga.entity.SagAccCm;
import com.formacionbdi.springboot.app.siga.entity.SagAccCn;
import com.formacionbdi.springboot.app.siga.entity.SagO;
import com.formacionbdi.springboot.app.siga.service.ISigaCmService;
import com.formacionbdi.springboot.app.siga.service.ISigaCnService;
import com.formacionbdi.springboot.app.siga.service.ISigaOService;


@RestController
public class SigaController {
	

	@Autowired
	private ISigaCnService restCnService;
	@GetMapping("/listar-sag-acc-con")
	public List<SagAccCn> listarCn(){
		return restCnService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private ISigaCmService restCmService;
	@GetMapping("/listar-sag-acc-com")
	public List<SagAccCm> listarCm(){
		return restCmService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private ISigaOService restOService;
	@GetMapping("/listar-sag-ordenes")
	public List<SagO> listarO(){
		return restOService.findAll().stream().collect(Collectors.toList());
	}
	/*
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		Producto producto = productoService.findByID(id);
		//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		producto.setPort(port);
		return productoService.findByID(id);
	}
	*/
	@GetMapping("/")
	public String prueb() {
		return "  Lista Servicios  \n"
				+ "*******************\n"
				+ "/listar-sag-acc-com\n"
				+ "/listar-sag-acc-con\n"
				+ "/listar-sag-ordenes\n";
	}
}
