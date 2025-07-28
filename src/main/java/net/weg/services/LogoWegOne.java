package net.weg.services;

public class LogoWegOne {

    public void getLogoWegOne() {
        String logoPrincipal = ("""
                \u001B[34m
                888       888                    .d88888b.                    \s
                888   o   888                   d88P" "Y88b                   \s
                888  d8b  888                   888     888                   \s
                888 d888b 888  .d88b.   .d88b.  888     888 88888b.  \u001B[0m\u001B[36m .d88b.  \s
                \u001B[0m\u001B[34m888d88888b888 d8P  Y8b d88P"88b 888     888 888 "88b \u001B[0m\u001B[36md8P  Y8b \s
                \u001B[0m\u001B[34m88888P Y88888 88888888 888  888 888     888 888  888 \u001B[0m\u001B[36m88888888 \s
                \u001B[0m\u001B[34m8888P   Y8888 Y8b.     Y88b 888 Y88b. .d88P 888  888 \u001B[0m\u001B[36mY8b.     \s
                \u001B[0m\u001B[34m888P     Y888  "Y8888   "Y88888  "Y88888P"  888  888  \u001B[0m\u001B[36m"Y8888  \s
                \u001B[0m\u001B[34m                            888                               \s
                                       Y8b d88P                               \s
                                        "Y88P"                                \s
                                                                       \u001B[0m
                """);

        // Sim, isso está confuso, mas é assim que o logo é exibido, os códigos ANSI colorem o texto e resetam a cor no final, pensei nisso para fazer o 'e' ciano.

        System.out.print("\n" + logoPrincipal);
        System.out.print("\n-------------------------------\n");
    }
}
