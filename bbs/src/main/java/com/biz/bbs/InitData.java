package com.biz.bbs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class InitData {

	
	@Bean
	public CommandLineRunner initDataMethod() {
		
		return new CommandLineRunner() {
			// 무명클래스 별도의 class를생성하지않고 inpeface로 클래스를만드는 방법
			@Override
			public void run(String... args) throws Exception {
				
				System.out.println("여기는 초기화 method");
				
			}
		};
	}
	
	
	
}
