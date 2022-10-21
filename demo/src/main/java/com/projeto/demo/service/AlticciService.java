package com.projeto.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@SuppressWarnings("all")
@Transactional(propagation = Propagation.REQUIRED)
public class AlticciService {

	public int calculo(int n) {
		return n =  (n - 3) + ( n - 2);
	}

}
