package com.example.functionalProgramming;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	private static String generateOTP(int length) {
		StringBuilder otp = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			otp.append(random.nextInt(10));
		}

		return otp.toString();
	}

	public static void main(String[] args) {

		Supplier<String> optGenerator = () -> generateOTP(4);
		String otp = optGenerator.get();
		System.out.println("Generated OTP: " + otp);

	}
}
