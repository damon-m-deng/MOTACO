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
                    " MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNNNNWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMWWNXKOkxool" +
                            ":::cccclldxxkO0KNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMNKOxoc:,''.....................';" +
                            ":lokKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMWX0kxl:'.................................';" +
                            "ldOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMW0o:,'.........................................." +
                            ".':dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMNOl,..................................................," +
                            "cdk0NWMMMMMNX0O0XWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMXo'......................................................." +
                            ".'cdk0XXOl,,'':d0NMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMKc...............................................................,,'" +
                            "........;d0NMMMMMMMMMMMM\n" +
                    "MMMMMMMKc..................................................................." +
                            "..........,codxk0NMMMMMM\n" +
                    "MMMMMMNd'..................................................................." +
                            "................'ckNWMMM\n" +
                    "MMMMMWO,...................................................................." +
                            "...................,cxKN\n" +
                    "MMMMMKc....................................................................." +
                            ".....................':l\n" +
                    "MMMWKc......................................................................" +
                            "........................\n" +
                    "MNOl,......................................................................." +
                            "........................\n" +
                    "kl,........................................................................." +
                            "......................'.\n" +
                    "............................................................................" +
                            "........':ol:;;;;;:ccldk\n" +
                    ".'.........................................................................." +
                            "......,oONMWWNNNNNWWWMMM\n" +
                    "xkkxl:,'.........................';coddoooooc:;,,;:::'.....................'" +
                            "....;d0NMMMMMMMMMMMMMMMM\n" +
                    "MMMMMWX0xoc::;:::::loc,....';;:lkKNWMMMMMMMMMWNNNNWWNk;...................," +
                            "xx,..:KMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMWWWNNNNNNWWWKl,..'l0XNWMMMMMMMMMMMMMMMMMMMMMWKd:'..............." +
                            ".:KWKo'.:oxOKNMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMXkl;,':dO00XWMMMMMMMMMMMMMMMMMMMMMXklc:::;'.........;" +
                            "0MMNx:,...,okXMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMWXx,....':ldONMMMMMMMMMMMMMMMMMMMMMWWWNXKOdc;'....;" +
                            "xXWMWN0xlok0XMMMMMMMMMMM\n" +
                    "kKNWMMMMMMMMMMMMMMMMMMMMMMMWk;','.,,,dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNX0kd:'" +
                            ".':oooodxONMMMMMMMMMMMMMM\n" +
                    ",;cldxO00KK0KKKK00000Okkkkkkxl;::," +
                            "cccoxxxxxkOOKXNWWMMMMMMMMMMMMMMMMMMMMMMNOl,,ldl:;:xNMMMMMMMMMMMMMM\n" +
                    "XKOkxoollcccccllccloxxxkOOO00OO0000000000OkOkkOOOOOO000XWMMMMMMMMMMMMMMMMMMWXKWMMWWWMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMWNNNNNNNNNNNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWNXKKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        }
        else if(rand == 2){
            monster = new SkeletonKnight();
            System.out.println(
                    " WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                    "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                    "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                    "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMMMWWWWWWWWWWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMWWWWWWXOx0NNNNNNNWWWWWWMMMMMMMMMMMMMMMMMMWOllxKNWNNNNNNNNNNWWWWWWWMMWWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMMWWKd:':kXNNNNNNNWWWWWMMMMMMMMMMMMMMMMMMMWO:;" +
                            "cdKNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMWWWkc:;" +
                            "oKNNNXNNNNWWWWWWN0OO0XWMMMMMMMMMMMMMWO" +
                            ":ccoKNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMW0loc;" +
                            "kNNNNNNNNNNWWNXkloxdlcxKNWMMMMMMMMMMWk" +
                            ":lxlxNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWxlOd:l0NNNXNNNNNKkdd:;" +
                            "kKKk::xxxONWMMMMMWKxod00ldNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWklOX0xoox0KXKX0ddkKXlcO00OclXWKkxkOkOkkxxOXWNxcONNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMMXol0NNKkdoccc:cxXWWKcl0KK0lcKWMMXdcll" +
                            ":xNWMNKdckNNNNNXXNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWKocdOKXKdclclONWWNO;" +
                            "l0KK0l:OWMMMNkoddoxOkdclONNNNNNNXNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMMWWXxc;::;cl:lOXNWWXx;o0kk0o;xXMMMMXxlol,,;" +
                            "lkXWWNNNNNXNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWKxc'.;;:dKNNWNKo,oXNNXo;oKWMMMXkoc;" +
                            "'c0NWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWWNXd'';:oOXWWNOc;dkxxkd;lONMMW0dlc;" +
                            "lXWWWWWNNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWNNNNKc,;;:okkxdo::kNNNNOloxxkkxl:;:;" +
                            "oXMWWWWNNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNNk,.',:ldkxxk0XX00K0XWX0OKX0kdl;" +
                            ".'dNWWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNN0;  'cloxkdccdxdl;:loodl:ldo:cc,. ;" +
                            "KMWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNN0,  ..',:::;::'ckxxOl,llcc::cl:,." +
                            ".cXWWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNN0: .'cc'..',;,,x0OO0x;,;'....cxc..;" +
                            "OWWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWXO:.. ,o'       .cxoodc.       'd:  " +
                            ".:ONWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMMWWWW0:..  'oc.      .:,..,l:..'',;cxOc..'," +
                            "c0WWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWNk;.  .cO00kxxxxxkl....l0K0KXNWWWNk'.;" +
                            "olkWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWXl... .:x0KXNNNWW0:';:,:0NNXXKK0ko,." +
                            ".'lkXWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWNxl:,.  .';:cccx0KKKXNXXNKkc;c:,....';" +
                            "lONWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNKk:..   .;c..oxO00OOO0Okd,:ko' .',;" +
                            "lKWWWWNNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNK: ..   cO;.,:cllolllc:,.cKo....." +
                            ".lXWWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMMWWWWNNO'...;, cO,  ..',;;,'.. .c0l.::.'.;" +
                            "0MWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMMWWWWNNk'...c; :O:..         ..,d0:.od,..;" +
                            "0WWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNk'...:' .coc;',,,;;,;;;cdo:..ok;..," +
                            "kWWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNx...'ol.  .okdolloolodk0o..,:xKc..;" +
                            "0WWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNx'..;O0:.. .:oolclllcll:.." +
                            ".xKNXl''cKWWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNO,..cKXOxc. ..    .  ...;;cKMW0c,.;" +
                            "KWWWWWNNNNNNNNNNNWWWWWWMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNN0; .:ONNXd,cl.  ..,..'.,kKKWMM0c." +
                            ".:KWWWWWNNNNNNNNNNNWWWWWMMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNN0; .;xNNNXk0x;,,'.',lkk0WMMMMMWOl;" +
                            "xWWWWWWNNNNNNNNNNNWWWWWMMMMWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNNx''dKNNNWWWXKXO,..," +
                            "kWMMMMMMMMMMWNNWWWWWWNNNNNNNNNNNWWWWWMMMWWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNNOxOXNNNNNWWWWWx..';" +
                            "dNMMMMMMMMMMMMMMWWWWWNNNNNNNNNNNWWWWWWMWWWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNNNNNNNNNNNWWWWWK;..," +
                            "kWMMMMMMMMMMMMMMWWWWWNNNNNNNNNNNWWWWWWWWWWWWWWWW\n" +
                    "WWWWWWWMMMMMMMMMMMMMMMMMMWWWWWNNNNNNNNNNNNWWWWWWKdoONMMMMMMMMMMMMMMWWWWWWNNNNNNNNNNNWWWWWWWWWMWWWWWW\n" +
                    "WWWWWWWWWWMMMMMMMMMMMMMMWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                    "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\n" +
                    "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        }
        else if(rand == 3){
            monster = new Mermaid();
            System.out.println(
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMN0O0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMWkc:'lNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMXx::kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXKNWMMMMM\n" +
                    "MMMMNd'':kNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKkxooKWMMMMM\n" +
                    "MMMMWXKKKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXKNMMMMMN0kkxdodKMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWK0OkXMMMMW0xkkOOOONMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOxxkkKWMMMN0kxkxddxKMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0xxkdx0NMMMXOOxdoccoOWMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMWNNNNNWMMMNKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKOOkxxkkKMMMXOkxdoldkOXWMMMM\n" +
                    "MMMMMMMMMMMMMMWNX0xdxxxO00KNNKNWWMWNXXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNOOkl;cc:kWMMN0kkxkkxkkONMMMM\n" +
                    "MMMMMMMMMMMMWNK0kxdolodxkxxxkO000XX00XWWMMWXXNMMMMMMMMMMMMMMMMMMMMMMMMMXkxdl" +
                            ":lccxKNMW0xdoxOddkOKWMMM\n" +
                    "MMMMMMMMMMMMXOxxkxkxddxkOko:;;" +
                            "ccclollOWMMWXKK0XMMMMMMMMMMMMMMMMMMMMMMMMNOdocllccodkXW0dooodoclldNMMM\n" +
                    "MMMMMMMMMMMN0xxxkkkkxddkkxlclddl" +
                            ":ccccdKXNNX00OKMMMMMMMMMMMMMMMMMMMMMMMMWKkxoolcclodxKX0OkococlcoXMMM" +
                            "\n" +
                    "MMMMMMMMMMWXkxddxkkxdkkdxkddxxxdllcccoxdxxxk0NWNNWMMMMMMMMMMMMMMMMMMMMMMWKkkxoddoxxdxkkkkkxdxkxkXMMM\n" +
                    "MMMMMMMMMMXOOOxdxkOxdkOxxxdxOxdll" +
                            ":::::lxkkkkOXNXNWMMMMMMMMMMMMMMMMMMMMMMMMNK0xxd;;;::,,;" +
                            ":dxdxxdkNMMM\n" +
                    "MMMMMMMMMWKOkkxxxxkkkxkxxddxkkkooodddxxOOOkddkKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOdlddoollloxxddooOWMMM\n" +
                    "MMMMMMMMMMWKOOOOdcckxcccllodxO0OOOOkkOOkkkOkdk0KKKKXK0KXNWMMMMMMMMMMMMMMMMMMMMWNXK0kocclllcllcl0WMMM\n" +
                    "MMMMMMMMMMMWWWNKxlcodollodOKXWWWWNX0OxxkxxOdc:,;" +
                            "ccllld00KNWMMMMMMMMMMMMMMMMMMMMMMMWNKkxo:::::d0NMMMM\n" +
                    "MMMMMMMMMMMMMMMWXkoloxOxdx0XXXNMMMMWXkdkkdxxdl" +
                            ":lollox0XXXXWMMMMMMMMMMMMMMMMMMMMMMMMMMMN0dl:co0WMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMWXOkOXKkxddodkXWWWWWOdkxldkkolx0OxONWNXKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0old0WMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMWX0OOkxxxxkOKNNNX0OKK0000KKXNX0KNMMWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOolxXMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMWNKd:cllclccc" +
                            ":xKWWWWMMWXXNWMMWNNXNWWWNNWWMMMMMMMMMMMMMMMMMMMMMMMMWXOkkxdxKWMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMWKkxdlooollcclldk0NMMMMMWNWMNXX0kxxxkkkxO0O0XNWMMMMMMMMMMMMMMMMWNKkxxdooxKWMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMNOddkkxxxxkOddxddxkOXNWWWWXKkxxkkxollclllllodxO0KXNWWWWWWWNNXKOkkxdxkOkx0WMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMNOddkXKkkxox0xdoxkxddddkkdddddxdxkxl:c;" +
                            ":::::lokxllooxkxddoloookxdkxdddkkKWMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMWKxdONMWOxkxxxkOddddddxxolclodkOkdxkxdolllldxdddoolcoddddolccclooooodkxkKWMMMMMMMMMMM\n" +
                    "MMMMMWNXNNX0O0XKkoxXWWXkddk0kxkc:;::',::llckkxkkkxxc',;;;,c;'::;c;," +
                            "lkddxkkdolcllcccldONWMMMMMMMMMMMM\n" +
                    "MMMWNKxlodo::okkkkkxkxddod0WWNKkxocccloodxkOkkkkxxxollodoooloolcllokOOxxdoooodkxxkOKNWMMMMMMMMMMMMMM\n" +
                    "MMMMMN0kxddxOKXKXKK000O0KXWMMMWWNNKOO0KK0OOK00K0OO00kxkkxkOkxxxkkoclllccc" +
                            "::ox0KKXNWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMWNNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWWWWWNWWWNXKKKKKKOkOO0OxxkkkkkO0XWWMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        }

        return monster;
    }
}