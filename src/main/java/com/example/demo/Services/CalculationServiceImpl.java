package com.example.demo.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService{


    @Override
    public List<String> calculate(int disks, char from_rod, char to_rod, char aux_rod) {
        List<String> steps = new ArrayList<>();
        if (disks == 1)
        {
            steps.add("Move disk 1 from rod "+from_rod+" to rod "+to_rod);
            return steps;

        }

        steps.addAll(calculate( disks- 1, from_rod, aux_rod, to_rod));
        steps.add("Move disk "+ disks + " from rod " +from_rod +" to rod " + to_rod );
        steps.addAll(calculate( disks- 1, aux_rod, to_rod, from_rod));

        return steps;
    }
}
