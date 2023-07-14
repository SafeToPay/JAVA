/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safe2pay.CORE;

/**
 *
 * @author lucas.silva
 */
public class Config {

    private String Token;

    public void SetEnviroment(String Token) {
        this.Token = Token;
        Client.SetEnviroment(this.Token);
    }

}
