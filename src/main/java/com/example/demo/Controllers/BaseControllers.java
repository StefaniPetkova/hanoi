package com.example.demo.Controllers;

import com.example.demo.Services.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BaseControllers {

    @Autowired
    private CalculationService calculationService;

    @GetMapping("/calculate")
    public List<String> calculate(@RequestParam int disks){
        List<String> steps= calculationService.calculate(disks, 'A', 'C', 'B');
        return steps;
    }
}
