package com.idownward.placartruco;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivityTablet extends AppCompatActivity {

    byte nos = 0, eles = 0;
    boolean fim = false;
    TextView lblNos, lblEles, lblJ1, lblJ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_tablet);

        lblJ1 = (TextView) findViewById(R.id.lblJ1);
        lblJ2 = (TextView) findViewById(R.id.lblJ2);

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        lblNos = (TextView) findViewById(R.id.lblNos);
        lblEles = (TextView) findViewById(R.id.lblEles);



    }

    public void clickBn1(View v){
        ++nos;
        if(nos == 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ1.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblNos.setText(Byte.toString(nos));
    }

    public void clickBn3(View v){
        nos += 3;
        if(nos >= 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ1.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblNos.setText(Byte.toString(nos));
    }

    public void clickBn6(View v){
        nos += 6;
        if(nos >= 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ1.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblNos.setText(Byte.toString(nos));
    }

    public void clickBn9(View v){
        nos += 9;
        if(nos >= 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ1.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblNos.setText(Byte.toString(nos));
    }

    public void clickBe1(View v){
        ++eles;
        if(eles == 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ2.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblEles.setText(Byte.toString(eles));
    }

    public void clickBe3(View v){
        eles += 3;
        if(eles >= 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ2.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblEles.setText(Byte.toString(eles));
    }

    public void clickBe6(View v){
        eles += 6;
        if(eles >= 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ2.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblEles.setText(Byte.toString(eles));
    }

    public void clickBe9(View v){
        eles += 9;
        if(eles >= 12 && fim == false){
            AlertDialog.Builder alg = new AlertDialog.Builder(this);
            alg.setTitle("Fim de jogo");
            alg.setMessage("Quem venceu: " + lblJ2.getText().toString());
            alg.setNeutralButton("Continuar", null);
            alg.setPositiveButton("Recomeçar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    zerar();
                }
            });
            alg.show();
            fim = true;
        }
        lblEles.setText(Byte.toString(eles));
    }

    public void clickMenosNos(View v){
        if(nos > 0) {
            nos -= 1;
            lblNos.setText(Byte.toString(nos));
        }
    }

    public void clickMenosEles(View v){
        if(eles > 0) {
            eles -= 1;
            lblEles.setText(Byte.toString(eles));
        }
    }

    public void clickZerar(View v){
        zerar();
    }

    public void clickTrocarNomes(View v){
        nomeJogadores();
    }

    public void nomeJogadores(){
        final EditText txtPj = new EditText(this);
        final EditText txtSj = new EditText(this);

        AlertDialog.Builder pj = new AlertDialog.Builder(this);
        pj.setTitle("Informação");
        pj.setMessage("Insira o nome do primeiro jogador ou dupla");
        pj.setView(txtPj);
        pj.setIcon(android.R.drawable.ic_dialog_info);
        pj.setPositiveButton("Próximo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                lblJ1.setText(txtPj.getText().toString());
                AlertDialog.Builder sj = new AlertDialog.Builder(MainActivityTablet.this);
                sj.setTitle("Informação");
                sj.setMessage("Insira o nome do segundo jogador ou dupla");
                sj.setView(txtSj);
                sj.setIcon(android.R.drawable.ic_dialog_info);
                sj.setPositiveButton("Pronto", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        lblJ2.setText(txtSj.getText().toString());
                    }
                });
                sj.show();
            }
        });
        pj.show();
    }

    public void zerar(){
        nos = 0;
        eles = 0;
        lblNos.setText("0");
        lblEles.setText("0");
        fim = false;
    }

}
