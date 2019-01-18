package com.example.nandhini.download;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Single_palyer extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView e;
    Button playagainbutton;
    TextView xresult,oresult;
    int c=0,p=0,finalvalue=0,xwon=0,owon=0;
    public void playagain(View view){
        button1.setText("TOUCH");
        button1.setTextSize(24f);
        button2.setText("TOUCH");
        button2.setTextSize(24f);
        button3.setText("TOUCH");
        button3.setTextSize(24f);
        button4.setText("TOUCH");
        button4.setTextSize(24f);
        button5.setText("TOUCH");
        button5.setTextSize(24f);
        button6.setText("TOUCH");
        button6.setTextSize(24f);
        button7.setText("TOUCH");
        button7.setTextSize(24f);
        button8.setText("TOUCH");
        button8.setTextSize(24f);
        button9.setText("TOUCH");
        button9.setTextSize(24f);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        button7.setVisibility(View.VISIBLE);
        button8.setVisibility(View.VISIBLE);
        button9.setVisibility(View.VISIBLE);
        e.setVisibility(View.INVISIBLE);
        c=0;
        finalvalue=0;
            e.animate().translationY(650f);
    }
    public void tic(View view){
        int s= Integer.parseInt(view.getTag().toString());
            if(s==1&&button1.getText().toString().equals("TOUCH")){
                button1.setText("X");
                button1.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
            else if(s==2&&button2.getText().toString().equals("TOUCH")){
                button2.setText("X");
                button2.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
            else if(s==3&&button3.getText().toString().equals("TOUCH")){
                button3.setText("X");
                button3.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
            else if(s==4&&button4.getText().toString().equals("TOUCH")){
                button4.setText("X");
                button4.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
            else if(s==5&&button5.getText().toString().equals("TOUCH")){
                button5.setText("X");
                button5.setTextSize(36f);
                if(c==0){
                    button1.setText("O");
                    button1.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
            else if(s==6&&button6.getText().toString().equals("TOUCH")){
                button6.setText("X");
                button6.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
            else if(s==7&&button7.getText().toString().equals("TOUCH")){
                button7.setText("X");
                button7.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
            else if(s==8&&button8.getText().toString().equals("TOUCH")){
                button8.setText("X");
                button8.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    c++;
                    button5.setTextSize(36f);
                }
                p=1;
                c++;
            }
            else if(s==9&&button9.getText().toString().equals("TOUCH")){
                button9.setText("X");
                button9.setTextSize(36f);
                if(c==0){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                }
                p=1;
                c++;
            }
        if(button1.getText().toString().equals("O")&&button2.getText().toString().equals("O")&&button3.getText().toString().equals("TOUCH")&&p==1){
            button3.setText("O");
            button3.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button1.getText().toString().equals("O")&&button5.getText().toString().equals("O")&&button9.getText().toString().equals("TOUCH")&&p==1){
            button9.setText("O");
            button9.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button1.getText().toString().equals("O")&&button4.getText().toString().equals("O")&&button7.getText().toString().equals("TOUCH")&&p==1){
            button7.setText("O");
            button7.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button1.getText().toString().equals("O")&&button7.getText().toString().equals("O")&&button4.getText().toString().equals("TOUCH")&&p==1){
            button4.setText("O");
            button4.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button1.getText().toString().equals("O")&&button9.getText().toString().equals("O")&&button5.getText().toString().equals("TOUCH")&&p==1){
            button5.setText("O");
            button5.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button1.getText().toString().equals("O")&&button3.getText().toString().equals("O")&&button2.getText().toString().equals("TOUCH")&&p==1){
            button2.setText("O");
            button2.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button2.getText().toString().equals("O")&&button3.getText().toString().equals("O")&&button1.getText().toString().equals("TOUCH")&&p==1){
            button1.setText("O");
            button1.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button2.getText().toString().equals("O")&&button5.getText().toString().equals("O")&&button8.getText().toString().equals("TOUCH")&&p==1){
            button8.setText("O");
            button8.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button2.getText().toString().equals("O")&&button1.getText().toString().equals("O")&&button3.getText().toString().equals("TOUCH")&&p==1){
            button3.setText("O");
            button3.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button2.getText().toString().equals("O")&&button8.getText().toString().equals("O")&&button5.getText().toString().equals("TOUCH")&&p==1){
            button5.setText("O");
            button5.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button3.getText().toString().equals("O")&&button2.getText().toString().equals("O")&&button1.getText().toString().equals("TOUCH")&&p==1){
            button1.setText("O");
            button1.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button3.getText().toString().equals("O")&&button5.getText().toString().equals("O")&&button7.getText().toString().equals("TOUCH")&&p==1){
            button7.setText("O");
            button7.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button3.getText().toString().equals("O")&&button6.getText().toString().equals("O")&&button9.getText().toString().equals("TOUCH")&&p==1){
            button9.setText("O");
            button9.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button3.getText().toString().equals("O")&&button9.getText().toString().equals("O")&&button6.getText().toString().equals("TOUCH")&&p==1){
            button6.setText("O");
            button6.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button3.getText().toString().equals("O")&&button7.getText().toString().equals("O")&&button5.getText().toString().equals("TOUCH")&&p==1){
            button5.setText("O");
            button5.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button4.getText().toString().equals("O")&&button7.getText().toString().equals("O")&&button1.getText().toString().equals("TOUCH")&&p==1){
            button1.setText("O");
            button1.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button4.getText().toString().equals("O")&&button5.getText().toString().equals("O")&&button6.getText().toString().equals("TOUCH")&&p==1){
            button6.setText("O");
            button6.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button4.getText().toString().equals("O")&&button6.getText().toString().equals("O")&&button5.getText().toString().equals("TOUCH")&&p==1){
            button5.setText("O");
            button5.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button5.getText().toString().equals("O")&&button6.getText().toString().equals("O")&&button4.getText().toString().equals("TOUCH")&&p==1){
            button4.setText("O");
            button4.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button5.getText().toString().equals("O")&&button9.getText().toString().equals("O")&&button1.getText().toString().equals("TOUCH")&&p==1){
            button1.setText("O");
            button1.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button5.getText().toString().equals("O")&&button8.getText().toString().equals("O")&&button2.getText().toString().equals("TOUCH")&&p==1){
            button2.setText("O");
            button2.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button5.getText().toString().equals("O")&&button7.getText().toString().equals("O")&&button3.getText().toString().equals("TOUCH")&&p==1){
            button3.setText("O");
            button3.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button6.getText().toString().equals("O")&&button9.getText().toString().equals("O")&&button3.getText().toString().equals("TOUCH")&&p==1){
            button3.setText("O");
            button3.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button7.getText().toString().equals("O")&&button5.getText().toString().equals("O")&&button3.getText().toString().equals("TOUCH")&&p==1){
            button3.setText("O");
            button3.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button7.getText().toString().equals("O")&&button9.getText().toString().equals("O")&&button8.getText().toString().equals("TOUCH")&&p==1){
            button8.setText("O");
            button8.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button7.getText().toString().equals("O")&&button8.getText().toString().equals("O")&&button9.getText().toString().equals("TOUCH")&&p==1){
            button9.setText("O");
            button9.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button8.getText().toString().equals("O")&&button9.getText().toString().equals("O")&&button7.getText().toString().equals("TOUCH")&&p==1){
            button7.setText("O");
            button7.setTextSize(36f);
            c++;
            p=0;
        }
        else if(button1.getText().toString().equals("X")&&button2.getText().toString().equals("X")&&button3.getText().toString().equals("TOUCH")&&p==1){
                button3.setText("O");
                button3.setTextSize(36f);
                c++;
                p=0;

            }
            else if(button1.getText().toString().equals("X")&&button5.getText().toString().equals("X")&&button9.getText().toString().equals("TOUCH")&&p==1){
                button9.setText("O");
                button9.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button1.getText().toString().equals("X")&&button4.getText().toString().equals("X")&&button7.getText().toString().equals("TOUCH")&&p==1){
                button7.setText("O");
                button7.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button1.getText().toString().equals("X")&&button7.getText().toString().equals("X")&&button4.getText().toString().equals("TOUCH")&&p==1){
                button4.setText("O");
                button4.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button1.getText().toString().equals("X")&&button9.getText().toString().equals("X")&&button5.getText().toString().equals("TOUCH")&&p==1){
                button5.setText("O");
                button5.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button1.getText().toString().equals("X")&&button3.getText().toString().equals("X")&&button2.getText().toString().equals("TOUCH")&&p==1){
                button2.setText("O");
                button2.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button2.getText().toString().equals("X")&&button3.getText().toString().equals("X")&&button1.getText().toString().equals("TOUCH")&&p==1){
                button1.setText("O");
                button1.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button2.getText().toString().equals("X")&&button5.getText().toString().equals("X")&&button8.getText().toString().equals("TOUCH")&&p==1){
                button8.setText("O");
                button8.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button2.getText().toString().equals("X")&&button1.getText().toString().equals("X")&&button3.getText().toString().equals("TOUCH")&&p==1){
                button3.setText("O");
                button3.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button2.getText().toString().equals("X")&&button8.getText().toString().equals("X")&&button5.getText().toString().equals("TOUCH")&&p==1){
                button5.setText("O");
                button5.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button3.getText().toString().equals("X")&&button2.getText().toString().equals("X")&&button1.getText().toString().equals("TOUCH")&&p==1){
                button1.setText("O");
                button1.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button3.getText().toString().equals("X")&&button5.getText().toString().equals("X")&&button7.getText().toString().equals("TOUCH")&&p==1){
                button7.setText("O");
                button7.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button3.getText().toString().equals("X")&&button6.getText().toString().equals("X")&&button9.getText().toString().equals("TOUCH")&&p==1){
                button9.setText("O");
                button9.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button3.getText().toString().equals("X")&&button9.getText().toString().equals("X")&&button6.getText().toString().equals("TOUCH")&&p==1){
                button6.setText("O");
                button6.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button3.getText().toString().equals("X")&&button7.getText().toString().equals("X")&&button5.getText().toString().equals("TOUCH")&&p==1){
                button5.setText("O");
                button5.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button4.getText().toString().equals("X")&&button7.getText().toString().equals("X")&&button1.getText().toString().equals("TOUCH")&&p==1){
                button1.setText("O");
                button1.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button4.getText().toString().equals("X")&&button5.getText().toString().equals("X")&&button6.getText().toString().equals("TOUCH")&&p==1){
                button6.setText("O");
                button6.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button4.getText().toString().equals("X")&&button6.getText().toString().equals("X")&&button5.getText().toString().equals("TOUCH")&&p==1){
                button5.setText("O");
                button5.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button5.getText().toString().equals("X")&&button6.getText().toString().equals("X")&&button4.getText().toString().equals("TOUCH")&&p==1){
                button4.setText("O");
                button4.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button5.getText().toString().equals("X")&&button9.getText().toString().equals("X")&&button1.getText().toString().equals("TOUCH")&&p==1){
                button1.setText("O");
                button1.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button5.getText().toString().equals("X")&&button8.getText().toString().equals("X")&&button2.getText().toString().equals("TOUCH")&&p==1){
                button2.setText("O");
                button2.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button5.getText().toString().equals("X")&&button7.getText().toString().equals("X")&&button3.getText().toString().equals("TOUCH")&&p==1){
                button3.setText("O");
                button3.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button6.getText().toString().equals("X")&&button9.getText().toString().equals("X")&&button3.getText().toString().equals("TOUCH")&&p==1){
                button3.setText("O");
                button3.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button7.getText().toString().equals("X")&&button5.getText().toString().equals("X")&&button3.getText().toString().equals("TOUCH")&&p==1){
                button3.setText("O");
                button3.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button7.getText().toString().equals("X")&&button9.getText().toString().equals("X")&&button8.getText().toString().equals("TOUCH")&&p==1){
                button8.setText("O");
                button8.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button7.getText().toString().equals("X")&&button8.getText().toString().equals("X")&&button9.getText().toString().equals("TOUCH")&&p==1){
                button9.setText("O");
                button9.setTextSize(36f);
                c++;
                p=0;
            }
            else if(button8.getText().toString().equals("X")&&button9.getText().toString().equals("X")&&button7.getText().toString().equals("TOUCH")&&p==1){
                button7.setText("O");
                button7.setTextSize(36f);
                c++;
                p=0;
            }
            else{
                if(button1.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button1.setText("O");
                    button1.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button2.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button2.setText("O");
                    button2.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button3.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button3.setText("O");
                    button3.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button4.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button4.setText("O");
                    button4.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button5.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button5.setText("O");
                    button5.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button6.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button6.setText("O");
                    button6.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button7.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button7.setText("O");
                    button7.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button8.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button8.setText("O");
                    button8.setTextSize(36f);
                    c++;
                    p=0;
                }
                else if(button9.getText().toString().equals("TOUCH")&&c>2&&p==1){
                    button9.setText("O");
                    button9.setTextSize(36f);
                    c++;
                    p=0;
                }

            }
        String b1=button1.getText().toString();
        String b2=button2.getText().toString();
        String b3=button3.getText().toString();
        String b4=button4.getText().toString();
        String b5=button5.getText().toString();
        String b6=button6.getText().toString();
        String b7=button7.getText().toString();
        String b8=button8.getText().toString();
        String b9=button9.getText().toString();
        if (b1.equals("X")&& b2.equals("X")&& b3.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+xwon);
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b1.equals("X")&& b4.equals("X")&& b7.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+xwon);
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b1.equals("X")&& b5.equals("X")&& b9.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+xwon);
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b7.equals("X")&& b8.equals("X")&& b9.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+xwon);
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b3.equals("X")&& b6.equals("X")&& b9.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+(xwon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b3.equals("X")&& b5.equals("X")&& b7.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+xwon);
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b1.equals("O")&& b2.equals("O")&& b3.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b1.equals("O")&& b4.equals("O")&& b7.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b3.equals("O")&& b6.equals("O")&& b9.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b7.equals("O")&& b8.equals("O")&& b9.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b1.equals("O")&& b5.equals("O")&& b9.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b3.equals("O")&& b5.equals("O")&& b7.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b2.equals("X")&& b5.equals("X")&& b8.equals("X")) {
            e.setText("X won");
            e.setTextSize(70f);
            xwon++;
            xresult.setText("O="+(xwon));
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b2.equals("O")&& b5.equals("O")&& b8.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650);
            finalvalue=1;
        }
        else  if (b4.equals("X")&& b5.equals("X")&& b6.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+(xwon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else  if (b4.equals("O")&& b5.equals("O")&& b6.equals("O")) {
            e.setText("O won");
            owon++;
            oresult.setText("O="+(owon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }

        if(finalvalue==1){
            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            c=0;
            playagainbutton.setVisibility(View.VISIBLE);
        }
        if(c==9){
            button1.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            e.setText("GAME OVER\n       TIE");
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationX(30f).translationY(-550f);
            playagainbutton.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_palyer);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        playagainbutton=(Button)findViewById(R.id.playagain);
        e=(TextView)findViewById(R.id.textView2);
        xresult=(TextView)findViewById(R.id.xresult);
        oresult=(TextView)findViewById(R.id.oresult);
        Toast.makeText(this, "VALUES CANNOT BE CHANGED ONCE ENTERED", Toast.LENGTH_SHORT).show();
    }
}
