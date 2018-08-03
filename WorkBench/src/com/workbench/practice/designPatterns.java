package com.workbench.practice;



	/*
	 * public static void main(String[] args){
	 * 
	 * Hello h=Hello.getHello(); System.out.println(h);
	 * System.out.println(Hello.getHello());
	 * System.out.println(Hello.getHello()); //h.clone(); } }
	 * 
	 * class Hello{ private static Hello INS= new Hello(); private Hello(){}
	 * public static Hello getHello(){ return INS;
	 * 
	 * } } ------------------------------------------------ 
	 * Hello h=Hello.getHello(); System.out.println(h);
	 * System.out.println(Hello.getHello());
	 * System.out.println(Hello.getHello()); }
	 * 
	 * class Hello{ private static Hello INS=null; static{ INS=new Hello(); }
	 * private Hello(){} public static Hello getHello(){ return INS; } }}
	 * 
	 * 
	 * ================================================ 
	 * Hello h=Hello.getHello(); System.out.println(h);
	 * System.out.println(Hello.getHello());
	 * System.out.println(Hello.getHello());
	 * 
	 * }
	 * 
	 * class Hello { private static Hello INS = null; private Hello() {}
	 * 
	 * public static Hello getHello() { if (INS==null) INS=new Hello(); return
	 * INS; } } }
	 * 
	 * 
	 */

	class BusTravel {
		String passengerName;
		String origin;
		String destination;

		public boolean confirmTravel() {
			if (this.passengerName != null && this.origin != null && this.destination != null) {
				// DB query here to check seats availability and if it return
				// true
				System.out.println("Passenger choose Bus Travel");
				return true;
			} else {
				// DB query here to check seats availability and if it return
				// false
				return false;
			}
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getOrigin() {
			return origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}

		public String toString() {
			return "BusObject";
		}
	}

	class TrainTravel {
		String passengerName;
		String origin;
		String destination;

		public boolean confirmTravel() {
			if (this.passengerName != null && this.origin != null && this.destination != null) {
				// DB query here to check seats availability and if it return
				// true
				System.out.println("Passenger choose Train Travel");
				return true;
			} else {
				// DB query here to check seats availability and if it return
				// false
				return false;
			}
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getOrigin() {
			return origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}

		public String toString() {
			return "TrainObject";
		}

	}

	class GetObject {
		public Object getMyTravelObject(String travelType) {
			Object travelObject = null;
			if ("Bus".equalsIgnoreCase(travelType)) {
				System.out.println("travel type:" + travelType);
				travelObject = new BusTravel();
			} else if ("Train".equalsIgnoreCase(travelType)) {
				System.out.println("travel type:" + travelType);
				travelObject = new TrainTravel();
			}
			return travelObject;
		}
	}

	class designPatterns {
		 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  GetObject getObject = new GetObject();
		  Object travelType = getObject.getMyTravelObject(args[0]);
		  System.out.println("Travel request type :"+args[0]);
		  
		  
		  if(travelType instanceof BusTravel){
		   System.out.println("Yes Bus object instatiated");
		  }else if(travelType instanceof TrainTravel){
		   System.out.println("Yes Train object instatiated");
		  }else{
		   System.out.println("Pass the travel parameter correctly");
		  }
		 }


		}
