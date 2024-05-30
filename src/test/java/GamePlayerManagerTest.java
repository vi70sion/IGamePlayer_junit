import org.example.GamePlayerManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GamePlayerManagerTest {

    static GamePlayerManager manager;
    @BeforeEach
    public void setUp(){
        manager = new GamePlayerManager();
    }

    @Test
    void registerPlayerAndGetPlayerNameByID(){
        //Setup
        String playerId = "1";
        String playerName = "Player1";
        //Execute
        manager.registerPlayer(playerId, playerName);
        //Assert
        assertEquals(playerName, manager.getPlayerDetails(playerId));
    }

    @Test
    public void getPlayerDetailsGetNameByPlayerId(){
        //Setup
        String playerId = "1";
        String playerName = "Player1";
        String expName = "Player1";
        //Execute
        manager.registerPlayer(playerId, playerName);
        String actName = manager.getPlayerDetails(playerId);
        //Assert
        assertEquals(expName, actName);
    }

    @Test
    public void getPlayerDetailsGetNameByPlayerIdNotFoundReturnNull(){
        //Setup
        String playerId = "1";
        String playerName = "Player1";
        String searchID = "99";
        String expName = null;
        //Execute
        manager.registerPlayer(playerId, playerName);
        String actName = manager.getPlayerDetails(searchID);
        //Assert
        assertEquals(expName, actName);
    }

    //void updatePlayerScore(String playerId, int scoreToAdd);
    @Test
    public void updatePlayerScoreWith100PointsGetCheckLevelUpTrue(){
        //Setup
        String playerId = "1";
        int scoreAdd = 100;
        boolean expBool = true;
        //Execute
        manager.updatePlayerScore(playerId, scoreAdd);
        boolean actBool = manager.checkLevelUp(playerId);
        //Assert
        assertEquals(expBool, actBool);
    }

    //boolean checkLevelUp(String playerId);
    @Test
    public void checkLevelUpIfScoreMoreThan100orEqualReturnTrue(){
        //Setup
        String playerId = "1";
        int scoreAdd = 100;
        boolean expBool = true;
        //Execute
        manager.updatePlayerScore(playerId, scoreAdd);
        //Assert
        assertEquals(expBool, manager.checkLevelUp(playerId));
    }

    @Test
    public void deletePlayer_DeleteExistingPlayerAndGetTrue(){
        //Setup
        String playerId = "1";
        String playerName = "Player1";
        boolean expBool = true;
        //Execute
        manager.registerPlayer(playerId, playerName);
        boolean actBool = manager.deletePlayer(playerId);
        //Assert
        assertEquals(expBool, actBool);
    }

    @Test
    public void deletePlayer_DeleteNonExistingPlayerAndGetFalse(){
        //Setup
        String playerId = "1";
        String playerName = "Player1";
        String searchID = "99";
        boolean expBool = false;
        //Execute
        manager.registerPlayer(playerId, playerName);
        boolean actBool = manager.deletePlayer(searchID);
        //Assert
        assertEquals(expBool, actBool);
    }

}
