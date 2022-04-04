package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// requestparam and path variable can be combined to send request

@RestController // must be a request controller
@RequestMapping("/api/v1/calculator") // class level mapping of url to a controller class
public class CalculatorController {
    @GetMapping("/add") // method level mapping of th url to a controller with the help of request param
    public double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + num2;

    }

    @GetMapping("/sub/{num1}/{num2}") // map the values of url to java variable by path variable method
    public Double subtract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2, Runnable runnable) {
        runnable.run();
        Double result;
        if (num1 > num2) {
            result = num1 - num2;
        } else {
            result = num2 - num1;
        }
        return result;


    }

    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO) {
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.MULTI_STATUS.CREATED);
//        return  result;
        return responseEntity;
    }


}
