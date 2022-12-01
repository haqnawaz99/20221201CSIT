package haqnawaz.org.a20221201csit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickListenerActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonOne , buttonThree, buttonFour;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_listener);

        textView = findViewById(R.id.textViewClickListenerTest);
        buttonOne = findViewById(R.id.btnClickTestOne);

        buttonThree = findViewById(R.id.btnClickTestThree);
        buttonThree.setOnClickListener(this);
        buttonFour = findViewById(R.id.btnClickTestFour);
        buttonFour.setOnClickListener(this);


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Button One Clicked");
            }
        });
    }

    public void ChangeText(View view) {
        textView.setText("Button Two clicked  onClick");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId( )) {
            case R.id.btnClickTestThree:
                textView.setText("Button Three Clicked");
                break;
            case R.id.btnClickTestFour:
                textView.setText("Button Four Clicked");
                break;
            case R.id.textViewClickListenerTest:
                textView.setText("Awesome Its me myself");
                break;

        }

    }
}