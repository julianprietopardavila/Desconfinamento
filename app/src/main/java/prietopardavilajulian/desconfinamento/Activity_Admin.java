package prietopardavilajulian.desconfinamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Admin extends AppCompatActivity {
    public void xestionEventos(){
        Button btNf= (Button) findViewById(R.id.btEngadirFase);
        btNf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ActivityNovaFase.class);
                startActivity(intent);
            }
        });
        Button btFaseProv=(Button) findViewById(R.id.btnSeleccionFase);
        btFaseProv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Activity_FaseEProvincia.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__admin);
        xestionEventos();
    }
}
