package org.example.lld.AdapterDesignPattern.Client;

import org.example.lld.AdapterDesignPattern.Adaptee.WeightMachine;
import org.example.lld.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import org.example.lld.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import org.example.lld.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Demo {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineForBabies();
        System.out.println("Weight in Pound: " + weightMachine.getWeightInPound());

        // Use case client want weight in KG

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachine);
        System.out.println("Weight in KG: " +  weightMachineAdapter.getWeightInKg());

    }
}
