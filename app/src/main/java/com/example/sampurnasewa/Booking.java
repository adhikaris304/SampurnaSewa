package com.example.sampurnasewa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Booking extends AppCompatActivity {
    private TextView bookdate, booktime;
    private EditText bookworkdesc;
    private Button btnbook;
    private Spinner bookworktype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        bookdate = findViewById(R.id.bookdate);
        booktime = findViewById(R.id.booktime);
        bookworkdesc = findViewById(R.id.bookworkdesc);
        bookworktype = findViewById(R.id.bookworktype);
        btnbook = findViewById(R.id.btnbook);

        btnbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
            }
        });
    }

    private void book() {
    }
}
