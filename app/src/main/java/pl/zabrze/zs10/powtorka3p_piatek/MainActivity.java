package pl.zabrze.zs10.powtorka3p_piatek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int aktualna = 0;
    public String [] napisyPowitania = new String[]{"Dzień dobry","Good morning","Buenos Dias"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textViewNaRozmiar = findViewById(R.id.textViewRozmiar);
        TextView textViewCytat = findViewById(R.id.textViewCytat);
        Button button = findViewById(R.id.button);

        textViewCytat.setText(napisyPowitania[aktualna]);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualna++;
                        if(aktualna == napisyPowitania.length){
                            aktualna =0;
                        }
                        textViewCytat.setText(napisyPowitania[aktualna]);
                    }
                }
        );
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                       // Log.i("Przesuniecie",Integer.toString(i));
                        textViewNaRozmiar.setText("Rozmiar: "+Integer.toString(i));
                        textViewCytat.setTextSize(i);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

    }
}