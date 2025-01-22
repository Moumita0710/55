package myPack;

public class EmpPojo {

		String id;
		String name;
		String password;
		String email;
		String country;
//		EmpPojo(String id,String name,String password,String email,String country){
//			this.id=id;
//			this.name=name;
//			this.password=password;
//			this.email=email;
//			this.country=country;
//			}
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "Emp_Pojo [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", country="
					+ country + "]";
		}
			
		}

