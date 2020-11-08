package codenavneet.github.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void thisfunction(View view){

        Log.i("info","this button has been clicked noice work!!");
        EditText editText = (EditText) findViewById(R.id.rupeEditText);
        String amountinrupees = editText.getText().toString();
        double amountinrupeesdouble = Double.parseDouble(amountinrupees);
        double amountindollarsdouble = amountinrupeesdouble*60;
        String amountindollarstring = String.format("%.2f",amountindollarsdouble);
        Log.i("value",amountindollarstring);
        Toast.makeText(this, amountindollarstring, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}