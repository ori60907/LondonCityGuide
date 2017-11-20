package com.fundamentals.academy.ori.londoncityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    private Button learn_more_bt;
    private static final String london_wiki_address = "https://en.wikipedia.org/wiki/London";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        learn_more_bt = (Button) findViewById(R.id.learn_more_bt);

        learn_more_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri london_wiki = Uri.parse(london_wiki_address);
                Intent london_wiki_intent = new Intent(Intent.ACTION_VIEW, london_wiki);

                if (london_wiki_intent.resolveActivity(getPackageManager()) != null){
                    startActivity(london_wiki_intent);
                }
            }
        });
    }
}
