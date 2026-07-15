package in.co.nmsworks.calculator.controller;

import in.co.nmsworks.calculator.Computable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

//    @Qualifier("subService")
    @Autowired
    private Computable computable;

    @GetMapping("/{a}/{b}")
    public int computeNumbers(@PathVariable int a, @PathVariable int b){
        return computable.compute(a, b);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(500).body("Something went wrong in general");
    }

    @ExceptionHandler(ArithmeticException.class)
    public String handleArithmeticException() {
        return "Division by zero is not allowed.";
    }
}
