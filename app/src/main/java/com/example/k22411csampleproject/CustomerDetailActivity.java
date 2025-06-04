package com.example.k22411csampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.models.Customer;

public class CustomerDetailActivity extends AppCompatActivity {
    EditText edtCustomerID;
    EditText edtCustomerName;
    EditText edtCustomerEmail;
    EditText edtCustomerPhone;
    EditText edtCustomerUsername;
    EditText edtCustomerPassword;
    Button btnNew;
    Button btnSave;
    Button btnRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_customer_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addView();
        addEvents();
    }

    private void addEvents() {
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process_save_customer();
            }
        });
    }

    private void process_save_customer() {
//        Lấy dữ liệu trên giao diện và mô hình hoá lại hướng đối tượng customer
        Customer c=new Customer();
        c.setId(Integer.parseInt(edtCustomerID.getText().toString()));
        c.setName(edtCustomerName.getText().toString());
        c.setEmail(edtCustomerEmail.getText().toString());
        c.setPhone(edtCustomerPhone.getText().toString());
        c.setUsername(edtCustomerUsername.getText().toString());
        c.setPassword(edtCustomerPassword.getText().toString());

//        Lấy Intent từ màn hình gọi nó
        Intent intent=getIntent();
//       đóng gói dữ liệu vào intent
        intent.putExtra("NEW CUSTOMER",c);
//        đóng dấu là sẽ gửi gói hàng này đi
        setResult(500, intent);
//        đóng màn hình này lại, để màn hình gọi nó nhận đươc kết quả
        finish();
    }

    private void addView() {
        edtCustomerID = findViewById(R.id.edtCustomerID);
        edtCustomerName = findViewById(R.id.edtCustomerName);
        edtCustomerEmail = findViewById(R.id.edtCustomerEmail);
        edtCustomerPhone = findViewById(R.id.edtCustomerPhone);
        edtCustomerUsername = findViewById(R.id.edtCustomerUsername);
        edtCustomerPassword = findViewById(R.id.edtCustomerPassword);
        display_infor();
        btnNew=findViewById(R.id.btnSave);
        btnSave=findViewById(R.id.btnSave);
        btnRemove=findViewById(R.id.btnRemove);
    }


    private void display_infor() {
//        Lấy intent ừ bên CustomerManagementActivity gửi qua
        Intent intent=getIntent();
//        Lấy dữ liệu selected customer từ intent
        Customer c= (Customer) intent.getSerializableExtra("SELECTED_CUSTOMER");
        if(c==null)
            return;
//        Hiển thị thông tin customer lên giao diện
        edtCustomerID.setText(c.getId()+"");
        edtCustomerName.setText(c.getName());
        edtCustomerEmail.setText(c.getEmail());
        edtCustomerPhone.setText(c.getPhone());
        edtCustomerUsername.setText(c.getUsername());
        edtCustomerPassword.setText(c.getPassword());
    }
}