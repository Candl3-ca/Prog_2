

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Daniel lee", "DL@gmail.com", 'M');

        System.out.println(author.toSring());

        author.setEmail("LD@gmail.com");

        System.out.println(author.toSring());

        Book book = new Book("Java for dummies", author, 19.95, 99);

        System.out.println(book.toString());
        
        Book anotherBook = new Book("More Java for dummies", new Author("Pepega champ", "whomegalol@yahoo.ca", 'M'), 29.95, 8);

        System.out.println(anotherBook.toString());

    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toSring() {
        return "Author [ name= " + name + ",email= " + email + ",gender= " + gender;
    }

}


        class Book {
            private String name;
            private Author author;
            private double price;

            private int qty;

            public Book(String name, Author author, double price, int qty) {
                this.name = name;
                this.author = author;
                this.price = price;
                this.qty = qty;
            }

            public String getName() {
                return name;
            }

            public Author getAuthor() {
                return author;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public int getQty() {
                return qty;
            }

            public void setQty(int qty) {
                this.qty = qty;
            }

            public String toString() {
                return "Book [ name= " + name + ",author= " + author.getName() + ",price= " + price + ",qty= " + qty + "]";
            }
        }

