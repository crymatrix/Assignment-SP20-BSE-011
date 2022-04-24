package kelocker.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class csl extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csl);
        Button buttonClick =findViewById(R.id.btnopen);
        Button back =findViewById(R.id.btnopen);
        TextView textView =findViewById(R.id.keypadtext);
        String a="0000";


        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               textView.setText(" ");
            }

        });
        buttonClick.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (textView.getText().toString()==a)
                        {
                            Intent intent = new Intent(csl.this,sucessfull.class);
                            startActivity(intent);
                            finish();
                }
                else
                {
                    for (int i = 0; i < 4; i++) {

                        if (i==3)
                        {
                            Intent intent = new Intent(csl.this,wrong.class);
                            startActivity(intent);
                            finish();
                        }
                    }

                }

            }

        });
    }
}