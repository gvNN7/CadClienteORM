package cadcliente.arquidesis.usjt.br.cadcliente;

import android.app.IntentService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AlterarActivity extends AppCompatActivity {
    public EditText editTextNome;
    public EditText editTextIdade;
    public EditText editTextCpf;
    public EditText editTextTelefone;
    public EditText editTextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar);

        editTextNome = (EditText)findViewById(R.id.editTextNome);
        editTextIdade = (EditText)findViewById(R.id.editTextIdade);
        editTextCpf = (EditText)findViewById(R.id.editTextCpf);
        editTextTelefone = (EditText)findViewById(R.id.editTextTelefone);
        editTextId = (EditText)findViewById(R.id.editTextId);
    }

    public void alteraTodos(View view){
        Cliente cliente;
        int id = Integer.parseInt(editTextId.getText().toString());
        if(id>0){
            //select * from cliente where id = X
            cliente = Cliente.findById(Cliente.class,id);
            if(cliente != null){

                cliente.setCpf(editTextCpf.getText().toString());
                cliente.setNome(editTextNome.getText().toString());
                cliente.setTelefone(editTextTelefone.getText().toString());
                cliente.setIdade(Integer.parseInt(editTextIdade.getText().toString()));
            }
        }
    }

    public void alteraNome(View view) {
        Cliente cliente;
        int id = Integer.parseInt(editTextId.getText().toString());
        if (id > 0) {
            //select * from cliente where id = X
            cliente = Cliente.findById(Cliente.class, id);
            if (cliente != null) {
                cliente.setNome(editTextNome.getText().toString());
            }
        }
    }

    public void alteraTelefone(View view) {
        Cliente cliente;
        int id = Integer.parseInt(editTextId.getText().toString());
        if (id > 0) {
            //select * from cliente where id = X
            cliente = Cliente.findById(Cliente.class, id);
            if (cliente != null) {
                cliente.setTelefone(editTextTelefone.getText().toString());
            }
        }
    }

    public void alteraCpf(View view) {
        Cliente cliente;
        int id = Integer.parseInt(editTextId.getText().toString());
        if (id > 0) {
            //select * from cliente where id = X
            cliente = Cliente.findById(Cliente.class, id);
            if (cliente != null) {
                cliente.setCpf(editTextCpf.getText().toString());
            }
        }
    }

    public void alteraIdade(View view) {
        Cliente cliente;
        int id = Integer.parseInt(editTextId.getText().toString());
        if (id > 0) {
            //select * from cliente where id = X
            cliente = Cliente.findById(Cliente.class, id);
            if (cliente != null) {
                cliente.setIdade(Integer.parseInt(editTextIdade.getText().toString()));
            }
        }
    }
}
