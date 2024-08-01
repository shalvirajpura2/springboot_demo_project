package com.example.test.controller;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	
	public class HelloWorldController {
		
		  @GetMapping("/index")
		    public String index() {
		        return "index";
		    }
		 
		 
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
		@RequestMapping("/upload")
		public String registration() {
		    String str3 = "<html><h2>Registration form</h2>"
		            + "<form method='POST' action='/api/registrations/upload' enctype='multipart/form-data'>"
		            + "<input type='file' name='fn'><br><br>"
//		            + "<input type='file' name='fn' accept='image/jpeg'><br><br>"

		            + "<button type='submit'>Submit</button> </form></html>";
		    return str3;
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