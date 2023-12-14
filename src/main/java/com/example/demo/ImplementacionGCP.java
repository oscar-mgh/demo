package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ImplementacionGCP implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// Agrega aquí el código que deseas ejecutar al iniciar la aplicación
		System.out.println("La aplicación se ha iniciado y esta clase se ejecuta automáticamente.");
	}
}
