package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.example.tictactoe.R.*;

import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public char[] mBoard = new char[9];
    boolean gamePlay = true;
    TextView winner;
    Button but0, but1, but2, but3, but4,
            but5, but6, but7, but8, startGame;

    public char[] newGame() {
        for (int i = 0; i < 9; i++) {
            mBoard[i] = 'n';
            gamePlay = true;
        }
        return mBoard;
    }

    public char[] setPlayerMove(Button x, int i) {
        x.setText("X");
        x.setTextColor(Color.RED);
        mBoard[i] = 'x';
        return mBoard;
    }

    public char[] getComputerMove() {
        Button ran;
        int rand = new Random().nextInt(9);
        if (isGameOver() == false) {
            while(mBoard[rand] != 'n') {
                rand = new Random().nextInt(9);
            }
            if (rand == 0)
                ran = but0;
            else if (rand == 1)
                ran = but1;
            else if (rand == 2)
                ran = but2;
            else if (rand == 3)
                ran = but3;
            else if (rand == 4)
                ran = but4;
            else if (rand == 5)
                ran = but5;
            else if (rand == 6)
                ran = but6;
            else if (rand == 7)
                ran = but7;
            else
                ran = but8;

            ran.setText("O");
            ran.setTextColor(Color.BLUE);
            mBoard[rand] = 'o';
        }
        return mBoard;
    }

    public boolean isGameOver() {
        for (int i = 0; i < 9; i++) {
            if (mBoard[i] == 'n')
                return false;
        }
        winner.setText("Tied Game");
        return true;
    }


    public void checkForWinner() {
        if (testEach('x') == true) {
            winner.setText("You won");
            gamePlay = false;
        }
        else if (testEach('o') == true) {
            winner.setText("Computer won");
            gamePlay = false;
        }
    }

    public boolean testEach (char win) {
        if (mBoard[0] == win && mBoard[1] == win && mBoard[2] == win) {
            return true;
        }
        else if (mBoard[3] == win && mBoard[4] == win && mBoard[5] == win) {
            return true;
        }
        else if (mBoard[6] == win && mBoard[7] == win && mBoard[8] == win) {
            return true;
        }
        else if (mBoard[0] == win && mBoard[3] == win && mBoard[6] == win) {
            return true;
        }
        else if (mBoard[1] == win && mBoard[4] == win && mBoard[7] == win) {
            return true;
        }
        else if (mBoard[2] == win && mBoard[5] == win && mBoard[8] == win) {
            return true;
        }
        else if (mBoard[0] == win && mBoard[4] == win && mBoard[8] == win) {
            return true;
        }
        else if (mBoard[2] == win && mBoard[4] == win && mBoard[6] == win) {
            return true;
        }
        else
            return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newGame();

        winner = (TextView)findViewById(id.winText);
        but0 = (Button)findViewById(id.button0);
        but1 = (Button)findViewById(id.button1);
        but2 = (Button)findViewById(id.button2);
        but3 = (Button)findViewById(id.button3);
        but4 = (Button)findViewById(id.button4);
        but5 = (Button)findViewById(id.button5);
        but6 = (Button)findViewById(id.button6);
        but7 = (Button)findViewById(id.button7);
        but8 = (Button)findViewById(id.button8);
        startGame = (Button)findViewById(id.newGame);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
                but0.setText("");
                but1.setText("");
                but2.setText("");
                but3.setText("");
                but4.setText("");
                but5.setText("");
                but6.setText("");
                but7.setText("");
                but8.setText("");
                winner.setText("New game in progress");
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[0] == 'n') {
                        setPlayerMove(but0, 0);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[1] == 'n') {
                        setPlayerMove(but1, 1);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[2] == 'n') {
                        setPlayerMove(but2, 2);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[3] == 'n') {
                        setPlayerMove(but3, 3);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[4] == 'n') {
                        setPlayerMove(but4, 4);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[5] == 'n') {
                        setPlayerMove(but5, 5);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[6] == 'n') {
                        setPlayerMove(but6, 6);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[7] == 'n') {
                        setPlayerMove(but7, 7);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gamePlay == true) {
                    if (mBoard[8] == 'n') {
                        setPlayerMove(but8, 8);
                        getComputerMove();
                        checkForWinner();
                    }
                }
            }
        });




    }


}
