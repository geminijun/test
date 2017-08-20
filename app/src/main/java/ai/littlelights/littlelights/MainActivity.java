package ai.littlelights.littlelights;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1) Download "Question List" from server, and store them in db?

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Q1");
    }

    public void startRecording(View view) {

    }
}
