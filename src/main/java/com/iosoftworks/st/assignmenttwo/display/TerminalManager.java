package com.iosoftworks.st.assignmenttwo.display;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.iosoftworks.st.assignmenttwo.GameManager;

import java.io.IOException;

public class TerminalManager {

    public static void main(String... args) {
        new TerminalManager();
    }

    public TerminalManager() {
        DefaultTerminalFactory factory = new DefaultTerminalFactory();

        Terminal term = null;
        try {
            term = factory.createTerminal();

            term.enterPrivateMode();
            term.setCursorVisible(false);
            term.clearScreen();
            drawOutline(term);
            drawPlayers(term);
            boolean playerTurn = false;
            drawTurnIndicator(term, playerTurn);

            boolean finalPlayerTurn = playerTurn;
            term.addResizeListener((terminal, newSize) -> {
                try {
                    terminal.clearScreen();
                    drawOutline(terminal);
                    drawPlayers(terminal);
                    drawTurnIndicator(terminal, finalPlayerTurn);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            KeyStroke stroke = term.readInput();
            while (stroke.getKeyType() != KeyType.Escape && stroke.getKeyType() != KeyType.EOF) {
                if (stroke.getCharacter() == ' ') {
                    playerTurn = !playerTurn;
                    drawTurnIndicator(term, playerTurn);
                }

                stroke = term.readInput();
            }

            term.exitPrivateMode();
            term.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (term != null) {
                try {
                    term.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void drawOutline(Terminal term) throws IOException {
        TextGraphics graphics = term.newTextGraphics();
        TerminalPosition pos = term.getCursorPosition();
        TerminalSize size = term.getTerminalSize();
        graphics.drawLine(
                pos.withRelativeColumn(1),
                pos.withRelativeColumn(size.getColumns() - 2),
                Symbols.DOUBLE_LINE_HORIZONTAL);
        graphics.drawLine(
                pos.withRelative(1, size.getRows() - 1),
                pos.withRelative(size.getColumns() - 2, size.getRows() - 1),
                Symbols.DOUBLE_LINE_HORIZONTAL);
        graphics.drawLine(
                pos.withRelative(0, 1),
                pos.withRelative(0, size.getRows() - 2),
                Symbols.DOUBLE_LINE_VERTICAL);
        graphics.drawLine(
                pos.withRelative(size.getColumns() - 1, 1),
                pos.withRelative(size.getColumns() - 1, size.getRows() - 2),
                Symbols.DOUBLE_LINE_VERTICAL);
        graphics.putString(
                0,
                0,
                String.valueOf(Symbols.DOUBLE_LINE_TOP_LEFT_CORNER));
        graphics.putString(
                size.getColumns() - 1,
                0,
                String.valueOf(Symbols.DOUBLE_LINE_TOP_RIGHT_CORNER));
        graphics.putString(
                0,
                size.getRows() - 1,
                String.valueOf(Symbols.DOUBLE_LINE_BOTTOM_LEFT_CORNER));
        graphics.putString(
                size.getColumns() - 1,
                size.getRows() - 1,
                String.valueOf(Symbols.DOUBLE_LINE_BOTTOM_RIGHT_CORNER));
        String title = "Dice Black Jack - Press ESC to exit";
        graphics.putString(((size.getColumns() / 2) - (title.length() / 2)) - 3, 0, "\u2561 ");
        graphics.putString(((size.getColumns() / 2) + (title.length() / 2)) - 1, 0, " \u255e");
        graphics.putString(
                ((size.getColumns() / 2) - (title.length() / 2)) - 1,
                0,
                title,
                SGR.BOLD);

        term.flush();
    }

    private void drawPlayers(Terminal term) throws IOException {
        TextGraphics graphics = term.newTextGraphics();
        TerminalSize size = term.getTerminalSize();
        graphics.putString(2, 5, "You", SGR.BOLD);
        graphics.putString(size.getColumns() - 4, 5, "AI", SGR.BOLD);

        term.flush();
    }

    private void drawTurnIndicator(Terminal term, boolean playerTurn) throws IOException {
        TerminalSize size = term.getTerminalSize();
        TextGraphics graphics = term.newTextGraphics();

        graphics.putString(6, 5, playerTurn ? String.valueOf(Symbols.ARROW_LEFT) : " ", SGR.BOLD);
        graphics.putString(size.getColumns() - 7, 5, playerTurn ? " " : String.valueOf(Symbols.ARROW_RIGHT), SGR.BOLD);

        term.flush();
    }
}
