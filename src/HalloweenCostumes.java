
public class HalloweenCostumes implements Comparable<HalloweenCostumes>{
	
		private String CostumeName;
		private double CostumeCost;
		private int WantFactor;
		private int CoolnessScore = 1;
		
		public HalloweenCostumes() {
			this.CostumeName = "Super_Awesome_Costume";
			this.CostumeCost = 39.99;
			this.WantFactor = 3;
		}
		
		public HalloweenCostumes(String name) {
			this.CostumeName = name;
			this.CostumeCost = 39.99;
			this.WantFactor = 3;
		}
		
		public HalloweenCostumes(String name, double cost) {
			this.CostumeName = name;
			this.CostumeCost = cost;
			this.WantFactor = 3;
		}
		
		public HalloweenCostumes(String name, int want) {
			this.CostumeName = name;
			this.WantFactor = want;
			this.CostumeCost = 39.99;
		}
		
		public HalloweenCostumes(String name, double cost, int want) {
			this.CostumeName = name;
			this.CostumeCost = cost;
			this.WantFactor = want;
		}
		
		public HalloweenCostumes(double cost) {
			this.CostumeCost = cost;
			this.CostumeName = "Super_Awesome_Costume";
			this.WantFactor = 3;
		}
		
		public HalloweenCostumes(double cost, int want) {
			this.CostumeCost = cost;
			this.WantFactor = want;
			this.CostumeName = "Super_Awesome_Costume";
			
		}
		
		public HalloweenCostumes(int want) {
			this.WantFactor = want;
			this.CostumeCost = 39.99;
			this.CostumeName = "Super_Awesome_Costume";
		}
		
		public void CalcCoolness() { 
			this.CoolnessScore = Math.round((int)(this.CostumeName.length() * this.WantFactor / this.CostumeCost));
			
		}
		
		public String getName() {
			return this.CostumeName;
		}
		
		public double getCost() {
			return this.CostumeCost;
		}
		
		public int getWant() {
			return this.WantFactor;
		}
		
		public int getCoolness() {
			return this.CoolnessScore;
		}
		
	

	@Override
	public int compareTo(HalloweenCostumes o) {
	  if(this.CoolnessScore - o.CoolnessScore > 0) {
		  return -1;
	  }
	  
	  if(this.CoolnessScore - o.CoolnessScore < 0) {
		  return 1;
	  }
	  
	  if(this.CoolnessScore - o.CoolnessScore == 0) {
		  return this.CostumeName.compareTo(o.CostumeName);
	  }
	  return 0;
		
	}

}
