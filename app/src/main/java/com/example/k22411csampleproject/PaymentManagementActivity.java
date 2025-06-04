package com.example.k22411csampleproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.adapter.PaymentMethodAdapter;
import com.example.models.ListPaymentMethod;

import connectors.PaymentMethodConnector;
import connectors.SQLiteConnector;

public class PaymentManagementActivity extends AppCompatActivity {
    ListView lvPaymentMethod;
    PaymentMethodAdapter adapter;
    ListPaymentMethod lpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_payment_management);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addViews();
        addEvents();
    }

    private void addEvents() {
    }

    private void addViews() {
        lvPaymentMethod = findViewById(R.id.lvPaymentMethod);
        adapter = new PaymentMethodAdapter(PaymentManagementActivity.this, R.layout.item_payment_method);
        lvPaymentMethod.setAdapter(adapter);

        // ✅ Load từ SQLite thay vì generate cứng
        PaymentMethodConnector connector = new PaymentMethodConnector();
        SQLiteConnector dbConnector = new SQLiteConnector(this);
        lpm = connector.getAllPaymentMethods(dbConnector.openDatabase());

        adapter.clear(); // đảm bảo không bị trùng nếu load lại
        adapter.addAll(lpm.getPaymentMethods());
    }

}