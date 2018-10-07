package com.example2.harsh2.aavishkarapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BabyActivity extends AppCompatActivity
{
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby);
    }

    public void onClickToys(View view)
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
                Intent intent=new Intent(BabyActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BabyActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickDiapers(View view)
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
                Intent intent=new Intent(BabyActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BabyActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickWipes(View view)
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
                Intent intent=new Intent(BabyActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BabyActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickFeed(View view)
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
                Intent intent=new Intent(BabyActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BabyActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickGroom(View view)
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
                Intent intent=new Intent(BabyActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BabyActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickCare(View view)
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
                Intent intent=new Intent(BabyActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BabyActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }
}
