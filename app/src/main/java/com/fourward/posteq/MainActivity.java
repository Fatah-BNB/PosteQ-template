package com.fourward.posteq;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        CardView post1 = findViewById(R.id.post1_container);
        CardView post2 = findViewById(R.id.post2_container);
        CardView post3 = findViewById(R.id.post3_container);

        post1.setOnClickListener(view -> {
            Intent intent = new Intent(this, PostDetailsActivity.class);
            intent.putExtra("name", "FRERES BOUABSA");
            intent.putExtra("code", "05006");
            intent.putExtra("queue", 44);
            intent.putExtra("turn", 45);
            intent.putExtra("time", 31);
            startActivity(intent);
        });
        post2.setOnClickListener(view -> {
            Intent intent = new Intent(this, PostDetailsActivity.class);
            intent.putExtra("name", "AN-NASR");
            intent.putExtra("code", "05014");
            intent.putExtra("queue", 98);
            intent.putExtra("turn", 99);
            intent.putExtra("time", 47);
            startActivity(intent);
        });
        post3.setOnClickListener(view -> {
            Intent intent = new Intent(this, PostDetailsActivity.class);
            intent.putExtra("name", "EL BOUSTENE");
            intent.putExtra("code", "05021");
            intent.putExtra("queue", 114);
            intent.putExtra("turn", 115);
            intent.putExtra("time", 57);
            startActivity(intent);
        });
    }
}