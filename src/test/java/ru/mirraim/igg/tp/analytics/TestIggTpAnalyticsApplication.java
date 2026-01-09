package ru.mirraim.igg.tp.analytics;

import org.springframework.boot.SpringApplication;

public class TestIggTpAnalyticsApplication {

	public static void main(String[] args) {
		SpringApplication.from(IggTpAnalyticsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
