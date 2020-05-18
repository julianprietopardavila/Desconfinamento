package prietopardavilajulian.desconfinamento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity_verFaseProvincia extends AppCompatActivity {

    public void engadirProvincia()
    {
        ImageView imgprov = (ImageView) findViewById(R.id.imgProvincia);
        Bundle bundle=getIntent().getExtras();
        switch (bundle.getString("provincia")){
            case "A Coruña":
                imgprov.setImageResource(R.drawable.coruna);
                break;
            case "Lugo":
                imgprov.setImageResource(R.drawable.lugo);
                break;
            case "Pontevedra":
                imgprov.setImageResource(R.drawable.pontevedra);
                break;
            case "Ourense":
                imgprov.setImageResource(R.drawable.ourense);
                break;
        }
        TextView txtFase = (TextView) findViewById(R.id.txtFaseProv);
        txtFase.setText("Fase 0");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_fase_provincia);
        engadirProvincia();
    }
}
