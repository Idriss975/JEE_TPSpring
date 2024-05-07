package com.idriss.webservice.service;

import jakarta.jws.WebService;


@WebService(serviceName = "BanqueWS")
public class BanqueService {
    public double conversion(double mf) {
        return mf * 1000;
    }
    public double getCompte(Integer code) {
        return code;
    }
    public double listComptes() {
        return 0;
    }
}
