/*package Conn_Server;

import Preleva_Ids.GetId;

public class ConnessioneSearch {
    String ricerche_tweet[] = { "Italy", "France", "Belgium", "Germany", "Austria", "Hungary", "Poland", "Russia",
            "America", "Sweden", "Finland", "Turkey", "Cameroon", "Greece", "Spain", "Portugal", "England", "Iceland",
            "China", "Poland" };
    public void ids() {
    String s="0";
    ConnessioneAPI connessione= new ConnessioneAPI();
    GetId ids= new GetId();
    int i = 0;
    do{
    String url_ricerche = connessione.getUrl()+ "?q=%23" +ricerche_tweet[i]+ "&count=100";
    connessione.setUrl(url_ricerche);
    s=connessione.dati_api();
    i++;
    }while(s!="0"&&i<20);
    if(s=="0"){
        LeggifileJSON json=new LeggifileJSON();
        s=json.data_file();
    }
    ids.Tweet_id(s);
    }
}
*/
