#JAVA

1- Un attribut privé est visible depuis les sous-classes.
    
    Réps : FAUX

2- Quelle annotation peut être utilisée pour s'assurer qu'une interface est fonctionnelle ?

        @Functional 
        @lambda 
    Reps :@FunctionalInterface 
        @abstract
  
3- Quel est le résultat de l'opération 2 >> 1 ?
    
    Réps : 1

4- En Java 8, les interfaces peuvent contenir des méthodes implémentées.
    
    Réps : VRAI

5- Sélectionnez les codes contenant des expressions "switch" valides en Java12+.

    Réps 1 :
        int state = switch (month) {
            case JANUARY  -> 0;
            case FEBRUARY -> 1;
            case MARCH    -> 2;
            default       -> {
                int l = logic(month);
                l *= 9;
                yield l;
            } 
        }

    Réps 2 :
        int number = switch (state) {
            case "UP":
                yield 5;
            case "DOWN":
                yield 7;
            default:
                System.out.println("Illegal state");
                yield -1;
        };

    FALSE ANSWER :
    int number = switch (state) {
        case "UP":
            break 5;
        case "DOWN":
            break 7;
        default:
            System.out.println("Illegal state");
            break -1;
    };

    int state = switch (month) {
        case JANUARY  -> 0;
        case FEBRUARY -> 1;
        case MARCH    -> 2;
        default       -> {
            int l = logic(month);
            l *= 9;
            return l;
        } 
    };

    int number = switch (state) {
        case "UP":
            return 5;
        case "DOWN":
            return 7;
        default:
            System.out.println("Illegal state");
            return -1;
        };
    
6- Quel est le nom de la méthode de la classe java.lang.String qui permet de tester si une chaîne de caractères est vide 
ou ne contient que des caractères d'espacement?

    Reps :
    String.isBlank() 
    .*isBlank.*

7- Le garbage collector garanti qu'il y a suffisamment de mémoire pour exécuter un programme Java.
    
    Reps :
    FAUX

8- 