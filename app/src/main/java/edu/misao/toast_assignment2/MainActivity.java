package edu.misao.toast_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText name, tel, height,num1,num2;
    Button submit;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String a,b;
//        String a="3",b="3";   //←入力の値に関わらずこの値を指定
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        name = findViewById( R.id.etName );
        tel = findViewById( R.id.etTel );
        height = findViewById( R.id.etHeight );
        submit =findViewById( R.id.btnSub );
        radioGroup = findViewById( R.id.blood );

        num1 = findViewById( R.id.etAdd1 );
        num2 = findViewById( R.id.etAdd2 );


        submit.setOnClickListener( this );

//        add(); //←クリックされる前に実行(画面が表示された時)

    }

//    public void add() {       //←間違いString,intは宣言する
//        String a = num1.getText().toString();
//        String b = num2.getText().toString();
//        int result = Integer.parseInt( a ) + Integer.parseInt( b );
//        Toast.makeText( getApplicationContext(), "Addition : " + result, Toast.LENGTH_SHORT ).show();
//    }


    public void add()
    {
//        a="5";    //←入力の値に関わらずこの値を指定
//        b="6";
        a = num1.getText().toString();
        b = num2.getText().toString();
        result = Integer.parseInt( a ) + Integer.parseInt( b );
        Toast.makeText( getApplicationContext(), "Addition : " + result, Toast.LENGTH_SHORT ).show();
    }
    @Override
    public void onClick(View view) {


        add();
        int check = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById( check );


        /*--------------assignment toast------------------*/





//        Integer.parseInt( tel.getText().toString() );
//        Toast.makeText(getApplicationContext(),tel.getText(),Toast.LENGTH_LONG).show();//変数を直接出力
//
//        String str = name.getText().toString();
//        Toast.makeText( getApplicationContext(),"Hi " + str,Toast.LENGTH_LONG).show();//文字変数(str)を出力
//
//        int i = Integer.parseInt(tel.getText().toString());
//        Toast.makeText( getApplicationContext(), "Number: " + i,Toast.LENGTH_SHORT ).show();//数字変数(i)を出力
//
//
//        Toast.makeText( getApplicationContext(),"START",Toast.LENGTH_LONG ).show();//" "の値を出力
//
//        Toast.makeText( getApplicationContext(), tel.getText(), Toast.LENGTH_SHORT ).show();//入力した変数の値を出力
//
//        Toast.makeText( getApplicationContext(),"Number " +tel.getText(),Toast.LENGTH_LONG).show();//" "の値+入力した変数の値を出力
//
//        Toast.makeText( getApplicationContext(), name.getText().toString(), Toast.LENGTH_LONG ).show();//入力した変数の値を出力
//
//        Toast.makeText( getApplicationContext(), "Hi "+name.getText().toString(), Toast.LENGTH_LONG ).show();//" "の値+入力した変数の値を出力

        /*-----------------------------------------------*/


        Intent intent = new Intent( MainActivity.this,SecondActivity.class );

        intent.putExtra( "N",name.getText().toString() );
        intent.putExtra( "T",tel.getText().toString());
        intent.putExtra( "H",height.getText().toString() );
        intent.putExtra( "b",radioButton.getText().toString() );

        startActivity( intent );


    }
}