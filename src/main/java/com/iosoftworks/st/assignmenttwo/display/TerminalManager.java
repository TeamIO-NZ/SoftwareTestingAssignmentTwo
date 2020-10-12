package com.iosoftworks.st.assignmenttwo.display;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.graphics.TextImage;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.*;
import java.io.IOException;
import java.util.Random;

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
            graphics.putString(
                    ((size.getColumns() / 2) - ("Dice Black Jack - Press ESC to exit".length() / 2)) - 1,
                    1,
                    "Dice Black Jack - Press ESC to exit",
                    SGR.BOLD
            );
            term.flush();



            KeyStroke stroke = term.readInput();
            while (stroke.getKeyType() != KeyType.Escape && stroke.getKeyType() != KeyType.EOF) {
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
}
