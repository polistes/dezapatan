<?php
class CarFactory{
	private $carRecipe = array(
		'Red' => array(
			'engine' => 'NormalEngine',
			'brake'  => 'NormalBrake'
		), 
		'Blue' => array(
			'engine' => 'RocketEngine',
			'brake'  => 'NormalBrake'
		), 
		'Yellow' => array(
			'engine' => 'NormalEngine',
			'brake'  => 'SuperBrake'
		) 
	);
	private $recipeName;
	public function __construct($type){
		if( !isset($this->carRecipe[$type]) ){
			throw new Exception("recipe does not exist.  : ". $type );
		}
		else{
			$this->recipeName = $type;
		}
	}

	public function createEngine(){
		return new $this->carRecipe[$this->recipeName]['engine']();
	}

	public function createBrake(){
		return new $this->carRecipe[$this->recipeName]['brake']();
	}
}

interface Engine{
	public function startEngine();
}

class NormalEngine implements Engine{
	public function startEngine(){
		echo "Normal engine start!!\n";
	}
}


class RocketEngine implements Engine{
	public function startEngine(){
		echo "RocketEngine!!!!!!!!!!!!!!!!!!!\n";
	}
}

interface Brake{
	public function on();
}

class NormalBrake implements Brake{
	public function on(){
		echo "Normal Brake!!\n";
	}
}

class SuperBrake implements Brake{
	public function on(){
		echo "SuperBrake!!!!!!!!!!!!!!!!!!!!!\n";
	}
}

class Car{
	private $engine;
	private $brake;

	function setPartsFactory($factory){
		$this->engine = $factory->createEngine();
		$this->brake  = $factory->createBrake();
	}

	function startEngine(){
		$this->engine->startEngine();
	}

	function brake(){
		$this->brake->on();
	}
}

echo "--- Red ---\n";
$cpfactory = new CarFactory('Red');
$car = new Car();
$car->setPartsFactory($cpfactory);
$car->startEngine();
$car->brake();

echo "--- Blue ---\n";
$cpfactory = new CarFactory('Blue');
$car = new Car();
$car->setPartsFactory($cpfactory);
$car->startEngine();
$car->brake();

echo "--- Yellow ---\n";
$cpfactory = new CarFactory('Yellow');
$car = new Car();
$car->setPartsFactory($cpfactory);
$car->startEngine();
$car->brake();
?>
