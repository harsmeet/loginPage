package com.example.harsmeet.login.DbHelper;

/**
 * Created by Hars on 4/28/2017.
 */

public class SignUpDB {

int id;
    String email,pass;

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }


    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return this.email;
    }


    public void setPass(String pass)
    {
        this.pass=pass;
    }
    public String getpass()
    {
        return this.pass;
    }
}


