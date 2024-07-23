package com.example.test.controller;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	
	public class HelloWorldController {
		@RequestMapping("/home")
		    public String home(){
		        return "Hello World!";
		    }
		
		@RequestMapping(
				method= {RequestMethod.GET},
				value = {"/first"})
		
		public String info()
		{
			String str2=
					"<html><body><font color=\"green\">"
					+ "<h2>this portal has been created to provide well written</h2>"
					+ "</font></body></html>";
			return str2;
		}
	
//	@GetMapping("/")
//	public String home()
//	{
//		String str=
//				"<html><body><font color=\"green\">"
//				+ "<h1>welcome to java programming</h1>"
//				+ "</font></body></html>";
//		return str;
//	}
//	
//	@RequestMapping(
//			method= {RequestMethod.GET},
//			value = {"/first"})
//	
//	public String info()
//	{
//		String str2=
//				"<html><body><font color=\"green\">"
//				+ "<h2>this portal has been created to provide well written</h2>"
//				+ "</font></body></html>";
//		return str2;
//	}
}