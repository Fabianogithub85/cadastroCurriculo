package com.example.cadastrocurriculo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAdvogado(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAMAAC8I7nZUMUM5TVk3WDFUU0ZINlNVOVVaR0RQODRBOC4u"));
        startActivity(nav);
    }

    public void clickAnalistaAdm(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAMAAC8I7nZUQTZHVUwyRjlPSE1SWk9HWDVUWVdKRENZVS4u"));
        startActivity(nav);
    }

    public void clickAnalistaTrib(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAMAAC8I7nZUNjFXNFNXWklYQUtaSU1ZVUtDWU1OSzlBTy4u"));
        startActivity(nav);
    }
}