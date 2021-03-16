package com.example.demo.Services;

import java.util.List;

public interface ICalculationService {
    List<String> calculate(int disks, char from_rod, char to_rod, char aux_rod);
}
