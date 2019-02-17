package com.company;

public class background_data {

        public String message;
        public int hits;

        public background_data(String message, int hits) {
            this.message = message;
            this.hits = hits;
        }


        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getHits() {
            return hits;
        }

        public void setHits(int hits) {
            this.hits = hits;
        }
}
