package com.example.necta.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText VS = (EditText) findViewById(R.id.VS);
        Button N0 = (Button) findViewById(R.id.N0);
        Button N1 = (Button) findViewById(R.id.N1);
        Button N2 = (Button) findViewById(R.id.N2);
        Button N3 = (Button) findViewById(R.id.N3);
        Button N4 = (Button) findViewById(R.id.N4);
        Button N5 = (Button) findViewById(R.id.N5);
        Button N6 = (Button) findViewById(R.id.N6);
        Button N7 = (Button) findViewById(R.id.N7);
        Button N8 = (Button) findViewById(R.id.N8);
        Button N9 = (Button) findViewById(R.id.N9);
        Button CC = (Button) findViewById(R.id.CC);
        Button QL = (Button) findViewById(R.id.QL);
        Button MS = (Button) findViewById(R.id.MS);
        Button MN = (Button) findViewById(R.id.MN);
        Button PR = (Button) findViewById(R.id.PR);
        Button DV = (Button) findViewById(R.id.DV);

        N0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                if (DT == "" || DT.length() == 0)
                {

                }else
                {
                    VS.setText(DT + "0");
                }
            }
        });

        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "1");
            }
        });

        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "2");
            }
        });

        N3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "3");
            }
        });

        N4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "4");
            }
        });

        N5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT +"5");
            }
        });

        N6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "6");
            }
        });

        N7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "7");
            }
        });

        N8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "8");
            }
        });

        N9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String DT = VS.getText().toString();
                VS.setText(DT + "9");
            }
        });

        CC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VS.setText("");
                TT = 0;
            }
        });

        MS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String DT = VS.getText().toString();
                int A = Integer.parseInt(DT);
                VS.setText("" + SM(A));
                OPC = 1;
            }
        });

        MN.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String DT = VS.getText().toString();
                int A = Integer.parseInt(DT);
                VS.setText("");
                RS(A);
                OPC = 2;
            }
        });

        PR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String DT = VS.getText().toString();
                int A = Integer.parseInt(DT);
                VS.setText("");
                ML(A);
                OPC = 3;
            }
        });

        DV.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String DT = VS.getText().toString();
                int A = Integer.parseInt(DT);
                VS.setText("");
                FR(A);
                OPC = 4;
            }
        });

        QL.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String DT = VS.getText().toString();
                int A = Integer.parseInt(DT);
                VS.setText(GL(A));
            }
        });


    }

    public int TT = 0;
    public int OPC = 0;

    public int SM(int A)
    {
        int B = TT + A;
        TT = B;
        return B;
    }

    public int RS(int A)
    {
        int B = TT - A;
        TT = B;
        return B;
    }

    public int ML(int A)
    {
        int B = 0;
        if (TT <= 0)
        {

        }else
        {
            B = TT * A;
            TT = B;
        }
        return B;
    }

    public int FR(int A)
    {
        int B = 0;
        if (TT <= 0)
        {

        }else
        {
            B = TT / A;
            TT = B;
        }
        return B;
    }

    public int GL(int A)
    {
        int B = 0;
        switch(OPC)
        {
            case 1:
            {
                B =  SM(A);
                break;
            }

            case 2:
            {
                B =  RS(A);
                break;
            }

            case 3:
            {
                B =  ML(A);
                break;
            }

            case 4:
            {
                B = FR(A);
                break;
            }

            default:
                break;
        }
        return B;
    }

}
