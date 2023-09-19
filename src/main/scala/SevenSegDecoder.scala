import chisel3._
import chisel3.util._

class SevenSegDecoder extends Module {
  val io = IO(new Bundle {
    val sw = Input(UInt(4.W))
    val seg = Output(UInt(7.W))
    val an = Output(UInt(8.W))
  })

  val sevSeg = WireDefault(0.U(7.W))

  // ***** your code starts here *****
  switch(io.sw) {
    is("b0000".U) { sevSeg := "b1000000".U } // Display 0
    is("b0001".U) { sevSeg := "b1111001".U } // Display 1
    is("b0010".U) { sevSeg := "b0100100".U } // Display 2
    is("b0011".U) { sevSeg := "b0110000".U } // Display 3
    is("b0100".U) { sevSeg := "b0011001".U } // Display 4
    is("b0101".U) { sevSeg := "b0010010".U } // Display 5
    is("b0110".U) { sevSeg := "b0000010".U } // Display 6
    is("b0111".U) { sevSeg := "b1111000".U } // Display 7
    is("b1000".U) { sevSeg := "b0000000".U } // Display 8
    is("b1001".U) { sevSeg := "b0010000".U } // Display 9
    is("b1010".U) { sevSeg := "b0001000".U } // Display 10 (A)
    is("b1011".U) { sevSeg := "b0000000".U } // Display 11 (B)
    is("b1100".U) { sevSeg := "b1000110".U } // Display 12 (C)
    is("b1101".U) { sevSeg := "b1000000".U } // Display 13 (D)
    is("b1110".U) { sevSeg := "b0000110".U } // Display 14 (E)
    is("b1111".U) { sevSeg := "b0001110".U } // Display 15 (F)
  }  

  // ***** your code ends here *****

  io.seg := sevSeg
  io.an := "b11111110".U
}

// generate Verilog
object SevenSegDecoder extends App {
  emitVerilog(new SevenSegDecoder())
}


