/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.grhapplication.implementation;

import com.mycompany.grhapplication.model.Employee;

/**
 *
 * @author khali
 */
public interface EmployeeInterface {
    public boolean authentification(String email,String password);
    public void ajoutEmployee(Employee employee);
    public void SupprimerEmployee(int id);
    public void updateSalaire(int id,double salaire);
    
}
