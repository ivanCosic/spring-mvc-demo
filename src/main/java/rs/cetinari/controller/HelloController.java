package rs.cetinari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rs.cetinari.service.HelloService;

@Controller
// Mapping on this level is common for all controllers
@RequestMapping(value = "/api/v1")
public class HelloController {

    // Note that declared type is interface, not concrete class. This is not necessary, but is a good practice to
    // decouple interface as a contract from concrete implementation, and is also easier to test:
    private HelloService helloService;

    // Autowiring could be done on a field, method or constructor level. Constructor autowiring is preferred:
    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    // GET is default method, if none is provided, but it is a good practice to always be clear about intentions:
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<String>(helloService.getGreeting(), HttpStatus.OK);
    }
}
