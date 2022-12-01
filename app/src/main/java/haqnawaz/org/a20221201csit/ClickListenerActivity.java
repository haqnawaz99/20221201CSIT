package haqnawaz.org.a20221201csit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickListenerActivity extends AppCompatActivity {
    Button buttonOne;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_listener);

        textView = findViewById(R.id.textViewClickListenerTest);
        buttonOne = findViewById(R.id.btnClickTestOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Button One Clicked");
            }
        });
    }
}