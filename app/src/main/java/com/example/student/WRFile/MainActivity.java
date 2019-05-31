package com.example.student.WRFile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickwrite(View view) {

        String fname=getFilesDir().getAbsolutePath();
        try {
            FileWriter fw=new FileWriter(fname+ File.separator+"data.txt");
            fw.write("android is fun");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickread(View view) throws FileNotFoundException {
        char [] ch=new char[100];
        String fname=getFilesDir().getAbsolutePath();
        try {
            FileReader fr=new FileReader(fname+File.separator+"data.txt");
            fr.read(ch);
            String str=new String(ch);
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
