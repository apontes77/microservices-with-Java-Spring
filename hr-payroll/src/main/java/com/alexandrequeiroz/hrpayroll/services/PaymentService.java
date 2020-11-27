package com.alexandrequeiroz.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.alexandrequeiroz.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 1000.0, days);
	}
}
