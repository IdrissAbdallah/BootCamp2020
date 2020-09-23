#include "person.h"
#include "elevator.h"
#include <stddef.h>
#include <stdlib.h>

Elevator *create_elevator(int capacity, int currentFloor, PersonList *persons){
    Elevator* res= (Elevator*) malloc(sizeof(Elevator));
    res->capacity = capacity;
    res->currentFloor=currentFloor;
    res->persons=persons;
    return res;
}

Building *create_building(int nbFloor, Elevator *elevator, PersonList **waitingLists){
    Building* res= (Building*) malloc(sizeof(Building));
    res-> nbFloor=nbFloor;
    res->elevator=elevator;
    res->waitingLists=waitingLists;
    return res;
}

PersonList* exitElevator(Elevator *e){
    PersonList* personsSort;
    PersonList* personsReste;
    PersonList* personsParcours=e->persons;
    int etage=e->currentFloor;
    while (personsParcours->person!=NULL){
        if (personsParcours->person->dest==etage){
            personsSort=insert(personsParcours->person,personsSort);
            personsParcours=personsParcours->next;
        }else{
            personsReste=insert(personsParcours->person,personsReste);
            personsParcours=personsParcours->next;
        }
    }
    e->persons=personsReste;
    return personsSort;
}

int placeElevator(Elevator *e){
    PersonList* personsParcours=e->persons;
    int res=e->capacity;
    while (personsParcours->person!=NULL){
        int res=res-1;
    }
    return res;
}

PersonList* enterElevator(Elevator *e, PersonList *waitingList){
    PersonList* personsParcours= waitingList;
    int places=placeElevator(e);
    while (personsParcours->person!=NULL && places!=0){
        insert(personsParcours->person, e->persons);
        personsParcours=personsParcours->next;
    }
    return personsParcours;
}

void stepElevator(Building *b){
    if (b->elevator->targetFloor!=b->elevator->currentFloor){
        if (b->elevator->targetFloor>b->elevator->currentFloor){
            b->elevator->currentFloor=b->elevator->currentFloor+1;
        }else{
            b->elevator->currentFloor=b->elevator->currentFloor-1;
        }
    }else{
        exitElevator(b->elevator);
        PersonList* newWaitingList = enterElevator(b->elevator,b->waitingLists[b->elevator->currentFloor]);
        b->waitingLists[b->elevator->currentFloor]=newWaitingList;
    }
}