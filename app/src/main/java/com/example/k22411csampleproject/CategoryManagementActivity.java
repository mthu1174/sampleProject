package com.example.k22411csampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.models.Category;

import java.util.ArrayList;

public class CategoryManagementActivity extends AppCompatActivity {

    ListView lvCategory;
    ArrayAdapter<Category> adapter;
    ArrayList<Category> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category_management);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        addViews();
        addEvents();
    }

    private void addViews() {
        lvCategory = findViewById(R.id.lvCategory);
        categories = new ArrayList<>();

        categories.add(new Category(1, "Điện tử"));
        categories.add(new Category(2, "Thời trang"));
        categories.add(new Category(3, "Sách vở"));

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
        lvCategory.setAdapter(adapter);
    }

    private void addEvents() {
        lvCategory.setOnItemClickListener((parent, view, position, id) -> {
            Category selected = adapter.getItem(position);
            Intent intent = new Intent(CategoryManagementActivity.this, ProductManagementActivity.class);
            intent.putExtra("categoryId", selected.getId());
            startActivity(intent);
        });

        lvCategory.setOnItemLongClickListener((parent, view, position, id) -> {
            Category selected = adapter.getItem(position);
            adapter.remove(selected);
            return true;
        });
    }
}
