package com.example.dm2.listas;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Webs extends AppCompatActivity {

    private ListView listaweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webs);
    /* Realiza un ListView "Mis webs favoritas". Que enlace con la urls de tus webs favoritas. La lista va
       a contener el nombre de la web, la url, una imagen y un identificativvo de esta. */

        final Web[] webs=new Web[]{
                new Web(getDrawable(R.mipmap.ic_youtube),"YouTube","https://www.youtube.com/"),
                new Web(getDrawable(R.mipmap.ic_facebook),"FaceBook","https://es-es.facebook.com/"),
                new Web(getDrawable(R.mipmap.ic_steam),"Steam","https://store.steampowered.com/")
        };


        AdaptadorWeb aw=new AdaptadorWeb(this,webs);

        listaweb=findViewById(R.id.LstOpciones);
        listaweb.setAdapter(aw);

        View header=getLayoutInflater().inflate(R.layout.lista_header,null);
        listaweb.addHeaderView(header);

        listaweb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   Web w= (Web)parent.getItemAtPosition(position);
                   Uri uri=null;

                   uri=Uri.parse( webs[position-1].getUrl());

                   Intent inten = new Intent(Intent.ACTION_VIEW,uri);
                   startActivity( inten );
               }

        });
    }
}

    class AdaptadorWeb extends ArrayAdapter<Web> {

        private Web[] webs;

        AdaptadorWeb(Context contexto, Web[] webs) {
            super(contexto, R.layout.lista_items, webs);
            this.webs = webs;
        }


        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View vista = inflater.inflate(R.layout.lista_items, null);

            ImageView img=vista.findViewById(R.id.imgWeb);
            img.setImageDrawable(webs[position].getImg());

            TextView nombre=vista.findViewById(R.id.NomWeb);
            nombre.setText(webs[position].getNombre());

            TextView url=vista.findViewById(R.id.UrlWeb);
            url.setText(webs[position].getUrl());

               return vista;
        }
    }