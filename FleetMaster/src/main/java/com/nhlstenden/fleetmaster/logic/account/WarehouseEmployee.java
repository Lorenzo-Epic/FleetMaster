package com.nhlstenden.fleetmaster.logic.account;

public class WarehouseEmployee extends Account
{
    public WarehouseEmployee(String emailAddress, String passwordHash, String name, String filterPreferences, String role)
    {
        super(emailAddress, passwordHash, name, filterPreferences, role);
    }
}
