package com.example.nandhini.download;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class twoplayer extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button;
    Button playagainbutton;
    static int c=0;
    int xwon=0,owon=0,i;
    int finalvalue=0,p=0;
    TextView e,oresult,xresult;
    int []a=new int[10];
    void initial(){
        for(i=0;i<=9;i++){
            a[i]=0;
        }
    }
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
        if(p==0) {
            e.animate().translationY(650f);
            p=0;
        }
        else{
            e.animate().translationX(60f).translationY(650f);
            p=0;
        }
    }
    public void tic(View view){
        int s=Integer.parseInt(view.getTag().toString());
        if(c%2==0) {
            if(s==1&&button1.getText().toString().equals("TOUCH")) {
                Button b = (Button) findViewById(R.id.button1);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==2&&button2.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button2);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==3&&button3.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button3);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==4&&button4.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button4);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==5&&button5.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button5);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==6&&button6.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button6);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==7&&button7.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button7);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==8&&button8.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button8);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
            else if(s==9&&button9.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button9);
                b.setText("X");
                b.setTextSize(36f);
                c++;
            }
        }
        else{
            if(s==1&&button1.getText().toString().equals("TOUCH")) {
                Button b = (Button) findViewById(R.id.button1);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==2&&button2.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button2);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==3&&button3.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button3);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==4&&button4.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button4);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==5&&button5.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button5);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==6&&button6.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button6);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==7&&button7.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button7);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==8&&button8.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button8);
                b.setText("O");
                b.setTextSize(36f);
                c++;
            }
            else if(s==9&&button9.getText().toString().equals("TOUCH")){
                Button b = (Button) findViewById(R.id.button9);
                b.setText("O");
                b.setTextSize(36f);
                c++;
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
            xresult.setText("X="+(xwon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b1.equals("X")&& b4.equals("X")&& b7.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+(xwon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b1.equals("X")&& b5.equals("X")&& b9.equals("X")) {
            e.setText("X won");
            xwon++;
            xresult.setText("X="+(xwon));
            e.setTextSize(70f);
            e.setVisibility(View.VISIBLE);
            e.animate().translationY(-650f);
            finalvalue=1;
        }
        else if (b7.equals("X")&& b8.equals("X")&& b9.equals("X")) {
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
            xresult.setText("X="+(xwon));
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
            xwon++;
            xresult.setText("X="+(xwon));
            e.setTextSize(70f);
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
            initial();
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
            c=0;
            p=1;
            playagainbutton.setVisibility(View.VISIBLE);

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayer);
        Toast.makeText(this, "VALUES CANNOT BE CHANGED ONCE ENTERED", Toast.LENGTH_SHORT).show();
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
        oresult=(TextView)findViewById(R.id.oresult);
        xresult=(TextView)findViewById(R.id.xresult);
        initial();
    }
}
