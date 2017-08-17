package com.pandame.anggarisky.myquotes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private QuoteBook quoteBook = new QuoteBook();
    private ColorBook colorBook = new ColorBook();

    private RelativeLayout bgmaster;
    private Button btn_generate;
    private TextView quote;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_generate = (Button) findViewById(R.id.btn_generate);
        quote = (TextView) findViewById(R.id.quote);
        bgmaster = (RelativeLayout) findViewById(R.id.bgmaster);

        btn_generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // for the quote
                String newQuote = quoteBook.getQuote();
                quote.setText(newQuote);

                // for background
                int color = colorBook.getColor();
                bgmaster.setBackgroundColor(color);

            }
        });


    }
}
