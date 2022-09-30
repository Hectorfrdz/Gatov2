package com.example.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int turno = 0, x = 0, o = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(MainActivity.this,"Deje presionado el boton reiniciar para empezar de nuevo",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"Bienvenido, Que gane el mejor",Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button lbl1 = findViewById(R.id.box1);
        Button lbl2 = findViewById(R.id.box2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn1.setTextColor(Color.RED);
                    btn1.setText("X");
                    turno = 1;
                    if(btn2.getText() == "X" && btn3.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);
                    }
                    else if(btn4.getText() == "X" && btn7.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);
                    }
                    else if(btn5.getText() == "X" && btn9.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn1.setTextColor(Color.BLUE);
                    btn1.setText("O");
                    turno = 0;
                    if(btn2.getText() == "O" && btn3.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn4.getText() == "O" && btn7.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "O" && btn9.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn1.setEnabled(false);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn2.setTextColor(Color.RED);
                    btn2.setText("X");
                    turno = 1;
                    if(btn1.getText() == "X" && btn3.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "X" && btn8.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn2.setTextColor(Color.BLUE);
                    btn2.setText("O");
                    turno = 0;
                    if(btn1.getText() == "O" && btn3.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "O" && btn8.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn2.setEnabled(false);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn3.setTextColor(Color.RED);
                    btn3.setText("X");
                    turno = 1;
                    if(btn1.getText() == "X" && btn2.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn6.getText() == "X" && btn9.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "X" && btn7.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn3.setTextColor(Color.BLUE);
                    btn3.setText("O");
                    turno = 0;
                    if(btn1.getText() == "O" && btn2.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn6.getText() == "O" && btn9.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "O" && btn7.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn3.setEnabled(false);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn4.setTextColor(Color.RED);
                    btn4.setText("X");
                    turno = 1;
                    if(btn1.getText() == "X" && btn7.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "X" && btn6.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn4.setTextColor(Color.BLUE);
                    btn4.setText("O");
                    turno = 0;
                    if(btn1.getText() == "O" && btn7.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "O" && btn6.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn4.setEnabled(false);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn5.setTextColor(Color.RED);
                    btn5.setText("X");
                    turno = 1;
                    if(btn1.getText() == "X" && btn9.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn2.getText() == "X" && btn8.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn4.getText() == "X" && btn6.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn3.getText() == "X" && btn7.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn5.setTextColor(Color.BLUE);
                    btn5.setText("O");
                    turno = 0;
                    if(btn1.getText() == "O" && btn9.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn2.getText() == "O" && btn8.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn4.getText() == "O" && btn6.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn3.getText() == "O" && btn7.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn5.setEnabled(false);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn6.setTextColor(Color.RED);
                    btn6.setText("X");
                    turno = 1;
                    if(btn3.getText() == "X" && btn9.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn4.getText() == "X" && btn5.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn6.setTextColor(Color.BLUE);
                    btn6.setText("O");
                    turno = 0;
                    if(btn3.getText() == "O" && btn9.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn4.getText() == "O" && btn5.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn6.setEnabled(false);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn7.setTextColor(Color.RED);
                    btn7.setText("X");
                    turno = 1;
                    if(btn1.getText() == "X" && btn4.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "X" && btn3.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn8.getText() == "X" && btn9.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn7.setTextColor(Color.BLUE);
                    btn7.setText("O");
                    turno = 0;
                    if(btn1.getText() == "O" && btn4.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "O" && btn3.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn8.getText() == "O" && btn9.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn7.setEnabled(false);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn8.setTextColor(Color.RED);
                    btn8.setText("X");
                    turno = 1;
                    if(btn7.getText() == "X" && btn9.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "X" && btn2.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn8.setTextColor(Color.BLUE);
                    btn8.setText("O");
                    turno = 0;
                    if(btn7.getText() == "O" && btn9.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "O" && btn2.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn8.setEnabled(false);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(turno == 0)
                {
                    btn9.setTextColor(Color.RED);
                    btn9.setText("X");
                    turno = 1;
                    if(btn7.getText() == "X" && btn8.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "X" && btn1.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn3.getText() == "X" && btn6.getText() == "X")
                    {
                        x++;
                        Toast.makeText(MainActivity.this,"Ganan las X",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                else
                {
                    btn9.setTextColor(Color.BLUE);
                    btn9.setText("O");
                    turno = 0;
                    if(btn7.getText() == "O" && btn8.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn5.getText() == "O" && btn1.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                    else if(btn3.getText() == "O" && btn6.getText() == "O")
                    {
                        o++;
                        Toast.makeText(MainActivity.this,"Ganan las O",Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                        btn8.setEnabled(false);
                        btn9.setEnabled(false);

                    }
                }
                btn9.setEnabled(false);
            }
        });


        Button btn10 = findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setText("-");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                btn5.setText("-");
                btn6.setText("-");
                btn7.setText("-");
                btn8.setText("-");
                btn9.setText("-");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btn1.setTextColor(Color.BLACK);
                btn2.setTextColor(Color.BLACK);
                btn3.setTextColor(Color.BLACK);
                btn4.setTextColor(Color.BLACK);
                btn5.setTextColor(Color.BLACK);
                btn6.setTextColor(Color.BLACK);
                btn7.setTextColor(Color.BLACK);
                btn8.setTextColor(Color.BLACK);
                btn9.setTextColor(Color.BLACK);
                lbl1.setText(String.valueOf(x));
                lbl2.setText(String.valueOf(o));
            }
        });

        btn10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btn1.setText("-");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                btn5.setText("-");
                btn6.setText("-");
                btn7.setText("-");
                btn8.setText("-");
                btn9.setText("-");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btn1.setTextColor(Color.BLACK);
                btn2.setTextColor(Color.BLACK);
                btn3.setTextColor(Color.BLACK);
                btn4.setTextColor(Color.BLACK);
                btn5.setTextColor(Color.BLACK);
                btn6.setTextColor(Color.BLACK);
                btn7.setTextColor(Color.BLACK);
                btn8.setTextColor(Color.BLACK);
                btn9.setTextColor(Color.BLACK);
                x = 0;
                o = 0;
                lbl1.setText(String.valueOf(x));
                lbl2.setText(String.valueOf(o));
                Toast.makeText(MainActivity.this,"Que gane el mejor",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}