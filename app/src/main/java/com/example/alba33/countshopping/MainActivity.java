package com.example.alba33.countshopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText item, price;
    Button count;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item = (EditText)findViewById(R.id.etItems);
        price = (EditText)findViewById(R.id.etPrice);
        count = (Button) findViewById(R.id.btnCount);
        result = (TextView) findViewById(R.id.txtResult);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nItem = item.getText().toString();
                String nPrice = price.getText().toString();

                int tItem = Integer.parseInt(nItem);
                int tPrice = Integer.parseInt(nPrice);

                int amount = tItem * tPrice;
                int dicount = amount / 2;

                if (tItem >= 10){
                    result.setText("The Amount of Your Shopping " + dicount);
                    Toast.makeText(getApplicationContext(), "congratulations you get a discount", Toast.LENGTH_LONG).show();
                }else if (tItem <= 10){
                    result.setText("The Amount of Your Shopping " + amount);
                }
            }
        });

    }
}
