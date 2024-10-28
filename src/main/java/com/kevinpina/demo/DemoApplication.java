package com.kevinpina.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@GetMapping("/test")
	public ResponseEntity<String> greetings() throws UnknownHostException {
		Set<Entry<Object, Object>> entrySet = System.getProperties().entrySet();
		
		List<String> listProperties = entrySet.stream().map(p -> "<b>" + p.getKey()  + "</b> = " + p.getValue()).toList();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<b>ip.addresses: </b>" + InetAddress.getLocalHost().getHostAddress() + "<br/>");
		
		listProperties.forEach(p -> stringBuilder.append(p + "<br/>\n"));
		
		return ResponseEntity.ok("<font size=5><b>Welcome:</b></font> Kevin Piña<br/><hr/>" + stringBuilder);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
