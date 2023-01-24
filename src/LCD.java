public class LCD {

    public static void clearScreen() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }

    public static void showloginMenu() {
        clearScreen();
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║            Welcome to the website          ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ 1) Homepage                                ║");
        System.out.println("║ 2) Menu                                    ║");
        System.out.println("║ 3) Quit                                    ║");
        System.out.println("║                                            ║");
        System.out.println("║ Please enter a number (1-3):               ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    public static void showHomepageMenu() {
        clearScreen();
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║                         Homepage                            ║");
        System.out.println("╠═════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                             ║");
        System.out.println("║A game is a structured form of play, usually undertaken for  ║");
        System.out.println("║entertainment or fun, and sometimes used as an educational   ║");
        System.out.println("║tool. Games are distinct from work, which is usually carried ║");
        System.out.println("║out for remuneration, and from art, which is more often an   ║");
        System.out.println("║expression of aesthetic or ideological elements. However,    ║");
        System.out.println("║the distinction is not clear-cut, and many games are also    ║");
        System.out.println("║considered to be work (such as professional players of       ║");
        System.out.println("║spectator sports or games) or art (such as jigsaw puzzles or ║");
        System.out.println("║games involving an artistic layout such as Mahjong, solitaire║");
        System.out.println("║, or some video games).                                      ║");
        System.out.println("║                                                             ║");
        System.out.println("║ Enter 1 to go back to first page.                           ║");
        System.out.println("║                                                             ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
    }

    public static void showSystemMenu() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║                   menu                     ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ 1 = Go back                                ║");
        System.out.println("║ 2 = Search                                 ║");
        System.out.println("║ 3 = Homepage                               ║");
        System.out.println("║ 4 = Bomb It                                ║");
        System.out.println("║ 5 = Pong games                             ║");
        System.out.println("║ Please enter a number (0-3):               ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    public static void showSearchMenu() {
        clearScreen();
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║  Enter 1 to go back to menu.                                ║");
        System.out.println("╠═════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                             ║");
        System.out.println("║ Search:                                                     ║");
        System.out.println("║                                                             ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
    }

    public static void showBombItMenu() {
        clearScreen();
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║ Bomb It!                                                    ║");
        System.out.println("║ Enter 1 to go back to menu.                                 ║");
        System.out.println("╠═════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                             ║");
        System.out.println("║ Player 1 press ASDW button = control walking direction,     ║");
        System.out.println("║ Spacebar button = drop bomb.                                ║");
        System.out.println("║ Player 2 presses arrow keys = directs direction, presses    ║");
        System.out.println("║ enter = drop bomb.                                          ║");
        System.out.println("║                                                             ║");
        System.out.println("║ Let play the game:                                          ║");
        System.out.println("║                                                             ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
    }
    public static void showPongMenu() {
        clearScreen();
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║ Pong games!                                                 ║");
        System.out.println("║ Enter 1 to go back to menu.                                 ║");
        System.out.println("╠═════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                             ║");
        System.out.println("║ Player 1 press SW button = control up and down              ║");
        System.out.println("║ Player 2 presses arrow keys = control up and down           ║");
        System.out.println("║                                                             ║");
        System.out.println("║ Let play the game:                                          ║");
        System.out.println("║                                                             ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
    }
    public static void showQuitMenu() {
        clearScreen();
        System.out.println("╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║                        ☺Good Luck☺                         ║");
        System.out.println("╠═════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                             ║");
        System.out.println("║ Let play together again.                                    ║");
        System.out.println("║                                                             ║");
        System.out.println("╚═════════════════════════════════════════════════════════════╝");
    }
}
