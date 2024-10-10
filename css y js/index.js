const stopwatch= document.getElementById
('stopwatch');

const playPauseButton= document.getElementById
('play-pause');

const secondsSphere= document.getElementById
('seconds-sphere');

  let    stopwatchInterval;
   let   runningTime=0;
const playPause= () => {
    const isPaused= 
        !playPausedButton.classList.contains('running');
        if (isPaused) {
            playPauseButton.classList.add
            ('running');
            start();
        } else{
            playPauseButton.classList.remove('running');
            pause();
        }
    }
    const pause= () => {
        secondsSphere.style.animationPlayState='running';
        clearInterval(stopwatchInterval);
    }
    const stop = () =>{
        secondsSphere.style.transform= 'rotate(-90deg) translateX(60px)';
        secondsSphere.style.animation='none';
        playPauseButton.classList.remove  
        ('running');
runningTime=0;
clearInterval(stopwatchInterval);
stopwatch.textContent= '00:00';
    }



