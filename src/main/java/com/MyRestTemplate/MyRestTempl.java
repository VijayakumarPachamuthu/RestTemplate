package com.MyRestTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyRestTempl {

	@Autowired
	RestTemplate rt;
	
	@GetMapping(value = "/getThis")
	public String getThis() {
		String url = "http://localhost:8080/get";
		ResponseEntity<String> a = rt.exchange(url, HttpMethod.GET, null, String.class);
		String b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getName81")
	public String getName81() {
		String url = "http://localhost:8080/getName";
		ResponseEntity<String> a = rt.exchange(url, HttpMethod.GET, null, String.class);
		String b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getPath81/{n}")
	public String getPath81(@PathVariable String n) {
		String url = "http://localhost:8080/get1/";
		ResponseEntity<String> a = rt.exchange(url + n, HttpMethod.GET, null, String.class);
		String b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getCheckOdd/{n}")
	public String getCheckOdd(@PathVariable int n) {
		String url = "http://localhost:8080/get2/";
		ResponseEntity<String> a = rt.exchange(url + n, HttpMethod.GET,null, String.class);
		String b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getMax81/{a1}/{b1}")
	public String getMax81(@PathVariable int a1, @PathVariable int b1) {
		String url ="http://localhost:8080/getMax/";
		ResponseEntity<String> a = rt.exchange(url + a1 +"/" + b1, HttpMethod.GET,null, String.class);
		String b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getPrime81/{a1}/{b2}")
	public List<Integer>  getPrime81(@PathVariable int a1, @PathVariable int b2){
		String url = "http://localhost:8080/getEven/";
		ResponseEntity<List<Integer>> a = rt.exchange(url + a1 +"/"+ b2, HttpMethod.GET,null, new ParameterizedTypeReference<List<Integer>>(){});
		List<Integer> b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getEligible81")
	public String getEligible81(@RequestParam int a1) {
		String  url = "http://localhost:8080/getEligible?age={age}";
		ResponseEntity<String> a = rt.exchange(url, HttpMethod.GET, null, String.class,a1);
		String b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getAccess81")
	public String getAccess81(@RequestParam String uName, @RequestParam String pword ) {
		String url = "http://localhost:8080/getAccess?userName={uName}&password={pword}";
		ResponseEntity<String> a = rt.exchange(url, HttpMethod.GET,null, String.class, uName, pword);
		String b = a.getBody();
		return b;
	}
	
	//Get Data from another database
	@GetMapping(value = "/getListObject81")
	public List<EmployeePojo> getListObject81(){
		String url = "http://localhost:8082/getFindAll";
		ResponseEntity<List<EmployeePojo>> a = rt.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<EmployeePojo>>(){}); //new ParameterizedTypeReference() used to get the list of object
		List<EmployeePojo> b = a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getMaxSalary81")
	public int getMaxSalary81() {
		String url = "http://localhost:8082/getMaxSalary";
		ResponseEntity<Integer> a = rt.exchange(url, HttpMethod.GET,null, Integer.class);
		int b =a.getBody();
		return b;
	}
	
	@GetMapping(value = "/GetMaxObject81")
	public EmployeePojo GetMaxObject81() {
		String url = "http://localhost:8082/GetMaxObject";
		ResponseEntity<EmployeePojo> a = rt.exchange(url, HttpMethod.GET,null, EmployeePojo.class);
		EmployeePojo b =a.getBody();
		return b;
	}
	
	@GetMapping(value = "/getBetween81/{s}/{e}")
	public List<EmployeePojo> getBetween81(@PathVariable int s, @PathVariable int e) {
		String url = "http://localhost:8082/getBetween/";
		ResponseEntity <List<EmployeePojo>> a = rt.exchange(url + s + "/" + e, HttpMethod.GET,null, new ParameterizedTypeReference < List<EmployeePojo>>() {});
		List <EmployeePojo> b =a.getBody();
		return b;
	}
	
}
