package progetto_2019_2020.op_progetto.Lettura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import progetto_2019_2020.op_progetto.Conn_Server.ConnessioneIds;



import progetto_2019_2020.op_progetto.Preleva_Informazioni.*;
public class LeggiLabs extends LeggiStringa {
    HashSet <String> mtr2 =new HashSet<String>();
    ConnessioneIds connessione=new ConnessioneIds();
    String a="";

    
    public /*String*/void LetturaLabs(){
        GetId IdsSearch=new GetId();
        mtr2 = IdsSearch.Tweet_id();
        Iterator <String> iter = mtr2.iterator();
        while(iter.hasNext()){
            String id=iter.next();
            connessione.Prendiinformazione(id);
        }
        connessione.dati_api(connessione.getUrl());
        try{
        in=connessione.getConnessione().getInputStream();
        inR=new InputStreamReader(in);
        buf=new BufferedReader(inR);
        try{
           a=string_letta(); 
        }finally{
            in.close();
        }}catch(IOException e){
            e.printStackTrace();
        }
    
    File file=new File("twitter2.json"); // C:\\Users\\erkut\\Desktop\\Progetto\\op_progetto\\src\\main\\java\\progetto_2019_2020\\


    if( a != "" ){
        try{
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(file)));
            output.println(a);
            output.close();
        }catch(IOException e ){
            e.printStackTrace();
        }
       // System.out.println(a);
        //return a;
    }
   
    

}
}