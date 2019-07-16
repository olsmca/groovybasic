public class PostJava {

        int userId;

        public PostJava(int userId, int id, String title, String completed) {
                this.userId = userId;
                this.id = id;
                this.title = title;
                this.completed = completed;
        }

        int id;
        String title;
        String completed;

        @Override
        public String toString() {
            return new StringBuilder().append( "UserID: ").append(this.userId)
                    .append(" Id: ").append(this.id)
                    .append(" Title: ").append(this.title)
                    .append(" body: ").append(this.completed).toString();
        }

        public int getUserId() {
                return userId;
        }

        public void setUserId(int userId) {
                this.userId = userId;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getCompleted() {
                return completed;
        }

        public void setCompleted(String completed) {
                this.completed = completed;
        }
}
