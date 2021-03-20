package com.example.ptsgenap10rpl121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class MainActivity extends AppCompatActivity {

    EditText getEmail, getPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getEmail = (EditText)findViewById(R.id.email);
        getPassword = (EditText)findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = getEmail.getText().toString();
                String password = getPassword.getText().toString();

                if(email.equalsIgnoreCase("raehan") && password.equalsIgnoreCase("123")){
                    Toast.makeText(MainActivity.this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Anda gagal login", Toast.LENGTH_SHORT).show();
                }

            }
        });

        
    }

}