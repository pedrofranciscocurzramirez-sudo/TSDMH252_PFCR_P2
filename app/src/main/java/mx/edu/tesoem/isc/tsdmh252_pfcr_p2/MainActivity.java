package mx.edu.tesoem.isc.tsdmh252_pfcr_p2;

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

public class MainActivity extends AppCompatActivity {
    Button sumar;
    EditText txtnum1, txtnum2;;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        sumar = (Button) findViewById(R.id.sumar);
        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        lblresultado = (TextView) findViewById(R.id.lblresultado);



    }
    public void sumar(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int res = num1 + num2;
        lblresultado.setText(String.valueOf(res));

    }
    public void restar(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int res = num1 - num2;
        lblresultado.setText(String.valueOf(res));
    }
    public void multiplicar(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int res = num1 * num2;
        lblresultado.setText(String.valueOf(res));

    }
    public void dividir(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int res = num1 / num2;
        lblresultado.setText(String.valueOf(res));
    }
    public void potencia(View v) {
        lblresultado.setText(String.valueOf((int) Math.pow(
                Integer.parseInt(txtnum1.getText().toString()),
                Integer.parseInt(txtnum2.getText().toString())
        )));

    }
    public void raiz(View v) {
           lblresultado.setText(String.valueOf((int) Math.pow(
                Integer.parseInt(txtnum1.getText().toString()),
                1.0 / Integer.parseInt(txtnum2.getText().toString())
        )));

    }
    public void cuadrado(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int res = num1 * num1;

    }
    public void N(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        int resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado *= num1;
        }

        lblresultado.setText(String.valueOf(resultado));

    }
}