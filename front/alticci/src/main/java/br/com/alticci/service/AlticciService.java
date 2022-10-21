package br.com.alticci.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service @SuppressWarnings("all") @Transactional(propagation = Propagation.REQUIRED) public class AlticciService {

    public List<String> calculo(Integer n) {
		List<String> resultado = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
			n = (n - 3) + (n - 2);
			resultado.add(n.toString());
        }
        return resultado;
    }

}
