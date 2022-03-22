package com.ProShark;

public class Car implements VehicalFactory {


		private Engine engien;
		private String color;
		
		
		
		public Engine getEngien() {
			return engien;
		}

		public void setEngien(Engine engien) {
			this.engien = engien;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public void BuildEngien(Engine engien) {
			this.engien=engien;
			
		}

		@Override
		public void color(String color) {
			this.color=color;
				
			
		}

		@Override
		public String toString() {
			return "Car [engien=" + engien + ", color=" + color + "]";
		}

		
		





		
		
		
	}
