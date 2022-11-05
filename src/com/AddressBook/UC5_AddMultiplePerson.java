package com.AddressBook;

public class UC5_AddMultiplePerson extends UC4_DeleteContact
{
    public void MultiplePerson()
    {
        while(true) {
            System.out.println("Select Choice \n1)Add Person\n2)Edit Person\n3)Delete Person\n4)Exit");
            int c = scanner.nextInt();


            switch (c) {
                case 1:
                    AddPerson();
                    break;
                case 2:
                    EditPerson();
                    break;
                case 3:
                    DeletePerson();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Incorrect option");
            }
            if(c==4){
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        UC5_AddMultiplePerson obj = new UC5_AddMultiplePerson();
        obj.MultiplePerson();
    }

}
