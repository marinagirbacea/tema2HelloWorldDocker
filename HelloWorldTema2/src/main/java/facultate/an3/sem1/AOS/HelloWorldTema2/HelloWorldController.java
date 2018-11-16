package facultate.an3.sem1.AOS.HelloWorldTema2;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloWorldController
{
        
	 @RequestMapping(value = "/{nume}",
				method = RequestMethod.GET,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public String sayHello(@PathVariable String nume) {
			return "Hello, " + nume + "! :) ";
		}
	    
	   
}
