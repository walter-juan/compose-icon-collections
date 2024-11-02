package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Riscv: ImageVector
    get() {
        if (_riscv != null) {
            return _riscv!!
        }
        _riscv = Builder(name = "Riscv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.949f, 0.051f)
                horizontalLineToRelative(16.948f)
                verticalLineToRelative(6.21f)
                lineToRelative(-10.425f, 14.742f)
                lineToRelative(-0.524f, 0.734f)
                lineToRelative(-5.789f, -6.842f)
                curveToRelative(4.103f, -0.74f, 6.21f, -3.896f, 6.21f, -7.371f)
                curveToRelative(0.0f, -3.475f, -2.107f, -7.053f, -6.42f, -7.475f)
                close()
                moveTo(1.475f, 13.421f)
                lineToRelative(8.739f, 10.527f)
                lineTo(0.0f, 23.949f)
                lineTo(0.0f, 3.419f)
                horizontalLineToRelative(5.474f)
                curveToRelative(2.945f, 0.0f, 4.422f, 1.999f, 4.422f, 4.107f)
                curveToRelative(0.0f, 2.107f, -1.476f, 4.21f, -4.422f, 4.21f)
                lineTo(1.475f, 11.736f)
                verticalLineToRelative(1.686f)
                close()
                moveTo(15.544f, 23.949f)
                lineTo(24.0f, 23.949f)
                lineTo(24.0f, 12.157f)
                lineToRelative(-7.685f, 10.738f)
                lineToRelative(-0.77f, 1.054f)
                close()
            }
        }
        .build()
        return _riscv!!
    }

private var _riscv: ImageVector? = null
