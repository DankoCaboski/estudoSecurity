package danko.fatec.estudoSecurity.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @SuppressWarnings("rawtypes")
    @GetMapping
    public ResponseEntity hello(){
        return new ResponseEntity<>("Hello, World!", HttpStatus.OK) {
            
        };
    }
}
