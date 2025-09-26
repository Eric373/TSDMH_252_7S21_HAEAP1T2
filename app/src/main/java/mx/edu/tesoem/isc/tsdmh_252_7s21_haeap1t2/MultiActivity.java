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

public class MultiActivity extends AppCompatActivity {

    EditText txtnum1,txtnum2;
    Button btnsumar;

    TextView lblres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multi);
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

    public void onclickmultiplicacion(View v){

        int num1,num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadena = "El resultado de la multiplicacion: "+String.valueOf(num1*num2);
        lblres.setText(cadena);
    }

}