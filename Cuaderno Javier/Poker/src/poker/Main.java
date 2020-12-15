/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author Javi
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Card card = new Card(Card.Suit.CLUB, Card.Rank.ACE);
        LOGGER.info("As de tréboles: {}", card);
    }
    
}
