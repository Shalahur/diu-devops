package com.diu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class MyController {

	@GetMapping("/myhost")
	public String getHost() throws UnknownHostException {
		String hostname = InetAddress.getLocalHost().getHostName();
		return hostname;
	}
}
