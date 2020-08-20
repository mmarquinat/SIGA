package com.formacionbdi.springboot.app.siga.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.siga.entity.CatalogoBienS;
import com.formacionbdi.springboot.app.siga.entity.ClaseBienS;
import com.formacionbdi.springboot.app.siga.entity.FamiliaBienS;
import com.formacionbdi.springboot.app.siga.entity.GrupoBienS;
import com.formacionbdi.springboot.app.siga.entity.SagAccCm;
import com.formacionbdi.springboot.app.siga.entity.SagAccCn;
import com.formacionbdi.springboot.app.siga.entity.SagO;
import com.formacionbdi.springboot.app.siga.entity.SagR;
import com.formacionbdi.springboot.app.siga.entity.UnidadM;
import com.formacionbdi.springboot.app.siga.service.IS_CatalogoBienS_Service;
import com.formacionbdi.springboot.app.siga.service.IS_ClaseBienS_Service;
import com.formacionbdi.springboot.app.siga.service.IS_FamiliaBienS_Service;
import com.formacionbdi.springboot.app.siga.service.IS_GrupoBienS_Service;
import com.formacionbdi.springboot.app.siga.service.IS_SagAccCm_Service;
import com.formacionbdi.springboot.app.siga.service.IS_SagAccCn_Service;
import com.formacionbdi.springboot.app.siga.service.IS_SagO_Service;
import com.formacionbdi.springboot.app.siga.service.IS_SagR_Service;
import com.formacionbdi.springboot.app.siga.service.IS_UnidadM_Service;


@RestController
public class SigaController {
	
	@Autowired
	private IS_CatalogoBienS_Service restCBSService;
	@GetMapping("/listar-catalogo-bien-serv")
	public List<CatalogoBienS> listarCBS(){
		return restCBSService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private IS_ClaseBienS_Service restClBSService;
	@GetMapping("/listar-clase-bien-serv")
	public List<ClaseBienS> listarClBS(){
		return restClBSService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private IS_FamiliaBienS_Service restFBSService;
	@GetMapping("/listar-familia-bien-serv")
	public List<FamiliaBienS> listarFBS(){
		return restFBSService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private IS_GrupoBienS_Service restGBSService;
	@GetMapping("/listar-grupo-bien-serv")
	public List<GrupoBienS> listarGBS(){
		return restGBSService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private IS_SagAccCn_Service restCnService;
	@GetMapping("/listar-sag-acc-con")
	public List<SagAccCn> listarCn(){
		return restCnService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private IS_SagAccCm_Service restCmService;
	@GetMapping("/listar-sag-acc-com")
	public List<SagAccCm> listarCm(){
		return restCmService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private IS_SagO_Service restOService;
	@GetMapping("/listar-sag-ordenes")
	public List<SagO> listarO(){
		return restOService.findAll().stream().collect(Collectors.toList());
	}
	
	@Autowired
	private IS_SagR_Service restRService;
	@GetMapping("/listar-sag-rrhh")
	public List<SagR> listarR(){
		return restRService.findAll().stream().collect(Collectors.toList());
	}

	@Autowired
	private IS_UnidadM_Service restUMService;
	@GetMapping("/listar-unidad-medida")
	public List<UnidadM> listarUM(){
		return restUMService.findAll().stream().collect(Collectors.toList());
	}
	
	
	@GetMapping("/")
	public String test() {
		return "  Lista Servicios  \n"
				+ "*******************\n"
				+ "/listar-catalogo-bien-serv\n"
				+ "/listar-clase-bien-serv\n"
				+ "/listar-familia-bien-serv\n"
				+ "/listar-grupo-bien-serv\n"
				+ "/listar-sag-acc-com\n"
				+ "/listar-sag-acc-con\n"
				+ "/listar-sag-ordenes\n"
				+ "/listar-sag-rrhh\n"
				+ "/listar-unidad-medida\n";
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
}
