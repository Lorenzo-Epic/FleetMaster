package com.nhlstenden.fleetmaster.logic.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public abstract class Account
{
    @Id
    @GeneratedValue
    private String emailAddress;
    private String passwordHash;
    private String name;
    private String filterPreferences;
    private String role;
    
    public Account(String emailAddress, String passwordHash, String name, String filterPreferences, String role)
    {
        this.emailAddress = emailAddress;
        this.passwordHash = passwordHash;
        this.name = name;
        this.filterPreferences = filterPreferences;
        this.role = role;
    }
    
    public String getEmailAddress()
    {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress)
    {
        if (emailAddress == null || emailAddress.isBlank())
        {
            throw new IllegalArgumentException("emailAddress cannot be null or blank");
        }
        
        this.emailAddress = emailAddress;
    }
    
    public String getPasswordHash()
    {
        return this.passwordHash;
    }
    
    public void setPasswordHash(String passwordHash)
    {
        if (passwordHash == null || passwordHash.isBlank())
        {
            throw new IllegalArgumentException("passwordHash cannot be null or blank");
        }
        
        this.passwordHash = passwordHash;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        
        this.name = name;
    }
    
    public String getFilterPreferences()
    {
        return this.filterPreferences;
    }
    
    public void setFilterPreferences(String filterPreferences)
    {
        if (filterPreferences == null || filterPreferences.isBlank())
        {
            throw new IllegalArgumentException("filterPreferences cannot be null or blank");
        }
        
        this.filterPreferences = filterPreferences;
    }
    
    public String getRole()
    {
        return this.role;
    }
    
    public void setRole(String role)
    {
        if (role == null || role.isBlank())
        {
            throw new IllegalArgumentException("role cannot be null or blank");
        }
        
        this.role = role;
    }
}
