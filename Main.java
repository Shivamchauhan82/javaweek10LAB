public class Main {
    public static void main(String[] args) {
        APIUtility apiUtility = new APIUtility();
        String jsonResponse = apiUtility.callAPIAndGetResponse();

        // Use a library like Gson to parse the JSON response
        // For this example, let's assume you have a method for parsing JSON
        Book book = parseJsonToBook(jsonResponse);

        // Now you can work with the 'book' object
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
    }

    public static Book parseJsonToBook(String json) {
        // Implement the code to parse JSON and create a Book object
        // Use a library like Gson for JSON parsing
    }
}
