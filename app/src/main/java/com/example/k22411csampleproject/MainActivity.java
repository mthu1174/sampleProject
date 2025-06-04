package com.example.k22411csampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imgEmployee;
    TextView txtEmployee;
    ImageView imgCustomer;
    TextView txtCustomer;
    ImageView imgCategory;
    TextView txtCategory;
    ImageView imgProduct;
    TextView txtProduct;
    ImageView imgAdvancedProduct;
    TextView txtAdvancedProduct;
    ImageView imgPayment;
    TextView txtPayment;
    ImageView imgOrder;
    TextView txtOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void addView() {
        imgEmployee=findViewById(R.id.imgEmployee);
        txtEmployee=findViewById(R.id.txtEmployee);
        imgCustomer=findViewById(R.id.imgCustomer);
        txtCustomer=findViewById(R.id.txtCustomer);
        imgProduct=findViewById(R.id.imgProduct);
        txtProduct=findViewById(R.id.txtProduct);
        imgAdvancedProduct=findViewById(R.id.imgAdvanceProduct);
        txtAdvancedProduct=findViewById(R.id.txtAdvanceProduct);
        imgPayment=findViewById(R.id.imgPayment);
        txtPayment=findViewById(R.id.txtPayment);
    }

    private void addEvent() {
        imgEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmployeeManagementActivity();
                //Mở màn hình quản trị nhân sự
            }
        });
        txtEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmployeeManagementActivity();
                //Gọi code mở màn hình quản trị nhân sự
            }
        });
        imgCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCustomerManagementActivity();
            }
        });
        txtCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCustomerManagementActivity();

            }
        });
        txtProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductManagementActivity();
            }
        });
        imgProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProductManagementActivity();
            }
        });

        imgAdvancedProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdvancedProductManagementActivity();
            }
        });
        txtAdvancedProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdvancedProductManagementActivity();
            }
        });
        imgPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPaymentManagementActivity();
            }
        });
        txtPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPaymentManagementActivity();
            }
        });

    }

    private void openPaymentManagementActivity() {
        Intent intent = new Intent(MainActivity.this,PaymentManagementActivity.class);
        startActivity(intent);
    }

    private void openAdvancedProductManagementActivity() {
        Intent intent = new Intent(MainActivity.this,AdvancedProductManagementActivity.class);
        startActivity(intent);
    }

    private void openProductManagementActivity() {
        Intent intent = new Intent(MainActivity.this,ProductManagementActivity.class);
        startActivity(intent);
    }


    void openEmployeeManagementActivity(){
        Intent intent= new Intent(MainActivity.this, EmployeeManagementActivity.class);
        startActivity(intent);
    }
    void openCustomerManagementActivity(){
        Intent intent= new Intent(MainActivity.this, CustomerManagementActivity.class);
        startActivity(intent);
    }

}