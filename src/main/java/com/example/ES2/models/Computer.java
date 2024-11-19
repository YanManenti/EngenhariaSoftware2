package com.example.ES2.models;

public class Computer {
    private Case _case;
    private Cpu _cpu;
    private CpuCooler _cpuCooler;
    private Fan _fan;
    private Gpu _gpu;
    private Memory _memory;
    private Motherboard _motherboard;
    private PowerSupply _powerSupply;
    private Storage _storage;
    private ThermalPaste _thermalPaste;

    public Case get_case() {
        //Se já escolheu a Motherboard
        //Se já escolheu os Fans
        //Se já escolheu o CpuCooler
        //Se já escolheu a GPU
        //Se já escolheu os tipos de Storage???
        return _case;
    }

    public void set_case(Case newCase) {
        this._case = newCase;
    }

    public Cpu get_cpu() {
        //Se já escolheu a Motherboard
        //Se já escolheu a Memory
        //Se já escolheu o CPUCooler
        return _cpu;
    }

    public void set_cpu(Cpu newCpu) {
        this._cpu = newCpu;
    }

    public CpuCooler get_cpuCooler() {
        //Se já escolheu o Case
        //Se já escolheu o Cpu
        //Se já escolheu a Motherboard
        return _cpuCooler;
    }

    public void set_cpuCooler(CpuCooler newCpuCooler) {
        this._cpuCooler = newCpuCooler;
    }

    public Fan get_fan() {
        //Se já escolheu o Case
        return _fan;
    }

    public void set_fan(Fan newFan) {
        this._fan = newFan;
    }

    public Gpu get_gpu() {
        //Se já escolheu o Case
        return _gpu;
    }

    public void set_gpu(Gpu newGpu) {
        this._gpu = newGpu;
    }

    public Memory get_memory() {
        //Se já escolheu a Motherboard
        //Se já escolheu o Cpu
        return _memory;
    }

    public void set_memory(Memory newMemory) {
        this._memory = newMemory;
    }

    public Motherboard get_motherboard() {
        //Se já escolheu a CPU/CPU Cooler
        //Se já escolheu as Memories
        //Se já escolheu o Case
        //Se já escolheu os tipos de Storage
        return _motherboard;
    }

    public void set_motherboard(Motherboard newMotherboard) {
        this._motherboard = newMotherboard;
    }

    public PowerSupply get_powerSupply() {
        //Mostrar todas, mostrar o cálculo da potência para o usuário como recomendação.
        return _powerSupply;
    }

    public void set_powerSupply(PowerSupply newPowerSupply) {
        this._powerSupply = newPowerSupply;
    }

    public Storage get_storage() {
        //Se já escolheu a Motherboard.
        return _storage;
    }

    public void set_storage(Storage newStorage) {
        this._storage = newStorage;
    }

    public ThermalPaste get_thermalPaste() {
        //Mostrar todas
        return _thermalPaste;
    }

    public void set_thermalPaste(ThermalPaste newThermalPaste) {
        this._thermalPaste = newThermalPaste;
    }
}
