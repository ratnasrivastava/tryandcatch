package com.ratnasrivastava.tryandcatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    int[] array = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            for (int i = 0; i < 4; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Log.d("unique7",""+e.getMessage());
        } catch (Exception e) {
            Log.d("unique7",""+e.getStackTrace());
        }

        Log.d("unique7",Arrays.toString(array));
    }
}