package geekstudio.com.lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText passwort;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edit_name);
        passwort = findViewById(R.id.edit_passwort);
        button = findViewById(R.id.button);

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!name.getText().toString().equals("") ||
                        !passwort.getText().toString().equals("")){
                    button.setBackground(getResources().getDrawable(R.drawable.button));
                }
                else {
                   button.setEnabled(true);
                }


            }
        });

        passwort.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!name.getText().toString().equals("") ||
                        !passwort.getText().toString().equals("")){
                    button.setBackground(getResources().getDrawable(R.drawable.button));
                }else{
                    button.setBackground(getResources().getDrawable(R.drawable.button));
                }
        }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().equals("") || passwort.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Пожалуйста введите данные!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Добро пожадовать!", Toast.LENGTH_LONG).show();
                }
            }
        });

}

    public void click(View view) {
    }
}