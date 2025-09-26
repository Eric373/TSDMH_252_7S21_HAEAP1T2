package mx.edu.tesoem.isc.tsdmh_252_7s21_haeap1t2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RaizActivity extends AppCompatActivity {


    EditText txtnum1,txtnum2;
    Button btnsumar;

    TextView lblres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_raiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btnsumar = findViewById(R.id.btnsumar);
        lblres = findViewById(R.id.lblres);

    }

    public void onclickraiz (View V){

        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());

        double aprox = num1 / 2.0;
        double aprox2 = num2 / 2.0;

        for (int i = 0; i < 20; i++){

            aprox = (aprox + num1 / aprox) / 2;
            aprox2 = (aprox2 + num2 / aprox2) / 2;

        }

        String cadena = "La raiz cuadrada de los numeros "+num1+ " y " +num2+ "\nEs: " +aprox+ " Para el primer numero y \n" +aprox2+ " para el segundo numero";
        lblres.setText(cadena);
    }


}