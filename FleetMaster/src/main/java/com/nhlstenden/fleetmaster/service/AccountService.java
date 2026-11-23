package com.nhlstenden.fleetmaster.service;

import com.nhlstenden.fleetmaster.logic.account.Account;
import com.nhlstenden.fleetmaster.logic.account.WarehouseEmployee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService
{
    private List<Account> accounts = new ArrayList<>();
    
    public AccountService()
    {
        this.accounts.add(new WarehouseEmployee("nocivelli.lorenzo@nhl.com", "hash123", "Lorenzo", "", "Admin"));
        this.accounts.add(new WarehouseEmployee("joao.pedro@nhl.com", "hash567", "JP", ".", "Janitor"));
    }
    
    public List<Account> getAccounts()
    {
        return this.accounts;
    }
    
    public void setAccounts(List<Account> accounts)
    {
        if (accounts == null || accounts.isEmpty())
        {
            throw new IllegalArgumentException("accounts cannot be null or empty");
        }
        for (Object accountsItem : accounts)
        {
            if (accountsItem == null)
            {
                throw new IllegalArgumentException("accounts cannot contain null");
            }
        }
        
        this.accounts = new ArrayList<>(accounts);
    }
    
    public void addAccount(Account account)
    {
        this.accounts.add(account);
    }
}
