package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("nacional")
public class MontoDebitarInternacionalServiceImpl implements MontoDebitarService {

	@Override
	public BigDecimal calcular(BigDecimal monto) {

		return monto;
	}

}
