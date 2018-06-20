package com.example.keetawatsrichompoo.itsale;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keetawat Srichompoo on 10-May-18.
 */

public class Database {

    public String genre, subgenre, type, type_sub, player;
    public int gameId;
    public String gameName = "";
    public String[] list_games = new String[1070];
    public Database(){}

    public Database( int id, String genre, String sub, String type, String type_sub, String player ) {
        gameId = id;
        this.genre = genre;
        this.subgenre = sub;
        this.type = type;
        this.type_sub = type_sub;
        this.player = player;

    }

    public int getGameId( String genre, String sub, String type, String type_sub, String player ) {

        if(genre.equals("Shooting")){
            gameId += 0;

            if(sub.equals("First Person")){
                gameId += 1;

                if(type.equals("Adventure")){
                    gameId += 2;

                    if(type_sub.equals("Historical")){
                        gameId += 3;

                        if(player.equals("Singleplayer")){
                            gameId += 4;
                        }
                        if(player.equals("Mixed")){
                            gameId += 5;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 6;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 7;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 8;
                        }
                    }
                    if(type_sub.equals("Modern")){
                        gameId += 9;

                        if(player.equals("Singleplayer")){
                            gameId += 10;
                        }
                        if(player.equals("Mixed")){
                            gameId += 11;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 12;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 13;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 14;
                        }
                    }
                    if(type_sub.equals("Future")){
                        gameId += 15;

                        if(player.equals("Singleplayer")){
                            gameId += 16;
                        }
                        if(player.equals("Mixed")){
                            gameId += 17;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 18;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 19;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 20;
                        }
                    }
                }

                if(type.equals("Linear")){
                    gameId += 21;

                    if(type_sub.equals("Historical")){
                        gameId += 21;

                        if(player.equals("Singleplayer")){
                            gameId += 23;
                        }
                        if(player.equals("Mixed")){
                            gameId += 24;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 25;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 26;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 27;
                        }
                    }
                    if(type_sub.equals("Modern")){
                        gameId += 28;

                        if(player.equals("Singleplayer")){
                            gameId += 29;
                        }
                        if(player.equals("Mixed")){
                            gameId += 30;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 31;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 32;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 33;
                        }
                    }
                    if(type_sub.equals("Future")){
                        gameId += 34;

                        if(player.equals("Singleplayer")){
                            gameId += 35;
                        }
                        if(player.equals("Mixed")){
                            gameId += 36;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 37;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 38;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 39;
                        }
                    }
                }

                if(type.equals("Story telling")){
                    gameId += 40;

                    if(type_sub.equals("Historical")){
                        gameId += 41;

                        if(player.equals("Singleplayer")){
                            gameId += 42;
                        }
                        if(player.equals("Mixed")){
                            gameId += 43;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 44;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 45;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 46;
                        }
                    }
                    if(type_sub.equals("Modern")){
                        gameId += 47;

                        if(player.equals("Singleplayer")){
                            gameId += 48;
                        }
                        if(player.equals("Mixed")){
                            gameId += 49;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 50;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 51;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 52;
                        }
                    }
                    if(type_sub.equals("Future")){
                        gameId += 53;

                        if(player.equals("Singleplayer")){
                            gameId += 54;
                        }
                        if(player.equals("Mixed")){
                            gameId += 55;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 56;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 57;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 58;
                        }
                    }
                }
            }

            if(sub.equals("Third Person")){
                gameId += 59;

                if(type.equals("Adventure")){
                    gameId += 60;

                    if(type_sub.equals("Historical")){
                        gameId += 61;

                        if(player.equals("Singleplayer")){
                            gameId += 62;
                        }
                        if(player.equals("Mixed")){
                            gameId += 63;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 64;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 65;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 66;
                        }
                    }
                    if(type_sub.equals("Modern")){
                        gameId += 67;

                        if(player.equals("Singleplayer")){
                            gameId += 68;
                        }
                        if(player.equals("Mixed")){
                            gameId += 69;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 70;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 71;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 72;
                        }
                    }
                    if(type_sub.equals("Future")){
                        gameId += 73;

                        if(player.equals("Singleplayer")){
                            gameId += 74;
                        }
                        if(player.equals("Mixed")){
                            gameId += 75;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 76;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 77;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 78;
                        }
                    }
                }

                if(type.equals("Linear")){
                    gameId += 79;

                    if(type_sub.equals("Historical")){
                        gameId += 80;

                        if(player.equals("Singleplayer")){
                            gameId += 81;
                        }
                        if(player.equals("Mixed")){
                            gameId += 82;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 83;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 84;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 85;
                        }
                    }
                    if(type_sub.equals("Modern")){
                        gameId += 86;

                        if(player.equals("Singleplayer")){
                            gameId += 87;
                        }
                        if(player.equals("Mixed")){
                            gameId += 88;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 89;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 90;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 91;
                        }
                    }
                    if(type_sub.equals("Future")){
                        gameId += 92;

                        if(player.equals("Singleplayer")){
                            gameId += 93;
                        }
                        if(player.equals("Mixed")){
                            gameId += 94;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 95;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 96;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 97;
                        }
                    }
                }
                if(type.equals("Story telling")){
                    gameId += 98;

                    if(type_sub.equals("Historical")){
                        gameId += 99;

                        if(player.equals("Singleplayer")){
                            gameId += 100;
                        }
                        if(player.equals("Mixed")){
                            gameId += 101;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 102;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 103;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 104;
                        }
                    }
                    if(type_sub.equals("Modern")){
                        gameId += 105;

                        if(player.equals("Singleplayer")){
                            gameId += 106;
                        }
                        if(player.equals("Mixed")){
                            gameId += 107;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 108;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 109;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 110;
                        }
                    }
                    if(type_sub.equals("Future")){
                        gameId += 111;

                        if(player.equals("Singleplayer")){
                            gameId += 112;
                        }
                        if(player.equals("Mixed")){
                            gameId += 113;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 114;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 115;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 116;
                        }
                    }
                }
            }

        }
        if(genre.equals("Role playing")){
            gameId += 117;

            if(sub.equals("Simulation")){
                gameId += 118;

                if(type.equals("Fighting")){
                    gameId += 119;

                    if(type_sub.equals("Ancient")){
                        gameId += 120;

                        if(player.equals("Singleplayer")){
                            gameId += 121;
                        }
                        if(player.equals("Mixed")){
                            gameId += 122;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 123;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 124;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 125;
                        }
                    }
                    if(type_sub.equals("Standard")){
                        gameId += 126;

                        if(player.equals("Singleplayer")){
                            gameId += 127;
                        }
                        if(player.equals("Mixed")){
                            gameId += 128;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 129;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 130;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 131;
                        }
                    }
                    if(type_sub.equals("Futuristic")){
                        gameId += 132;

                        if(player.equals("Singleplayer")){
                            gameId += 133;
                        }
                        if(player.equals("Mixed")){
                            gameId += 134;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 135;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 136;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 137;
                        }
                    }
                }

                if(type.equals("Planing")){
                    gameId += 138;

                    if(type_sub.equals("Ancient")){
                        gameId += 139;

                        if(player.equals("Singleplayer")){
                            gameId += 140;
                        }
                        if(player.equals("Mixed")){
                            gameId += 141;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 142;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 143;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 144;
                        }
                    }
                    if(type_sub.equals("Standard")){
                        gameId += 145;

                        if(player.equals("Singleplayer")){
                            gameId += 146;
                        }
                        if(player.equals("Mixed")){
                            gameId += 147;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 148;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 149;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 150;
                        }
                    }
                    if(type_sub.equals("Futuristic")){
                        gameId += 151;

                        if(player.equals("Singleplayer")){
                            gameId += 152;
                        }
                        if(player.equals("Mixed")){
                            gameId += 153;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 154;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 155;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 156;
                        }
                    }
                }
            }

            if(sub.equals("Open world")){
                gameId += 157;

                if(type.equals("Fighting")){
                    gameId += 158;

                    if(type_sub.equals("Ancient")){
                        gameId += 159;

                        if(player.equals("Singleplayer")){
                            gameId += 160;
                        }
                        if(player.equals("Mixed")){
                            gameId += 161;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 162;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 163;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 164;
                        }
                    }
                    if(type_sub.equals("Standard")){
                        gameId += 165;

                        if(player.equals("Singleplayer")){
                            gameId += 166;
                        }
                        if(player.equals("Mixed")){
                            gameId += 167;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 168;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 169;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 170;
                        }
                    }
                    if(type_sub.equals("Futuristic")){
                        gameId += 171;

                        if(player.equals("Singleplayer")){
                            gameId += 172;
                        }
                        if(player.equals("Mixed")){
                            gameId += 173;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 174;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 175;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 176;
                        }
                    }
                }

                if(type.equals("Planing")){
                    gameId += 177;

                    if(type_sub.equals("Ancient")){
                        gameId += 178;

                        if(player.equals("Singleplayer")){
                            gameId += 179;
                        }
                        if(player.equals("Mixed")){
                            gameId += 180;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 181;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 182;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 183;
                        }
                    }
                    if(type_sub.equals("Standard")){
                        gameId += 184;

                        if(player.equals("Singleplayer")){
                            gameId += 185;
                        }
                        if(player.equals("Mixed")){
                            gameId += 186;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 187;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 188;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 189;
                        }
                    }
                    if(type_sub.equals("Futuristic")){
                        gameId += 190;

                        if(player.equals("Singleplayer")){
                            gameId += 191;
                        }
                        if(player.equals("Mixed")){
                            gameId += 192;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 193;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 194;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 195;
                        }
                    }
                }
            }
        }

        if(genre.equals("Racing")){
            gameId += 196;

            if(sub.equals("Vehicle")){
                gameId += 197;

                if(type.equals("Baby design")){
                    gameId += 198;

                    if(type_sub.equals("null")){
                        gameId += 199;

                        if(player.equals("Singleplayer")){
                            gameId += 200;
                        }
                        if(player.equals("Mixed")){
                            gameId += 201;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 202;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 203;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 204;
                        }
                    }
                }

                if(type.equals("Normal")){
                    gameId += 205;

                    if(type_sub.equals("null")) {
                        gameId += 206;

                        if(player.equals("Singleplayer")){
                            gameId += 207;
                        }
                        if(player.equals("Mixed")){
                            gameId += 208;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 209;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 210;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 211;
                        }
                    }
                }
                if(type.equals("Car maker himself")){
                    gameId += 212;

                    if(type_sub.equals("null")){
                        gameId += 213;

                        if(player.equals("Singleplayer")){
                            gameId += 214;
                        }
                        if(player.equals("Mixed")){
                            gameId += 215;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 216;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 217;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 218;
                        }
                    }
                }
            }
            if(sub.equals("on Foot")){
                gameId += 219;

                if(type.equals("Baby design")){
                    gameId += 220;

                    if(type_sub.equals("null")){
                        gameId += 221;

                        if(player.equals("Singleplayer")){
                            gameId += 222;
                        }
                        if(player.equals("Mixed")){
                            gameId += 223;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 224;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 225;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 226;
                        }
                    }
                }
                if(type.equals("Normal")){
                    gameId += 227;

                    if(type_sub.equals("null")){
                        gameId += 228;

                        if(player.equals("Singleplayer")){
                            gameId += 229;
                        }
                        if(player.equals("Mixed")){
                            gameId += 230;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 231;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 232;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 233;
                        }
                    }
                }
                if(type.equals("Car maker himself")){
                    gameId += 234;

                    if(type_sub.equals("null")){
                        gameId += 235;

                        if(player.equals("Singleplayer")){
                            gameId += 236;
                        }
                        if(player.equals("Mixed")){
                            gameId += 237;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 238;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 239;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 240;
                        }
                    }
                }
            }
        }

        if(genre.equals("Strategy")){
            gameId += 241;

            if(sub.equals("Build and play")){
                gameId += 242;

                if(type.equals("null")){
                    gameId += 243;

                    if(type_sub.equals("History based")){
                        gameId += 244;

                        if(player.equals("Singleplayer")){
                            gameId += 245;
                        }
                        if(player.equals("Mixed")){
                            gameId += 246;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 247;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 248;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 249;
                        }
                    }
                    if(type_sub.equals("Realistic")){
                        gameId += 250;

                        if(player.equals("Singleplayer")){
                            gameId += 251;
                        }
                        if(player.equals("Mixed")){
                            gameId += 252;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 253;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 254;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 255;
                        }
                    }
                    if(type_sub.equals("Unthinkable")){
                        gameId += 256;

                        if(player.equals("Singleplayer")){
                            gameId += 257;
                        }
                        if(player.equals("Mixed")){
                            gameId += 258;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 259;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 260;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 261;
                        }
                    }
                }
            }
            if(sub.equals("Mind game")){
                gameId += 262;

                if(type.equals("null")){
                    gameId += 263;

                    if(type_sub.equals("History based")){
                        gameId += 264;

                        if(player.equals("Singleplayer")){
                            gameId += 265;
                        }
                        if(player.equals("Mixed")){
                            gameId += 266;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 267;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 268;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 269;
                        }
                    }
                    if(type_sub.equals("Realistic")){
                        gameId += 270;

                        if(player.equals("Singleplayer")){
                            gameId += 271;
                        }
                        if(player.equals("Mixed")){
                            gameId += 272;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 273;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 274;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 275;
                        }
                    }
                    if(type_sub.equals("Unthinkable")){
                        gameId += 276;

                        if(player.equals("Singleplayer")){
                            gameId += 277;
                        }
                        if(player.equals("Mixed")){
                            gameId += 278;
                        }
                        if(player.equals("Player vs Player")){
                            gameId += 279;
                        }
                        if(player.equals("Player vs Environment")){
                            gameId += 280;
                        }
                        if(player.equals("Cooperative")){
                            gameId += 281;
                        }
                    }
                }
            }
        }
        return gameId;

    }

    private void createGame(){

    }

    public String displayName( int index ){

        list_games[00] = "";

        list_games[10] = "Call of Juarez: Gunslinger";
        list_games[11] = "Call of Duty: World at War";
        list_games[12] = "Hunt: Showdown";
        list_games[14] = "Minecraft";

        list_games[22] = "Resident Evil 7";
        list_games[23] = "Medal of Honor: Warfighter";
        list_games[24] = "Arma 3";
        list_games[25] = "Operation Flashpoint: Red River";
        list_games[26] = "Garry's Mod";

        list_games[34] = "Sniper Ghost Warrior 3";
        list_games[35] = "Crysis";
        list_games[36] = "Battlefield 2142";
        list_games[38] = "Borderlands 2";

        list_games[66] = "Bioshock Infinite";
        list_games[68] = "Verdun";
        list_games[79] = "DOOM";

        list_games[81] = "Playerunknown's Battleground";
        list_games[82] = "Killing Floor 2";
        list_games[83] = "Keep Talking and Nobody Explodes";

        list_games[92] = "Call of Duty: Infinite Warfare";
        list_games[93] = "Overwatch";

        list_games[124] = "The Elder Scrolls V: Skyrim";
        list_games[125] = "Enemy Front";
        list_games[126] = "BattleField 1";

        list_games[136] = "Farcry 2";
        list_games[137] = "Call of Duty: Modern Warfare";
        list_games[138] = "BattleField 4";

        return list_games[index];

    }
}