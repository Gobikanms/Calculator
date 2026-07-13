package in.co.nmsworks.calculator.controller;

import in.co.nmsworks.calculator.Computable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
