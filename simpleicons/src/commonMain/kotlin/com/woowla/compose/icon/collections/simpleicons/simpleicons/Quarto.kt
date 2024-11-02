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

public val Simpleicons.Quarto: ImageVector
    get() {
        if (_quarto != null) {
            return _quarto!!
        }
        _quarto = Builder(name = "Quarto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.65f, 12.854f)
                lineTo(12.65f, 24.0f)
                curveToRelative(6.042f, -0.325f, 10.923f, -5.105f, 11.33f, -11.125f)
                lineTo(12.65f, 12.875f)
                close()
                moveTo(11.146f, 12.854f)
                lineTo(0.02f, 12.854f)
                curveToRelative(0.427f, 5.94f, 5.166f, 10.699f, 11.105f, 11.105f)
                lineTo(11.125f, 12.854f)
                close()
                moveTo(12.651f, 11.349f)
                lineTo(24.0f, 11.349f)
                curveTo(23.675f, 5.247f, 18.753f, 0.325f, 12.65f, 0.0f)
                close()
                moveTo(11.146f, 11.349f)
                lineTo(11.146f, 0.0f)
                curveTo(5.106f, 0.427f, 0.326f, 5.308f, 0.0f, 11.35f)
                close()
            }
        }
        .build()
        return _quarto!!
    }

private var _quarto: ImageVector? = null
