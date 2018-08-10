package com.example.harsmeet.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harsmeet.login.DbHelper.DatabaseHelper;
import com.example.harsmeet.login.DbHelper.SignUpDB;
import com.example.harsmeet.login.Util.ValidationsUtil;

/**
 * Created by harsmeet on 31-07-2018.
 */

public class Register extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);


    EditText etEmail, etPasswd, etConfirmPasswd;
    Button btn_done;

    ValidationsUtil validationUtil = new ValidationsUtil();

    String emailStr, passwdStr, confmPasswdStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        etEmail = (EditText) findViewById(R.id.et_email);
        etPasswd = (EditText) findViewById(R.id.et_password);
        etConfirmPasswd = (EditText) findViewById(R.id.et_ConfirmPassword);

        btn_done = (Button) findViewById(R.id.bt_Done);

        try {

            btn_done.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (validationUtil.isEmailValid(etEmail.getText().toString())) {

                        emailStr = etEmail.getText().toString();

                    } else {
                        etEmail.setError("Email is not valid");

                    }
//                    get Text
                    passwdStr = etPasswd.getText().toString();
                    confmPasswdStr = etConfirmPasswd.getText().toString();


                    if (!passwdStr.equals(confmPasswdStr)) {

                        Toast.makeText(Register.this, "Wrong Password..!", Toast.LENGTH_SHORT).show();
                    } else if (!helper.checkUser(emailStr, passwdStr)) {
//                   insert the details in database

                        SignUpDB signUpDB = new SignUpDB();

                        signUpDB.setEmail(emailStr);
                        signUpDB.setPass(passwdStr);

                        helper.insertContact(signUpDB);
                        Intent i = new Intent(Register.this, LoginActivity.class);
                        startActivity(i);

                    }

                }
            });


        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
