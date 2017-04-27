package com.trilink.ghbaqi.customnumview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CustomNumView mCustomNumView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomNumView = (CustomNumView) findViewById(R.id.custom);
        mCustomNumView.setOnNumChangeListener(new CustomNumView.OnNumChangeListener() {
            @Override
            public void onAddClicked(int number) {
                Toast.makeText(MainActivity.this, "add:" + number, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSubClicked(int number) {
                Toast.makeText(MainActivity.this, "sub:" + number, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
