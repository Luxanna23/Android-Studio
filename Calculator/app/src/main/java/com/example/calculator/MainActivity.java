package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultTextView;
    private EditText editText1;
    private EditText editText2;
    private Button buttonCalcul;
    public int edit1Int;
    public int edit2Int;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public Boolean intialisation(View view){
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultTextView = findViewById(R.id.result);

        String edit1String = editText1.getText().toString();
        String edit2String = editText2.getText().toString();

        if (!edit1String.equals("") && !edit2String.equals("")) {
            edit1Int = Integer.parseInt(edit1String);
            edit2Int = Integer.parseInt(edit2String);
            return true;
        }
        return false;
    }
    public void addition(View view) {
        if (intialisation(view)) {
            int somme = edit1Int + edit2Int;
            resultTextView.setText(String.format("%s", somme));
        }
        else {
            Log.i("Else", "Else");
            resultTextView.setText("erreur");
        }
    }

    public void soustraction(View view) {
        if (intialisation(view)) {
            int somme = edit1Int - edit2Int;
            resultTextView.setText(String.format("%s", somme));
        }
        else {
            Log.i("Else", "Else");
            resultTextView.setText("erreur");
        }
    }

    public void multiplication(View view) {
        if (intialisation(view)) {
            int somme = edit1Int * edit2Int;
            resultTextView.setText(String.format("%s", somme));
        }
        else {
            Log.i("Else", "Else");
            resultTextView.setText("erreur");
        }
    }

    public void division(View view) {
        if (intialisation(view)) {
            int somme = edit1Int / edit2Int;
            resultTextView.setText(String.format("%s", somme));
        }
        else {
            Log.i("Else", "Else");
            resultTextView.setText("erreur");
        }
    }

    public void modulo(View view) {
        if (intialisation(view)) {
            int somme = edit1Int % edit2Int;
            resultTextView.setText(String.format("%s", somme));
        }
        else {
            Log.i("Else", "Else");
            resultTextView.setText("erreur");
        }
    }
}