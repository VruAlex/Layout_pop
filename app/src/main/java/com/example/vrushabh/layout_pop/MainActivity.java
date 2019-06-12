package com.example.vrushabh.layout_pop;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Button popUp;
    ImageView closePopUp;
    Dialog oneDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneDialog = new Dialog(this);
        //pop  button click
         popUp = findViewById(R.id.one);
         popUp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 showPopLayout();
             }
         });


    }


    public  void showPopLayout(){
        oneDialog.setContentView(R.layout.pop_layout);
        oneDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        oneDialog.show();

        //Cancel Image button
        closePopUp = oneDialog.findViewById(R.id.cancel);
        closePopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneDialog.dismiss();
            }
        });

    }


}

