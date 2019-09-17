package br.eteczl.pam1recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

//https://developer.android.com/guide/topics/ui/layout/recyclerview

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nossoRecycleView);

        List<Aluno> listAlunos = new ArrayList<>();
        Aluno Hilton = new Aluno();
        Hilton.setNome("Hilton");
        Hilton.setIdade(47);

        Aluno Estela = new Aluno();
        Estela.setNome("Estela");
        Estela.setIdade(45);

        Aluno Gustavo = new Aluno();
        Gustavo.setNome("Gustavo");
        Gustavo.setIdade(14);

        listAlunos.add(Hilton);
        listAlunos.add(Estela);
        listAlunos.add(Gustavo);

        recyclerView.setAdapter(new NossoRecicleViewListDeAlunosAdapter(listAlunos, this));

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
    }
}
