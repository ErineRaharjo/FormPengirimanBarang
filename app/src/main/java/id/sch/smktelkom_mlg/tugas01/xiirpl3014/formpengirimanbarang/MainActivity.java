package id.sch.smktelkom_mlg.tugas01.xiirpl3014.formpengirimanbarang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNmPeng, etNoPeng, etNmPen, etNoPen, etBB, etAlm;
    RadioGroup rgJenis;
    RadioButton rbReg, rbYes;
    CheckBox cbPkt, cbDoc;
    Button bsub;
    TextView tvPil, tvNmPeng, tvNoPeng, tvNmPen, tvNoPen, tvAlm, tvBB, tvJns;
    Spinner spKot, spkec, spProv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNmPeng = (EditText) findViewById(R.id.editTextNamaPeng);
        etNoPeng = (EditText) findViewById(R.id.editTextNoPeng);
        etNmPen = (EditText) findViewById(R.id.editTextNamaPen);
        etNoPen = (EditText) findViewById(R.id.editTextNoPen);
        etBB = (EditText) findViewById(R.id.editTextBrt);
        etAlm = (EditText) findViewById(R.id.editTextAlmt);

        rgJenis = (RadioGroup) findViewById(R.id.radiGroupJenis);
        rbReg = (RadioButton) findViewById(R.id.radioButtonReg);
        rbYes = (RadioButton) findViewById(R.id.radioButtonYes);

        cbPkt = (CheckBox) findViewById(R.id.checkBoxPkt);
        cbDoc = (CheckBox) findViewById(R.id.checkBoxDoc);

        bsub = (Button) findViewById(R.id.buttonSub);

        tvNmPeng = (TextView) findViewById(R.id.textViewNmPeng);
        tvNoPeng = (TextView) findViewById(R.id.editTextNoPeng);
        tvNmPen = (TextView) findViewById(R.id.textViewNmPen);
        tvNoPen = (TextView) findViewById(R.id.editTextNoPen);
        tvAlm = (TextView) findViewById(R.id.textViewAlmt);
        tvBB = (TextView) findViewById(R.id.textViewBer);
        tvPil = (TextView) findViewById(R.id.textViewPil);

        spkec = (Spinner) findViewById(R.id.spinnerKec);
        spKot = (Spinner) findViewById(R.id.spinnerKot);
        spProv = (Spinner) findViewById(R.id.spinnerProv);

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DoClick();
            }
        });

    }

    private void DoClick()

    {
        if (isValid()) {

        }
    }

    private boolean isValid() {
        boolean valid = true;
        String hasil = null;

        if (rbReg.isChecked()) {
            hasil = rbReg.getText().toString();
            tvPil.setText("Reg");
        } else if (rbYes.isChecked()) {
            tvPil.setText("Yes");
        }


        return valid;
    }
}
