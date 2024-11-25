package com.example.ES2.models;

import lombok.Data;

@Data
public class Computer {
    private Case pcCase;
    private Cpu cpu;
    private CpuCooler cpuCooler;
    private Fan fan;
    private Gpu gpu;
    private Memory memory;
    private Motherboard motherboard;
    private PowerSupply powerSupply;
    private Storage storage;
    private ThermalPaste thermalPaste;
}
