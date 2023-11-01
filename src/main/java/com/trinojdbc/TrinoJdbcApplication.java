package com.trinojdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class TrinoJdbcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TrinoJdbcApplication.class, args);

		// Replace this with the command you want to execute
		String command = "show schemas from blackhole";
		String argument = "Hello from CLI!";

		// Construct the process builder
		ProcessBuilder processBuilder = new ProcessBuilder(command, argument);

		try {
			// Start the process
			Process process = processBuilder.start();

			// Capture the output of the process
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			// Read and print the output
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			// Wait for the process to finish
			int exitCode = process.waitFor();
			System.out.println("Process exited with code: " + exitCode);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
