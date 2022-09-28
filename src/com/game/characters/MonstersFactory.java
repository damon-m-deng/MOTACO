package com.game.characters;

import java.util.Random;

public class MonstersFactory {

    // generate a random number [1-3] to select one of the 3 kinds of monsters


    private MonstersFactory(){
    }

    public static Monsters generateMonster(int rand){
        Monsters monster = null;

        if(rand == 1){
            monster = new GiantRat();
            System.out.println(
                    "MMMMMMMMMMMMMMMMMMMMMWNXK0OkdddddxxxO00XXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                            "MMMMMMMMMMMMMMMWX0xol:;,'..............',;" +
                            "cldkKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                            "MMMMMMMMMMWX0kdl;'...........................';" +
                            "cokXWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                            "MMMMMMMMWKx:'.....................................;" +
                            "oOXNWMMMMMMWWWMMMMMMMMMMMMMMM\n" +
                            "MMMMMMMNd,..'........................................," +
                            ":ok0NN0dcccd0NMMMMMMMMMMMM\n" +
                            "MMMMMMKl'................................................';;'...." +
                            ".':d0NWMMMMMMMM\n" +
                            "MMMMMXl............................................................." +
                            ".';clokXWMMM\n" +
                            "MMMMWx'............................................................." +
                            ".......;oOXW\n" +
                            "MMMW0;.............................................................." +
                            ".........':d\n" +
                            "MMWO:..............................................................." +
                            "............\n" +
                            "Xkl,................................................................" +
                            "............\n" +
                            ",.................................................................." +
                            ".,;,'''',,,:l\n" +
                            "..................................................................;" +
                            "d0XK00000KKXW\n" +
                            "kOkdc;'...................,codxxxddoc::cll:.................'...;" +
                            "kXWMMMMMMMMMMMM\n" +
                            "MMMMWN0kxddddddxxc'..,lodOXWMMMMMMMMMWWWMMXd,..............;kk:" +
                            ".:ONWWMMMMMMMMMMM\n" +
                            "MMMMMMMMMMMMMMMMWKd:,;oOXXNWMMMMMMMMMMMMMMMWXkc;,,,'.......:0MXd;,;" +
                            ":okXWMMMMMMMM\n" +
                            "MMMMMMMMMMMMMMMMMMWNKx:',,:ldONMMMMMMMMMMMMMMMWNXXK0kdl;'." +
                            ".'cONNXOxllkKWMMMMMMMM\n" +
                            "dOKNWWMMMMMMMMMMWWWWWNOc,,',;l0NNWWWMMMMMMMMMMMMMMMMMMWXKOd;" +
                            "'':olllxXMMMMMMMMMMM\n" +
                            "llooodxxddxxxddxxkkkkkkdoooddxkkkkkOO00KKKXNWMMMMMMMMMMMMMWXkldOkddONMMMMMMMMMMM\n" +
                            "MWNXK0OOkkkOOO0KXXNWWWWWWWWWWWWWWWNNNXXKKKKKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                            "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        }
        else if(rand == 2){
            monster = new SkeletonKnight();
            System.out.println(
                    "WWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWMMWWWWWWWWWMWWWWWWWNNWWWWWWWWWWWMMMMMMMMMMMMMMW0kKNWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWXOocxXNNNNNWWWWMMMMMMMMMMMMMMMW0c" +
                            ":d0NNNNXNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWKd" +
                            "::xXNXNNNNWWWWNK000NMMMMMMMMMMMKlclkNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMNxocl0NNNNNNNWNKOolddlokKNMMMMMMMW0ldddKNNXNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMXdxOooOKXNNNXOkkdcdKKdcxOkOKNNNK0kkOKxdKNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWkdKX0xxdddodkKWOcxXKxlOWWKxodod0XWNkoONNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMMXxox0KOl" +
                            "::lONWNxckKKkcxNMMNkdddkOkoo0NNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMWWWNOlc;;:clONNWKlcO00OcoXMMMXdlc,;" +
                            "oOXWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMMWWNXOc',:o0NWN0cckOOkcc0WMWKxl;" +
                            ":kNWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNN0c,;" +
                            "cx00ko:lO000ocxOOOdc::dNMWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNNO;.,:oxkxdOKK000KKkk0Oxo:'," +
                            "kWWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNXc .,:codccodollooolcddl:;." +
                            ".lNWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWNNXl  ';,'',:;ckOOkc:c;;,;cc." +
                            ".oNWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWXk;..c:    ..;xxxd;..   .:l..," +
                            "kNWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWNk;.  :c..   .;:,,::''',;cxd'" +
                            ".':kNWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWXo'  .d00OOkkOd'..'dKKXNWWNO," +
                            ".:okNWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWKl'...,oxkkO0KkodddOX0xxxoc'..;" +
                            "dKWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWNKkc..  .;,'lkKXKXXKOo,cl'..';" +
                            "oKNWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNXl... .ol.,cloddol:,'xx'.." +
                            ".'dNWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNK:..,,.lo. ...''....'xd,:;." +
                            ".lXWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNK:..,,.:o;........',ld:'ol." +
                            ".cXWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWW0;..;:. 'cdlcclllodxo'';xd," +
                            ".cKWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWN0;..oO:...:oc:cccclc..l0Nk," +
                            "'oNWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNKc..xX0x,...  ......:l0MNx," +
                            ".lNWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNXc..oKNKdoo...',';:oKNWMWO;" +
                            ".dWWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWNNNx',xXNNNX0kx:." +
                            ".:0NWMMMMMWKOXWWWWNNNNNNNNNNWWWWMMWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNN0xOXNNNWWWWK;" +
                            ".':0MMMMMMMMMMMWWWWNNNNNNNNNNWWWWWWWWWWWW\n" +
                            "WMWWWWMMMMMMMMMMMMMMWWWWNNNNNNNNNWWWWNo" +
                            "''lXMMMMMMMMMMMWWWWWNNNNNNNNNWWWWWWWWWWWW\n" +
                            "WWWWWWMMMMMMMMMMMMMMWWWWNNNNNNNNWWWWWMNK0XWMMMMMMMMMMWWWWWWWNNNNNNNWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMMWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        }
        else if(rand == 3){
            monster = new Mermaid();
            System.out.println(
                    "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWNK000O00KNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWXOkxxxxxxxx0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWXOxxxxxxxxxx0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWMWWWXOxxxxxxxxxxxKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWMWWN0xxxxxxxxxxxx0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWNXOxxxxxxxxxxxxx0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWNXK0OkxxxxxxxxxxxxxONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWNNXKOkxxxxxxxxxxxxxxxOXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWNXK0kxxxxxxxxxxxxxxxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWXOkxxxxxxxxxxxxxxxxxxxOKNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWKkkkxxxxxxxxxxxxxxxxxxxxxkO0KNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWW0OKOxxxxxxxxxxxxxxxxxxxxxxxxxkOKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWMNKKOxxxxxxxxxxxxxxxxxxxxxxxxxxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWX0kxxxxxxxxxxxxxxxxxxxxxxOkxxxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWNX0kxkxxxxxxxxxxxxxxxxxxxk0NXOxxxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWNX00O00kxxkkxxxxxxxxxxxxxx0WMWN0kxxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWNNKxkK0xxxxxxxxxxxxxxONWWMWNXKkxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWMMWWWKkK0xxxxkxxxxxxxxxxONWWWWWWWKkxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWMWWWNKOxxxkKN0xxxxxxxxxkKWMWWWWWWXkxxk0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWNOxxk0XWMNOxxxxxxxxxkOXNWWWWWWXOxxxkXWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWNOxk0XWWWWW0xxxxxxxxxxxxO0XNWWWWN0kxxxKWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWNOkOXWWWWWWN0xxxxxxxxxxxxxxkO0XWWWWX0kxkKNWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWMWWWWWWKOOKNWWWWWWWW0xxxxxxxxxxxxxxxxxkXWWWWWN0kkKNWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWXKK0Okk0NWWWWWWWWWW0xxkxxxxxxxxxxxxxxxkXWWWWWWN0kOXNNNNWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWX0O00OkOXNWWWWWWWWWWWKkkkkxxxxxxxxxxxxxxx0WWWWWWMWKkxkO00OO0NWWWWWWWWWWWWWWWW\n" +
                            "WWWXKNWXXNWWWWWWWWWWWWWWKkkkxxxxxxxxxxxxxxxxONWWWWWWWWNXKKNNX00XWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWXkxkxxxxxxxxxxxxxxxxOWWWWWWWWWWWWWWWWWNWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWNOxkkxxxxxxxxxxxxxxx0WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWW0kkkkxxxxxxxxxxxxxkKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWXkxkxxxxxxxxxxxxxxONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWNOxxxkxxxxxxxxxxxxKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWKkxkkxxxxxxxxxxxONWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWNOkkxxxxxxxxxxxxKWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWKkkkkxxxxxxxxxkXWWWWWWWWWWWWWWWNNWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWNOxkkxxxxxxxxxONWWWWWWWWWWWWWX0KNWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWKkkkxxxxxxxxk0WWWWWWWWWMWWW0xkXMWWWWWWWWWWWWWWWWXNMW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWMNOxkxxxxxxxkOXWWWWWWWWWWWN0xxkXWWWWWWWWWWWWWWWW0ONWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWXkxkxxxxxxOKNMWWWWWWWWWWKxxxxONWWWWWWWWWWWWMWKxONWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWMWWW0kkxxxxxxOXNMWWWWWWWWWW0xxxxxOXWMWWWWWWWWWWXkxkXWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWMWWWXOxxxxxxxOXNWWWWWWWWWWWKkxxxxxONWWWWWWWWWWXkxxxKWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKkxxxxxxOKNMWWWMWWWWWWNOxxxxxkXWWNNWWWWX0kxxxx0WW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKkxxxxxk0XWWWWWWWMWWWW0xxxxxO00OkkOOOkkxxxxxxKWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMN0xxxxxxkKWWWWWWWWWWWWKxxxxxxxxxxxxxxxxxxxxxONWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNOxxxxxxkXWWWWWWWWMWWKkxxxxxxxxxxxxxxxxxxxOXWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWN0xxxxxxkKWWWWWMWWWWKxxxxxxxxxxxxxxxxxxk0NWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNKOxxxxxxOKNWWWWWN0kxkkkkkxxxxxxxxxxk0XWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNKOkkxxxxkOO00Oxxk0XNWNNXK00000KKXNWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWNNK0OOkkkkkO0XNWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWNNNNNWWMWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                            "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        }

        return monster;
    }
}