package com.projeto.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.demo.service.AlticciService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("algoritimo")
@Api(value = "algoritimo", tags = "Algoritimo do projeto")
public class AlticciController {

	@Autowired
	private AlticciService alticciService;

	@ApiOperation(value = "Calculo sequência Alticci.")
	@GetMapping(value = "/alticci", produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> sequenciaAlticci(@RequestParam int valor) {
		
		alticciService.calculo(valor);

		return new ResponseEntity<>("Sucesso", HttpStatus.OK);

	}

}
