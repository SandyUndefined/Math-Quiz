package sandy.game.mathquiz.utils;
import java.io.Serializable;


public class Constant  implements Serializable{

    //please change publisher id in androidmanifest

    public static final boolean show_admob_banner=true ; // show AdMob Smart banner
    public static final boolean show_admob_interstitial = true; // show AdMob Interstitial
    public static final String adMob_key_banner = "ca-app-pub-4279390018890538/6640315374";
    public static final String adMob_key_interstitial = "ca-app-pub-4279390018890538/4873606438";

    public static Boolean show_banner_ad = true; // show reward video
    public static String rewarded_ad_id="ca-app-pub-4279390018890538/3140069979";
    public static final int reward_time_inseconds=10;//set seconds to win after watching the reward video


    public static final int time_inseconds=60;
    public static final int questions_number = 21;
    public static final int max__number_value = 11;



}
