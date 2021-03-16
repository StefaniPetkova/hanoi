package com.example.demo.Controllers;

import com.example.demo.Services.ICalculationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BaseControllers {

    @Autowired
    private ICalculationService calculationService;

    @GetMapping("/calculate")
    @ApiOperation(value = "Solves the Hanoi Towers problem")


    public List<String> calculate(@ApiParam(value = "Required integer value greater than 0") @RequestParam int disks){
        List<String> steps= calculationService.calculate(disks, 'A', 'C', 'B');
        return steps;
    }
}
