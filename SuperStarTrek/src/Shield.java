public class Shield {

      private boolean status = false;
      
      public void raise() {
            
            status = true;
      }

      public boolean isUp() {
            
            return status;
      }

      public void lower() {
            status = false;
            
      }

}

