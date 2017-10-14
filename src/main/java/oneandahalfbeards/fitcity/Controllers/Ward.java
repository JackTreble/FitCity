package oneandahalfbeards.fitcity.Controllers;

public class Ward {
        private final long id;
        private final String content;

        public Ward(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return content;
        }
}
