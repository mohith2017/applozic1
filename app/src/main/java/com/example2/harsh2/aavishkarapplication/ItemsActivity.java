package com.example2.harsh2.aavishkarapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
    }

    public void onClickElectronics(View view)
    {
        Intent intent=new Intent(this,ElectronicsActivity.class);
        startActivity(intent);
    }

    public void onClickClothing(View view)
    {
        Intent intent=new Intent(this,ClothesActivity.class);
        startActivity(intent);
    }

    public void onClickWomen(View view)
    {
        Intent intent=new Intent(this,WomenClothingActivity.class);
        startActivity(intent);
    }

    public void onClickStationaries(View view)
    {
        Intent intent=new Intent(this,StationaryActivity.class);
        startActivity(intent);
    }

    public void onClickBaby(View view)
    {
        Intent intent=new Intent(this,BabyActivity.class);
        startActivity(intent);
    }

    public void onClickBooks(View view)
    {
        Intent intent=new Intent(this,BooksActivity.class);
        startActivity(intent);
    }

    public void onClickSports(View view)
    {
        Intent intent=new Intent(this,SportsActivity.class);
        startActivity(intent);
    }

    public void onClickKitchen(View view)
    {
        Intent intent=new Intent(this,KitchenActivity.class);
        startActivity(intent);
    }
}
