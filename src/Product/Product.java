package Product;
import java.io.Serializable;
    public class Product implements Serializable {
        private String id;
        private String name;
        private String price;
        private String amount;
        private String describe;

        public Product() {
        }

        public Product(String id, String name, String price, String amount, String describe) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.amount = amount;
            this.describe = describe;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", amount=" + amount +
                    ", describe='" + describe + '\'' +
                    '}';
        }
        public String towrite() {
            return  id +
                    "," + name +
                    "," + price +
                    ", " + amount +
                    "," + describe  +
                    '}';
        }

    }

