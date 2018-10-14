package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AccountActivity extends AppCompatActivity {
    Button logout;
    EditText nameUser, emailUser, passwordUser;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        nameUser = findViewById(R.id.name_edittext);
        emailUser = findViewById(R.id.email_edittext);
        passwordUser = findViewById(R.id.password_edittext);

        if (getIntent().getExtras() == null) {
            Toast.makeText(AccountActivity.this,"Data Gagal diambil", Toast.LENGTH_SHORT).show();
        }else {
            nameUser.setText(getIntent().getStringExtra("data1"));
            emailUser.setText(getIntent().getStringExtra("data2"));
//            Intent intent = new Intent(AccountActivity.this, WayangPoin.class);
//            startActivity(intent);
        }

        mAuth = FirebaseAuth.getInstance();

        logout = findViewById(R.id.out);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
            }
        });
    }
}
