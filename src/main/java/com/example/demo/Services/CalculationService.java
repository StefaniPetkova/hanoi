package com.example.demo.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculationService implements ICalculationService {


    @Override
    public List<String> calculate(int disks, char fromRod, char toRod, char auxRod) {
        List<String> steps = new ArrayList<>();
        if (disks == 1)
        {
            steps.add("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return steps;
        }

        steps.addAll(calculate( disks - 1, fromRod, auxRod, toRod));
        steps.add("Move disk " + disks + " from rod " + fromRod + " to rod " + toRod );
        steps.addAll(calculate( disks - 1, auxRod, toRod, fromRod));

        return steps;
    }
}
