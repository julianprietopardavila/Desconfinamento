package prietopardavilajulian.desconfinamento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity {

    public void xestionEventos(){
        //Loguearse como usuario
        Button btUsuario= (Button) findViewById(R.id.button_Rexistro_Login);
        btUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Activity_Usuario.class);
                startActivity(intent);
                //finish();
            }
        });
        //Loguearse como Administrador
        Button btAdmin = (Button) findViewById(R.id.button_Admin);
        final EditText txtUsuario = (EditText) findViewById(R.id.editTextUsuario);
        final EditText txtContrasinal = (EditText) findViewById(R.id.editText_Contrasinal);
        btAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUsuario.getText().toString().trim().toLowerCase().equals("admin") && txtContrasinal.getText().toString().equals("abc123.")){
                    Intent intent=new Intent(v.getContext(),Activity_Admin.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(v.getContext(),"Usuario ou contrasinal incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);
        xestionEventos();
    }
}
