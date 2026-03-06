package com.example.reajusta;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Locale;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editSalario;
    private TextView txtSalarioAntes, txtPercentual, txtValorAumento, txtNovoSalario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editSalario = findViewById(R.id.editSalario);
        txtSalarioAntes = findViewById(R.id.txtSalarioAntes);
        txtPercentual = findViewById(R.id.txtPercentual);
        txtValorAumento = findViewById(R.id.txtValorAumento);
        txtNovoSalario = findViewById(R.id.txtNovoSalario);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void calcularReajuste(View view) {
        String valorDigitado = editSalario.getText().toString();

        if (valorDigitado.isEmpty()) {
            editSalario.setError("Digite o salário!");
            return;
        }

        double salarioAtual = Double.parseDouble(valorDigitado);
        double percentual;

        if (salarioAtual <= 280) {
            percentual = 20;
        } else if (salarioAtual <= 700) {
            percentual = 15;
        } else if (salarioAtual <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double valorAumento = salarioAtual * (percentual / 100);
        double novoSalario = salarioAtual + valorAumento;

        txtSalarioAntes.setText(String.format(Locale.getDefault(), "Salário antes: R$ %.2f", salarioAtual));
        txtPercentual.setText(String.format(Locale.getDefault(), "Percentual aplicado: %.0f%%", percentual));
        txtValorAumento.setText(String.format(Locale.getDefault(), "Valor do aumento: R$ %.2f", valorAumento));
        txtNovoSalario.setText(String.format(Locale.getDefault(), "Novo salário: R$ %.2f", novoSalario));
    }
}