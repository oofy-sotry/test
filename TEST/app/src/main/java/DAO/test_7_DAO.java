package DAO;

import DTO.test_7_DTO;
import javax.servlet.http.HttpSession;

public class test_7_DAO {
    private static final String GAME_MODEL_KEY = "gameModel";

    public test_7_DTO getGameModel(HttpSession session) {
        test_7_DTO gameModel = (test_7_DTO) session.getAttribute(GAME_MODEL_KEY);
        if (gameModel == null) {
            gameModel = new test_7_DTO();
            session.setAttribute(GAME_MODEL_KEY, gameModel);
        }
        return gameModel;
    }

    public void updateGameModel(HttpSession session, test_7_DTO gameModel) {
        session.setAttribute(GAME_MODEL_KEY, gameModel);
    }
}
