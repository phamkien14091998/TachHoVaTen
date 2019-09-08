package com.example.tachhovaten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtHVT;
    TextView txtHoKQ,txtTenKQ;
    Button btnHVT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtHVT= findViewById(R.id.edtHVT);
        txtHoKQ= findViewById(R.id.txtHoKQ);
        txtTenKQ= findViewById(R.id.txtTenKQ);
        btnHVT=findViewById(R.id.btnHoTen);

        btnHVT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoten=edtHVT.getText().toString().trim(); // bỏ khoảng trống thừa ở chuỗi
                int i=hoten.lastIndexOf(" "); // tìm chỉ mục cuối cùng của giá trị bạn đưa vào
                String hodem="";
                String ten="";
                if(i>0){ // tìm thấy có vị trí cần
                    hodem=hoten.substring(0,i); // tạo thành chuỗi con từ vị trí đầu tới vị trí cuối i tìm thấy
                    ten=hoten.substring(i);
                }
                else{
                    hodem=hoten; // nếu k thây dấu cách của tên thì có mỗi họ đệm chứ k có tên
                }

                txtHoKQ.setText(hodem);
                txtTenKQ.setText(ten);

            }
        });




    }
}
