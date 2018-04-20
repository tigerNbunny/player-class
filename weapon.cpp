#include <iostream>
#include "Player.h"
using namespace std; 

Weapon::Weapon(string wnam, int f, double k) :wname(wnam), force(f), killRange(k) {}
string Weapon::getWname()
{
	return wname;
}

int Weapon::getForce()
{
	return force;
}

double Weapon::getKillRange()
{
	return killRange;
}
