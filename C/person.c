#include "person.h"
#include <stdlib.h>

Person* createPerson(int src, int dest) {
    Person* res= (Person*) malloc(sizeof(Person));
    res->src = src;
    res->dest = dest;
    return res;
};

PersonList* insert(Person *p, PersonList *list) {
    PersonList* res = (PersonList*) malloc(sizeof(PersonList));
    *res->next=*list;
    *res->person=*p;
    return res;
};
