package br.com.viviane.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private RadioButton celsiusRadio;
    private RadioButton fahrenheitRadio;
    private Button convertButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.valorTemp);
        celsiusRadio = (RadioButton) findViewById(R.id.celsiusRadio);
        fahrenheitRadio = (RadioButton)findViewById(R.id.fahrenheitRadio);
        convertButton = (Button)findViewById(R.id.convertButton);
    }
    public void conversor(){
        Double temp = Double.valueOf(editText.getText().toString());
        if (celsiusRadio.isChecked()) {
            temp = (temp - 32)*5/9;
        } else if (fahrenheitRadio.isChecked()) { temp = temp *9/5+32;
        }
        editText.setText(temp.toString());

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { conversor();

            }
        });




    }
}
