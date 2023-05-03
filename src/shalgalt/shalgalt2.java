package shalgalt;

public class shalgalt2 {

	public static void main(String[] args) {
		 public NewThreadDemo() {

             super(“хэрэглэгчийг тодорхойлолт Thread”);

             System.out.println(“хэрэглэгчийг тодорхойлсон хэлхээ“ + this);

             start();

        }

        public void run() {

                 try {

                       for(int i = 1; i <=10; i++) {

                            System.out.println(“хэрэглэгчийг тодорхойлолт хүүхэд Thread: “ + i);

                            Thread.sleep(500);

                          }

                   }

                  catch (InterruptedException e) {

                        System.out.println(“хэрэглэгчийг тодорхойлолт хүүхэд interrupted.”);

                  }

                        System.out.println(“Exiting UserDeinfed cthread.”);

            }

}

class ThreadDemo {

   public static void main(String args[]) {

       new NewThreadDemo();

       try {

            for(int i = 1; i <10; i++) {

                System.out.println(“Main Thread: “ + i);

                Thread.sleep(500);

            }

        }

           catch (InterruptedException e) {

                 System.out.println(“Main thread interrupted.”);

           }

                 System.out.println(“Main thread exiting.”);

      }

}



	}

}
