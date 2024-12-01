package com.fourward.posteq;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PostDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView name = findViewById(R.id.post_name);
        TextView code = findViewById(R.id.post_code);
        TextView queue = findViewById(R.id.queue_number);
        TextView turn = findViewById(R.id.turn_number);
        TextView time = findViewById(R.id.estimated_time);

        name.setText(getIntent().getStringExtra("name"));
        code.setText(getIntent().getStringExtra("code"));
        queue.setText("Queue Now\n" + getIntent().getIntExtra("queue", 0));
        turn.setText("Your Turn\n" + getIntent().getIntExtra("turn", 0));
        time.setText("Estimated Time\n" + getIntent().getIntExtra("time", 0) + " minutes");
    }
}