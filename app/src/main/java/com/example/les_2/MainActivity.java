package com.example.les_2;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.bluetooth.BluetoothGattService;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName;
    private Button buttonSwapColors, buttonResetColors;
    private Button navigator;
    private boolean isSwapped = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = findViewById(R.id.firstNameEditText);
        editTextLastName = findViewById(R.id.lastNameEditText);
        buttonSwapColors = findViewById(R.id.swapColorsButton);
        buttonResetColors = findViewById(R.id.resetColorsButton);
        navigator = findViewById(R.id.navigator);

        buttonSwapColors.setOnClickListener(v -> {
            if (!isSwapped) {
                editTextFirstName.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                editTextLastName.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
            } else {
                editTextFirstName.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                editTextLastName.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            }
            isSwapped = !isSwapped;
        });

        buttonResetColors.setOnClickListener(v -> {
            editTextFirstName.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
            editTextLastName.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            isSwapped = false;
        });

        navigator.setOnClickListener(v->{
            fun2();
            ((Button)v).setTextColor(getResources().getColor(R.color.blue));
        });

    }
    public void fun2(){
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(Activity2.FIRST_NAME,editTextFirstName.getText().toString());
        startActivity(intent);
    }
}


