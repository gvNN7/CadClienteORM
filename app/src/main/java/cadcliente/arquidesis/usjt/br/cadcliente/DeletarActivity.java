package cadcliente.arquidesis.usjt.br.cadcliente;

import android.app.IntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DeletarActivity extends AppCompatActivity {

    public EditText editTextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletar);
        editTextId = (EditText)findViewById(R.id.editTextId);
    }

    public void deletarRegistro(View view){
        Cliente cliente;
        int id = Integer.parseInt(editTextId.getText().toString());
        if(id>0){
            // delete from cliente where id = X
            cliente = Cliente.findById(Cliente.class,id);
            if(cliente != null){
                cliente.delete(id);
            }
        }
    }
}
