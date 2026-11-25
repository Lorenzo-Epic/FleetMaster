package com.nhlstenden.fleetmaster;

import com.nhlstenden.fleetmaster.logic.account.Account;
import com.nhlstenden.fleetmaster.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WelcomeController
{
    @Autowired
    private AccountService accountService;
    
    @GetMapping("/accounts")
    public List<Account> getAllAccounts()
    {
        return this.accountService.getAccounts();
    }
    
    @PostMapping("/accounts")
    public void addAccount(@RequestBody Account account)
    {
        this.accountService.addAccount(account);
    }
    
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to FleetMaster Spring Boot REST API!";
    }
}
