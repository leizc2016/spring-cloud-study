package com.lzc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 * 
 */
@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private ComputerService computerService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return restTemplate.getForEntity("http://LzcService/add?a=10&b=20", String.class).getBody();
	}

	@RequestMapping(value = "/addHy", method = RequestMethod.GET)
	public String addHy() {
		return computerService.addService();
	}

}
