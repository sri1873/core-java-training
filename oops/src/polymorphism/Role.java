package polymorphism;

class Role {
	private String role;

	Role(String role) {
		this.role = role;
		System.out.println("Role:" + this.role);
	}

	void Permissions() {
		System.out.println("Invalid User");
		System.out.println("No Permissions given");
	}
}

class Admin extends Role {
	Admin() {
		super("ADMIN");
	}

	void Permissions() {
		System.out.println("User Management | Inventory Management | Order Management");
	}
}

class Customer extends Role {
	Customer() {
		super("CUSTOMER");
	}

	void Permissions() {
		System.out.println("Order Management");
	}
}
