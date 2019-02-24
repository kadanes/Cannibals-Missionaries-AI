# Cannibals Missionaries AI
**Code does a state space search to derive the goal sequence**

<pre>
 OPENING: (M3,C3) BOAT___ (M0,C0)<br>
 ↳ INVALID: (M2,C3) ___BOAT (M1,C0)<br>
 ↳ NEW VALID: (M3,C2) ___BOAT (M0,C1)<br>
 ↳ INVALID: (M1,C3) ___BOAT (M2,C0)<br>
 ↳ NEW VALID: (M3,C1) ___BOAT (M0,C2)<br>
 ↳ NEW VALID: (M2,C2) ___BOAT (M1,C1)<br>
<hr>
  OPENING: (M3,C2) ___BOAT (M0,C1)<br>
 ↳ VISITED: (M3,C3) BOAT___ (M0,C0)<br>
<hr>
  OPENING: (M3,C1) ___BOAT (M0,C2)<br>
 ↳ INVALID: (M3,C2) BOAT___ (M0,C1)<br>
 ↳ VISITED: (M3,C3) BOAT___ (M0,C0)
<hr>
  OPENING: (M2,C2) ___BOAT (M1,C1)<br>
 ↳ INVALID: (M3,C2) BOAT___ (M0,C1)<br>
 ↳ NEW VALID: (M2,C3) BOAT___ (M1,C0)<br>
 ↳ VISITED: (M3,C3) BOAT___ (M0,C0)
<hr>
  OPENING: (M2,C3) BOAT___ (M1,C0)<br>
 ↳ INVALID: (M1,C3) ___BOAT (M2,C0)<br>
 ↳ VISITED: (M2,C2) ___BOAT (M1,C1)<br>
 ↳ INVALID: (M0,C3) ___BOAT (M3,C0)<br>
 ↳ NEW VALID: (M2,C1) ___BOAT (M1,C2)<br>
 ↳ INVALID: (M1,C2) ___BOAT (M2,C1)
<hr>
  OPENING: (M2,C1) ___BOAT (M1,C2)<br>
 ↳ INVALID: (M3,C1) BOAT___ (M0,C2)<br>
 ↳ NEW VALID: (M2,C2) BOAT___ (M1,C1)<br>
 ↳ VISITED: (M2,C3) BOAT___ (M1,C0)<br>
 ↳ INVALID: (M3,C2) BOAT___ (M0,C1)
<hr>
  OPENING: (M2,C2) BOAT___ (M1,C1)<br>
 ↳ INVALID: (M1,C2) ___BOAT (M2,C1)<br>
 ↳ VISITED: (M2,C1) ___BOAT (M1,C2)<br>
 ↳ INVALID: (M0,C2) ___BOAT (M3,C1)<br>
 ↳ NEW VALID: (M2,C0) ___BOAT (M1,C3)<br>
 ↳ NEW VALID: (M1,C1) ___BOAT (M2,C2)
<hr>
  OPENING: (M2,C0) ___BOAT (M1,C3)<br>
 ↳ INVALID: (M3,C0) BOAT___ (M0,C3)<br>
 ↳ INVALID: (M2,C1) BOAT___ (M1,C2)<br>
 ↳ VISITED: (M2,C2) BOAT___ (M1,C1)<br>
 ↳ INVALID: (M3,C1) BOAT___ (M0,C2)<br>
<hr>
  OPENING: (M1,C1) ___BOAT (M2,C2)<br>
 ↳ INVALID: (M2,C1) BOAT___ (M1,C2)<br>
 ↳ NEW VALID: (M1,C2) BOAT___ (M2,C1)<br>
 ↳ INVALID: (M3,C1) BOAT___ (M0,C2)<br>
 ↳ NEW VALID: (M1,C3) BOAT___ (M2,C0)<br>
 ↳ VISITED: (M2,C2) BOAT___ (M1,C1)
<hr>
  OPENING: (M1,C2) BOAT___ (M2,C1)<br>
 ↳ INVALID: (M0,C2) ___BOAT (M3,C1)<br>
 ↳ VISITED: (M1,C1) ___BOAT (M2,C2)<br>
 ↳ NEW VALID: (M1,C0) ___BOAT (M2,C3)<br>
 ↳ INVALID: (M0,C1) ___BOAT (M3,C2)
<hr>
  OPENING: (M1,C3) BOAT___ (M2,C0)<br>
 ↳ INVALID: (M0,C3) ___BOAT (M3,C0)<br>
 ↳ INVALID: (M1,C2) ___BOAT (M2,C1)<br>
 ↳ VISITED: (M1,C1) ___BOAT (M2,C2)<br>
 ↳ INVALID: (M0,C2) ___BOAT (M3,C1)
<hr>
  OPENING: (M1,C0) ___BOAT (M2,C3)<br>
 ↳ INVALID: (M2,C0) BOAT___ (M1,C3)<br>
 ↳ NEW VALID: (M1,C1) BOAT___ (M2,C2)<br>
 ↳ INVALID: (M3,C0) BOAT___ (M0,C3)<br>
 ↳ VISITED: (M1,C2) BOAT___ (M2,C1)<br>
 ↳ INVALID: (M2,C1) BOAT___ (M1,C2)
<hr>
  OPENING: (M1,C1) BOAT___ (M2,C2)<br>
 ↳ INVALID: (M0,C1) ___BOAT (M3,C2)<br>
 ↳ VISITED: (M1,C0) ___BOAT (M2,C3)<br>
 ↳ NEW VALID: (M0,C0) ___BOAT (M3,C3)
<hr>
  OPENING: (M0,C0) ___BOAT (M3,C3)<br>
 ↳ INVALID: (M1,C0) BOAT___ (M2,C3)<br>
 ↳ NEW VALID: (M0,C1) BOAT___ (M3,C2)<br>
 ↳ INVALID: (M2,C0) BOAT___ (M1,C3)<br>
 ↳ NEW VALID: (M0,C2) BOAT___ (M3,C1)<br>
 ↳ VISITED: (M1,C1) BOAT___ (M2,C2)
<hr>
  OPENING: (M0,C1) BOAT___ (M3,C2)<br>
 ↳ VISITED: (M0,C0) ___BOAT (M3,C3)
<hr>
 ↳ INVALID: (M0,C1) ___BOAT (M3,C2)<br>
 ↳ VISITED: (M0,C0) ___BOAT (M3,C3)
</pre>
<pre>
Goal Steps

👶👶👶👺👺👺 ⛵🌊🌊 

↳ 👶👶👺👺 🌊🌊⛵ 👶👺

↳ 👶👶👺👺👺 ⛵🌊🌊 👶

↳ 👶👶👺 🌊🌊⛵ 👶👺👺

↳ 👶👶👺👺 ⛵🌊🌊 👶👺

↳ 👶👺 🌊🌊⛵ 👶👶👺👺

↳ 👶👺👺 ⛵🌊🌊 👶👶👺

↳ 👶 🌊🌊⛵ 👶👶👺👺👺

↳ 👶👺 ⛵🌊🌊 👶👶👺👺

↳  🌊🌊⛵ 👶👶👶👺👺👺

↳ 👺👺 ⛵🌊🌊 👶👶👶👺

↳  🌊🌊⛵ 👶👶👶👺👺👺
</pre>
