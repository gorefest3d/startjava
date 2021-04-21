public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 35;
        boolean isMale = true;
        float height = 1.85F;
        char firstNameChar = 'M';

        if(age > 20) {
            System.out.println("Вам можно продавать алкоголь");
        }

        if(isMale) {
            System.out.println("Дверь туалетной кабинки с литерой М");
        }

        if(!isMale) {
            System.out.println("Дверь туалетной кабинки с литерой Ж");
        }

        if(height < 1.80) {
            System.out.println("Ростом не вышли!");
        } else {
            System.out.println("Ну и каланча!!");
        }

        if(firstNameChar == 'M') {
            System.out.println("Имя как дверь туалетной кабинки с литерой М");
        } else if(firstNameChar == 'I') {
            System.out.println("Имя на I ??");
        } else {
            System.out.println("Не могу угадать имя");
        }
    }
}