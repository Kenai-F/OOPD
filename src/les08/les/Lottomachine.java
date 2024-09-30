package les08.les;

public class Lottomachine {
    public void voertrekkingUit() {
        Glazenbol glazenbol = new Glazenbol();
        Scorebord scorebord = new Scorebord();

        glazenbol.verzamelAlleBallen();

        for(int i = 0; i < 6; i++){
            scorebord.plaatsBal(glazenbol.schepBal());
        }

        scorebord.plaatsBonusBal(glazenbol.schepBal());

        scorebord.sorteerBallen();
        scorebord.printScorebord();
    }
}
