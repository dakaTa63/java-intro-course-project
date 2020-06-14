public class gameField {

    public static void gameFieldBoard() {
        /**
         *  Метод който принтира цялото игрово поле.
         *
         */
        int rows = 4;
        int columns = 8;

        String[][] board = new String[rows][columns];
        int counter = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = String.valueOf(counter) + "  ";
                counter++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("1  ")) {
                    System.out.print("Chance ");
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("2  ")) {
                    System.out.print("Invest ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("3  ")) {
                    System.out.print("TRAP ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("4  ")) {
                    System.out.print("$party heard ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("5  ")) {
                    System.out.print("S͟t͟e͟a͟l͟ ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("6  ")) {
                    System.out.print("TRAP ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("7  ")) {
                    System.out.print("$party_hard ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("8  ")) {
                    System.out.println("Chance ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("9  ")) {
                    System.out.print("TRAP ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("10  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("11  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("12  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("13  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("14  ")) {
                    System.out.print("                                             ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("15  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("16  ")) {
                    System.out.println("Invest ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("17  ")) {
                    System.out.print("S͟t͟e͟a͟l ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("18  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("19  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("20  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("21  ")) {
                    System.out.print("                                             ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("22  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("23  ")) {
                    System.out.print(" ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("24  ")) {
                    System.out.println("S͟t͟e͟a͟l ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("25  ")) {
                    System.out.print("     Chance ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("26  ")) {
                    System.out.print("TRAP ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("27  ")) {
                    System.out.print("$party_hard ");
                }
                ;
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("28  ")) {
                    System.out.print("Invest ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("29  ")) {
                    System.out.print("TRAP ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("30  ")) {
                    System.out.print("TRAP ");
                }
                ;
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("31  ")) {
                    System.out.print("TRAP ");
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].equals("32  ")) {
                    System.out.print("START ");
                }
            }
        }
        System.out.println();
    }
}

