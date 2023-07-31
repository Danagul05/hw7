public  abstract class  Hero implements HavingSuperAbility {
     private int health;
     private  int damage;
     private String TypeSuperAbility;

     public int getDamage() {
          return damage;
     }

     public int getHealth() {
          return health;
     }

     public void setDamage(int damage) {
          this.damage = damage;
     }

     public void setHealth(int health) {
          this.health = health;
     }

     public void setTypeSuperAbility(String typeSuperAbility) {
          TypeSuperAbility = typeSuperAbility;
     }

     public String getTypeSuperAbility() {
          return TypeSuperAbility;
     }
}
