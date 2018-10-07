package com.example2.harsh2.aavishkarapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ElectronicsActivity extends AppCompatActivity
{
    AlertDialog.Builder builder;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
    }

//    public void onClick(View view)
//    {
//        btn=(Button)findViewById(R.id.btMobile);
//        //Creating the instance of PopupMenu
//        PopupMenu popup = new PopupMenu(this,btn);
//
//        //Inflating the Popup using xml file
//        popup.getMenuInflater().inflate(R.menu.activity_m_n,popup.getMenu());
//
//        //registering popup with OnMenuItemClickListener
//        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() //Self generates
//        {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem)
//            {
//                Toast.makeText(ElectronicsActivity.this,"YOU CLICKED: "+menuItem.getTitle(),Toast.LENGTH_LONG).show();
//                return true;
//            }
//        });
//        popup.show();
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        getMenuInflater().inflate(R.menu.activity_m_n,menu);
//
//        return super.onCreateOptionsMenu(menu);
//    }

    public void onClickMobile(View view)
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
                Intent intent=new Intent(ElectronicsActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickLaptops(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickCamera(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickWatches(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickTablets(View view)
    {
        builder=new AlertDialog.Builder(this);
        builder.setMessage("What do You Wish to do?").setTitle("Decision Box");
        builder.setMessage("Do You want to Buy it?").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
                Toast.makeText(getApplicationContext(),"YOU CHOSE YESS BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,LinkActivity.class);
                startActivity(intent);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Toast.makeText(getApplicationContext(),"YOU CHOSE NO BUTTON",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ElectronicsActivity.this,NoActivity.class);
                startActivity(intent);
            }
        });

        //Creating AlertDialog which will pop up with background
        AlertDialog alert = builder.create();
        alert.show();
    }

}
