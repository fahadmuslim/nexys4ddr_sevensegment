import chisel3._
import chisel3.util._

class CountSevenSeg extends Module {
  val io = IO(new Bundle {
    //val active = Input(UInt(1.W))
    val seg = Output(UInt(7.W))
    val an =  Output(UInt(8.W))
    val dp = Output(UInt(1.W))
  })

  val sevSeg = WireDefault("b0000000".U(7.W))

  // *** HEX counter code starts here

  // 7-segment display decoder for displaying decimal digits
  val segDecoder = WireDefault(0.U(7.W))  

val counterReg = RegInit(0.U(4.W))
val CNT_MAX = (100000000 / 25*8).U
  
val cntReg = RegInit(0.U(32.W))

  // Increment the counter on each clock cycle
  //when(counterReg === 15.U) {
   // counterReg := 0.U // Reset the counter when it reaches 15
  //}.otherwise {  
 
cntReg := cntReg + 1.U
  when(cntReg === CNT_MAX) {
    cntReg := 0.U

counterReg := counterReg + 1.U

}

switch(counterReg) {
    is(0.U) { segDecoder := "b1000000".U } // Display 0
    is(1.U) { segDecoder := "b1111001".U } // Display 1
    is(2.U) { segDecoder := "b0100100".U } // Display 2
    is(3.U) { segDecoder := "b0110000".U } // Display 3
    is(4.U) { segDecoder := "b0011001".U } // Display 4
    is(5.U) { segDecoder := "b0010010".U } // Display 5
    is(6.U) { segDecoder := "b0000010".U } // Display 6
    is(7.U) { segDecoder := "b1111000".U } // Display 7
    is(8.U) { segDecoder := "b0000000".U } // Display 8
    is(9.U) { segDecoder := "b0010000".U } // Display 9
    is(10.U){ segDecoder := "b0001000".U } // Display 10 (A)
    is(11.U){ segDecoder := "b0000000".U } // Display 11 (B)
    is(12.U){ segDecoder := "b1000110".U } // Display 12 (C)
    is(13.U){ segDecoder := "b1000000".U } // Display 13 (D)
    is(14.U){ segDecoder := "b0000110".U } // Display 14 (E)
    is(15.U){ segDecoder := "b0001110".U } // Display 15 (F)
  }
  //}  
 
  // Connect the counter to the 7-segment display
  sevSeg := segDecoder

  // *** Counter code ends here

  io.seg := sevSeg
  io.an := "b11111110".U
  io.dp := "b0".U
}

// generate Verilog
object CountSevenSeg extends App {
  emitVerilog(new CountSevenSeg())
}