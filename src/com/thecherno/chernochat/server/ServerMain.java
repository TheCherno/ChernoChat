package com.thecherno.chernochat.server;

public class ServerMain {

	private int port;

	public ServerMain(int port) {
		this.port = port;
		System.out.println(port);
	}

	public static void main(String[] args) {
		int port;
		if (args.length != 1) {
			System.out.println("Usage: java -jar ChernoChatServer.jar [port]");
			return;
		}
		port = Integer.parseInt(args[0]);
		new ServerMain(port);

	}

}
