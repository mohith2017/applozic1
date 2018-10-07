package com.example2.harsh2.aavishkarapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ClothesActivity extends AppCompatActivity
{
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
    }

    public void onClickTshirts(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                //finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickShirts(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                //finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickKurtas(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                //finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickJeans(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                //finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickTrousers(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                //finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ClothesActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }
}
