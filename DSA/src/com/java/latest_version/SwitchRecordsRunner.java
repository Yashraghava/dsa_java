package com.java.latest_version;

public class SwitchRecordsRunner {

	sealed interface CustomerMessage permits Message,Feedback {
	}

	record Message(String text) implements CustomerMessage {
	}

	record Feedback(int rating, String description) implements CustomerMessage {
	}
	
	record SupportRequest(String name,CustomerMessage customerMessage) {}

	public static void main(String[] args) {

		CustomerMessage customerMessage = new Message("Hello World!");
		CustomerMessage customerMessage2 = new Feedback(1, "Good Luck!");
		String response = switch (customerMessage2) {
		case Message(String text) -> text;
		case Feedback(int rating, String description) -> description;
//		default  -> "Default Response";
		};
		System.out.println("Response ->" + response);
		SupportRequest supportRequest = new SupportRequest("Rahul", new Feedback(5, "Really Good!"));
		String responseMessage = switch (supportRequest) {
		case SupportRequest(String name, Message message) -> "message";
		case SupportRequest(String name, Feedback feedback) -> "feedback";
		};
		String responseMessage2 = switch (supportRequest) {
		case SupportRequest(String name, Message (String text)) -> text;
		case SupportRequest(String name, Feedback (int rating, String description)) -> description;
		};
		System.out.println("responseMessage ->" + responseMessage);
		System.out.println("responseMessage2 ->" + responseMessage2);
	}
}
