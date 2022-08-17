package com.FirstSpringProject.RestApi.BookData;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Book implements Serializable{

		@Id
		private long b_Id;
		private String b_Name;
		private String b_Author;
		private String b_Subject;
		
		
		public Book(long b_Id, String b_Name, String b_Author, String b_Subject) {
			super();
			this.b_Id = b_Id;
			this.b_Name = b_Name;
			this.b_Author = b_Author;
			this.b_Subject = b_Subject;
		}


		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}


		public long getB_Id() {
			return b_Id;
		}


		public void setB_Id(long b_Id) {
			this.b_Id = b_Id;
		}


		public String getB_Name() {
			return b_Name;
		}


		public void setB_Name(String b_Name) {
			this.b_Name = b_Name;
		}


		public String getB_Author() {
			return b_Author;
		}


		public void setB_Author(String b_Author) {
			this.b_Author = b_Author;
		}


		public String getB_Subject() {
			return b_Subject;
		}


		public void setB_Subject(String b_Subject) {
			this.b_Subject = b_Subject;
		}


		@Override
		public String toString() {
			return "Book [b_Id=" + b_Id + ", b_Name=" + b_Name + ", b_Author=" + b_Author + ", b_Subject=" + b_Subject
					+ "]";
		}
		
		
		
}
