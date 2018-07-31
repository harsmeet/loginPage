package com.example.harsmeet.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harsmeet.login.Util.ValidationsUtil;

/**
 * Created by harsmeet on 31-07-2018.
 */

public class Register extends AppCompatActivity{

    EditText etEmail;
    Button btn_done;

    ValidationsUtil validationUtil = new ValidationsUtil();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


         etEmail = (EditText)findViewById(R.id.et_email);

         btn_done =(Button)findViewById(R.id.bt_Done);

        try {

            btn_done.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (validationUtil.isEmailValid(etEmail.getText().toString())) {

                        etEmail.setError("Email is valid");

                    } else {
                        etEmail.setError("Email is not valid");

                    }

                }
            });



        }
        catch (Exception e){

            e.printStackTrace();
        }



    }

}
