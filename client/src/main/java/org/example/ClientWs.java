package org.example;

import org.example.proxy.BanqueService;
import org.example.proxy.BanqueWs;
import org.example.proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService stub= new BanqueWs().getBanqueServicePort();
        Compte c=stub.getCompte(4);
        System.out.println(stub.conversionEuroToDirham(500));
        System.out.println(c.getCode());
        System.out.println(c.getSolde());
    }
}