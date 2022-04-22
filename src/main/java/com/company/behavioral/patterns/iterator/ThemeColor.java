package com.company.behavioral.patterns.iterator;

// This enum represents the aggregate from iterator pattern.
public enum ThemeColor {
    RED,
    ORANGE,
    BLACK,
    WHITE;

    public static Iterator<ThemeColor> getIterator(){
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<ThemeColor> {

        private int position;

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }

        @Override
        public boolean hasNext() {
            return (position < ThemeColor.values().length);
        }
    }
}
