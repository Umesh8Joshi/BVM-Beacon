package com.darshan.acer.bvminfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button but1;
    public EditText eUsername;
    public EditText ePassword;

    public void init() {
        but1 = findViewById(R.id.bLogin);
        eUsername = findViewById(R.id.eUsername);
        ePassword = findViewById(R.id.ePassword);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eUsername.getText().toString().equals("admin") && ePassword.getText().toString().equals("1234")) {
                    Intent drive = new Intent(MainActivity.this, DeviceList.class);
                    startActivity(drive);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        init();
    }
}
