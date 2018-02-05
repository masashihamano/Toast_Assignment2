package edu.misao.toast_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {


    TextView name, tel, blood, height;
    Button back, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        name = findViewById( R.id.tvName );
        tel = findViewById( R.id.tvTel );
        height = findViewById( R.id.tvHeight );
        blood = findViewById( R.id.blood );
        back = findViewById( R.id.btnBack );
        exit = findViewById( R.id.btnExit );


        back.setOnClickListener( this );
        exit.setOnClickListener( this );


        String n = getIntent().getStringExtra( "N" );
        name.setText( n );
        String t =getIntent().getStringExtra( "T" );
        tel.setText( t );
        String h = getIntent().getStringExtra( "H" );
        height.setText( h );
        String b = getIntent().getStringExtra( "b" );
        blood.setText( b );

    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.btnBack:
                Intent intent1 = new Intent( SecondActivity.this,MainActivity.class );
                startActivity( intent1 );

                Toast.makeText( getApplicationContext(),"Called back",Toast.LENGTH_LONG ).show();
                break;

            case R.id.btnExit:
                Intent intent2 = new Intent(Intent.ACTION_MAIN);
                intent2.addCategory( Intent.CATEGORY_HOME );
                intent2.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity( intent2 );
                finish();
                System.exit( 0 );
                break;


        }

    }
}
