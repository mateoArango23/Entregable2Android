package com.example.entregamomento2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashBoard extends AppCompatActivity {

    Button btnVerDatosUsuario;
    Button btnVolverAlHome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dash_board);

        btnVerDatosUsuario = findViewById(R.id.btn_ver_datos);
        btnVolverAlHome2 = findViewById(R.id.btn_volver_inicio_sesion2);

        btnVolverAlHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VolverAlInicioSesion2();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void VolverAlInicioSesion2(){
        Intent intent = new Intent(this, InicioSesion.class);
        startActivity(intent);
    }
}