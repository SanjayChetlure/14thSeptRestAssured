package P7_Serialization_And_DeSerialization;

import java.util.ArrayList;

public class StudentsPojo 
{
		private String id;
		private String name;
		private String location;
		private String phone;
		private String [] courses;
		
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String[] getCourses() {
			return courses;
		}
		public void setCourses(String[] courses) {
			this.courses = courses;
		}
	

}
