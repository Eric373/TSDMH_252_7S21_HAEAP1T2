package mx.edu.tesoem.isc.tsdmh_252_7s21_haeap1t2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void lanzasuma(View v){

        Intent intent = new Intent(this, SumaActivity.class);
        startActivity(intent);

    }

    public void lanzaresta(View v){

        Intent intent = new Intent(this, RestaActivity.class);
        startActivity(intent);

    }

    public void lanzadiv(View v){

        Intent intent = new Intent(this, DivActivity.class);
        startActivity(intent);

    }


    public void lanzamulti(View v){

        Intent intent = new Intent(this, MultiActivity.class);
        startActivity(intent);

    }

    public void lanzapote2(View v){

        Intent intent = new Intent(this, Pote2Activity.class);
        startActivity(intent);

    }


    public void lanzapoten(View v){

        Intent intent = new Intent(this, PotenActivity.class);
        startActivity(intent);

    }

    public void lanzaraiz(View v){

        Intent intent = new Intent(this, RaizActivity.class);
        startActivity(intent);

    }


}