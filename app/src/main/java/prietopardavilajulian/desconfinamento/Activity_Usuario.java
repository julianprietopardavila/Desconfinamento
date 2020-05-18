package prietopardavilajulian.desconfinamento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Activity_Usuario extends AppCompatActivity {

        public void xestionEventos(){
            Button btSair = (Button) findViewById(R.id.btSair);
            btSair.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                    finish();

                }
            });
            final Spinner spProv= (Spinner) findViewById(R.id.spinnerProvincias);
            Button btVerFaseProvincia = (Button) findViewById(R.id.btVerFase);
            btVerFaseProvincia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),Activity_verFaseProvincia.class);
                    intent.putExtra("provincia", spProv.getSelectedItem().toString());
                    startActivity(intent);
                }
            });
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__usuario);
        xestionEventos();

    }
}
