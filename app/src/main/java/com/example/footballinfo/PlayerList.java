package com.example.footballinfo;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {

    private static final PlayerList ourInstance = new PlayerList();

    public static PlayerList getInstance() {
        return ourInstance;
    }
    // Creating players Arraylist and adding data
    private List<Player> players;
    public void add()
    {
        players = new ArrayList<Player>();
        players.add(new Player("Trent Alexander-Arnold",	20,	2014, 71,4));
        players.add(new Player("Fabinho",	25,	2018,	27,	1));
        players.add(new Player("Roberto Firmino",	27,	2015,	181,	61));
        players.add(new Player("Joe Gomez",	21,	2015,	59,	0));
        players.add(new Player("Jordan Henderson",28,	2011,	309,	24));
        players.add(new Player("Adam Lallana",	30,	2014,	153,	21));
        players.add(new Player("Dejan Lovren",	29,	2014,	164,	7));
        players.add(new Player("Sadio Mane",	26,	2016,	109,	48));
        players.add(new Player("Joel Matip",	27,	2016,	86,	3));
        players.add(new Player("Simon Mignolet",	31,	2013,	204,	0	));
        players.add(new Player("James Milner",	33,	2015,	162,	20));
        players.add(new Player("Alberto Moreno",	26,	2014,	141,	3	));
        players.add(new Player("Sheyi Ojo",	21,	2011,	13,	1));
        players.add(new Player("Divock Origi",	23,	2014,	88,	24));
        players.add(new Player("Alex Oxlade-Chamberlain",	25,	2017,	42,	51));
        players.add(new Player("Connor Randall",	23,	2013,	8,	0));
        players.add(new Player("Sadio Mane",	26,	2016,	109,	48));
        players.add(new Player("Andy Robertson",	24,	2017,	64,	1));
        players.add(new Player("Mohammed Salah",	26,	2017,	88,	64));
        players.add(new Player("Xherdan Shaqiri",	27,	2018,	26,	6));
        players.add(new Player("Daniel Sturridge",	29,	2013,	153,	67));
        players.add(new Player("Virgil van Dijk",	27,	2018,	57,	4));
        players.add(new Player("Georginio Wijnaldum",	28,	2016,	125,	10));



    }
    //Creating getPlayerlist and getPlayer method
    public List<Player> getPlayerList(){
        return this.players;
    }
    public Player getPlayer(int value){
        return this.players.get(value);
    }
}
