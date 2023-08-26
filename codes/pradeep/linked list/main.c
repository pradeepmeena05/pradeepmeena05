#include<stdio.h>
#include<stdlib.h>

 struct node{
   int data;
   struct node *link;
 };
 
 int main(){
 print_data(head);
 }
 
 void print_data(struct data *head){
   if (head==Null)
   {
     printf("linked list is empty");
   }
   struct node *ptr=Null;
   ptr=head;
   while(ptr!=Null)
   {
     printf("%d",ptr->data);
     ptr=ptr->link;
   }
 }
