package com.justino.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.justino.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
