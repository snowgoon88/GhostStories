package games.ghoststories.enums;

/**
 * Defines the different game phases to each player turn.
 */
public enum EGamePhase {
   EYinPhase1A("Yin Phase 1A: Ghosts' Actions", 
         "-Update haunter positions<br />-Haunt tiles"),
         
   EYinPhase1B("Yin Phase 1B: Ghosts' Actions",
         "-Roll cursed die and apply effects"),
         
   EYinPhase2("Yin Phase 2: Board Overrun",
         "-Check for board overrun<br />-Lose 1 Qi if all 3 ghost spaces are occupied"),
         
   EYinPhase3("Yin Phase 3: Ghost Arrival",
         "-Draw a ghost card by tapping on the ghost deck<br />-Drag the ghost card from the deck to a valid space on the board"),
         
   EYangPhase1("Yang Phase 1: Move Taoist",
         "-Move taoist by tapping on the tile you wish to move to"),
         
   EYangPhase2("Yang Phase 2: Taoist Action",
         "-Request help from villager by tapping on current village tile OR perform exorcism by tapping on an adjacent ghost"),
         
   EYangPhase3("Yang Phase 3: Place Buddha",
         "-Place Buddha by tapping on an adjacent empty ghost space");

   private EGamePhase(String pPhaseName, String pPhaseText) {
      mPhaseName = pPhaseName;
      mPhaseText = pPhaseText;
   }
   
   public String getName() {
      return mPhaseName;
   }
   
   public String getText() {
      return mPhaseText;
   }
   
   private String mPhaseName;
   private String mPhaseText;
}
