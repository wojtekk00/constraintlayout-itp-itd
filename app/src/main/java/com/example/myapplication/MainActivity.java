package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    PunktyViewModel punktyViewModel;
    //int punkty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);

        //binding.textView.setText("100");
        binding.textView.setText(""+punktyViewModel.getPunkty());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //punkty++;
                //binding.textView.setText(""+punkty);
                punktyViewModel.addPunkty(1);
                binding.textView.setText(""+punktyViewModel.getPunkty());
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //punkty+=2;
                //binding.textView.setText(""+punkty);
                punktyViewModel.addPunkty(2);
                binding.textView.setText(""+punktyViewModel.getPunkty());
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //punkty+=3;
                //binding.textView.setText(""+punkty);
                punktyViewModel.addPunkty(3);
                binding.textView.setText(""+punktyViewModel.getPunkty());
            }
        });
    }
}