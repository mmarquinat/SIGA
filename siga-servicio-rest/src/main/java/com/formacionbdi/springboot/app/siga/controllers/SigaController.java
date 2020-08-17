package com.formacionbdi.springboot.app.siga.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.siga.entity.SagAccCn;
import com.formacionbdi.springboot.app.siga.service.ISigaService;


@RestController
public class SigaController {
	

	@Autowired
	private ISigaService restService;
	
	@GetMapping("/listar")
	public List<SagAccCn> listar(){
		return restService.findAll().stream().collect(Collectors.toList());
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
	@GetMapping("/pruebita")
	public String prueb() {
		return "Hello World :)";
	}
}
