package com.tmenforce.checkopeatorlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tmenforce.checkopeator.CheckOpeator;

public class MainActivity extends AppCompatActivity {

    EditText edtOperatorPin, edtOPeratorNumber;
    Button btnSumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtOperatorPin = findViewById(R.id.editText2);
        edtOPeratorNumber = findViewById(R.id.editText1);
        btnSumbit = findViewById(R.id.btnStartService);


        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean Validation = CheckOpeator.CheckOpeatorValidation(MainActivity.this,edtOPeratorNumber.getText().toString(), edtOperatorPin.getText().toString() );

                    Log.e("validation", Validation+"");

            }
        });


    }
}