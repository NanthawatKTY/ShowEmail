package com.namo3t.myhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit_btn;
        final EditText editText;
        final TextView txtEmail;

        submit_btn = (Button)findViewById(R.id.btnSubmit);
        editText = (EditText)findViewById(R.id.editEmail);
        txtEmail = (TextView)findViewById(R.id.txtFU2);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myEmail = editText.getText().toString();
                txtEmail.setText(myEmail);
            }
        });
    }
}
