package com.formacionbdi.springboot.app.siga.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.siga.entity.*;
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
	@GetMapping("/listar-catalogo-bien-serv/prueba/{var1}/{var2}/{var3}/{var4}/{var5}/{var6}")
	public CatalogoBienS detailCBS(@PathVariable String var1, @PathVariable String var2,
			@PathVariable String var3, @PathVariable String var4,
			@PathVariable String var5, @PathVariable String var6){
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		return restCBSService.findByCBS(var1, var2, var3, var4, var5, var6);
	}	
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	@Autowired
	private IS_ClaseBienS_Service restClBSService;
	@GetMapping("/listar-clase-bien-serv")
	public List<ClaseBienS> listarClBS(){
		return restClBSService.findAll().stream().collect(Collectors.toList());
	}
	@GetMapping("/listar-clase-bien-serv/prueba/{var1}/{var2}/{var3}")
	public ClaseBienS detailClBS(@PathVariable String var1, @PathVariable String var2, @PathVariable String var3){
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		return restClBSService.findByClBS(var1, var2, var3);
	}		
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	@Autowired
	private IS_FamiliaBienS_Service restFBSService;
	@GetMapping("/listar-familia-bien-serv")
	public List<FamiliaBienS> listarFBS(){
		return restFBSService.findAll().stream().collect(Collectors.toList());
	}	
	@GetMapping("/listar-familia-bien-serv/prueba/{var1}/{var2}/{var3}/{var4}")
	public FamiliaBienS detailFBS(@PathVariable String fbs1, @PathVariable String fbs2, 
			@PathVariable String fbs3, @PathVariable String fbs4){
		System.out.println(fbs1);
		System.out.println(fbs2);
		System.out.println(fbs3);
		System.out.println(fbs4);
		return restFBSService.findByFBS(fbs1, fbs2, fbs3, fbs4);
	}	
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	@Autowired
	private IS_GrupoBienS_Service restGBSService;
	@GetMapping("/listar-grupo-bien-serv")
	public List<GrupoBienS> listarGBS(){
		return restGBSService.findAll().stream().collect(Collectors.toList());
	}
	@GetMapping("/listar-grupo-bien-serv/{id}")
	public GrupoBienS detailGBS(@PathVariable String var1, @PathVariable String var2){
		System.out.println(var1);
		System.out.println(var2);
		return restGBSService.findByGBS(var1, var2);
	}
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	
	
	@Autowired
	private IS_SagAccCn_Service restCnService;
	@GetMapping("/listar-sag-acc-con")
	public List<SagAccCn> listarCn(){
		return restCnService.findAll().stream().collect(Collectors.toList());
	}
	
	@GetMapping("/listar-sag-acc-con/{id}")
	public SagAccCn detailCn(@PathVariable String id) {
		return restCnService.findById(id);
	}
	
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	
	@Autowired
	private IS_SagAccCm_Service restCmService;
	@GetMapping("/listar-sag-acc-com/")
	public List<SagAccCm> detailCm(){
		return restCmService.findAll().stream().collect(Collectors.toList());
	}
	

	@GetMapping("/listar-sag-acc-com/{id}")
	public SagAccCm detalle(@PathVariable String id) {
		return restCmService.findById(id);
	}
	
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	
	@Autowired
	private IS_SagO_Service restOService;
	@GetMapping("/listar-sag-ordenes")
	public List<SagO> listarO(){
		return restOService.findAll().stream().collect(Collectors.toList());
	}
	
	@GetMapping("/listar-sag-ordenes/{id}")
	public SagO detailO(@PathVariable String id) {
		return restOService.findById(id);
	}
	
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	
	@Autowired
	private IS_SagR_Service restRService;
	@GetMapping("/listar-sag-rrhh")
	public List<SagR> listarR(){
		return restRService.findAll().stream().collect(Collectors.toList());
	}

	@GetMapping("/listar-sag-rrhh/{id}")
	public SagR detailR(@PathVariable String id) {
		return restRService.findById(id);
	}
	
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	
	@Autowired
	private IS_UnidadM_Service restUMService;
	@GetMapping("/listar-unidad-medida")
	public List<UnidadM> listarUM(){
		return restUMService.findAll().stream().collect(Collectors.toList());
	}
	
	@GetMapping("/listar-unidad-medida/{id}")
	public UnidadM detailM(@PathVariable String id) {
		return restUMService.findById(id);
	}
	
	/*******************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	 * *****************************************************************************************************************************************
	*******************************************************************************************************************************************/
	
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
	
}