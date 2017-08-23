package com.example.asus.freakingmath2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.asus.freakingmath2.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView    so1,so2,dau,diem,kq;
    Button buttonY,buttonN;
    int sroce=0;
    int s1=0,s2=0,ketqua=0;
    int max=10,min=0,max2=20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        gamestart();
    }

    private void gamestart() {


        Random rd1=new Random();
        Random rd2=new Random();
        Random rd3=new Random();
        s1=rd1.nextInt(max-min+1)+min;
        s2=rd2.nextInt(max-min+1)+min;
        ketqua=randomdemo();
        so1.setText(s1+"");
        so2.setText(s2+"");
        kq.setText(ketqua+"");
        Xet();
    }


    private int randomdemo() {
        Random rd=new Random();
        Random rd2=new Random();
        boolean value=rd.nextBoolean();
        if(value==true)
        {
            return s1+s2;
        }
        else
        {   int x;
            return x=rd2.nextInt(max2-min+1)+min;
        }
    }

    private void Xet() {
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s1+s2==ketqua)
                {
                    gamestart();
                    sroce++;
                    diem.setText(sroce+"");
                }
                else finish();
            }
        });
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1+s2!=ketqua)
                {
                    gamestart();
                    sroce++;
                    diem.setText(sroce+"");
                }
                else finish();
            }
        });
    }
    private void anhxa() {
        so1= (TextView) findViewById(R.id.textView);
        so2= (TextView) findViewById(R.id.textView3);
        dau= (TextView) findViewById(R.id.textView2);
        buttonY= (Button) findViewById(R.id.button2);
        buttonN= (Button) findViewById(R.id.button);
        diem = (TextView) findViewById(R.id.sroce);
        kq= (TextView) findViewById(R.id.textView6);
    }
}
