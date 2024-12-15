package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.SparklesFill24: ImageVector
    get() {
        if (_sparklesFill24 != null) {
            return _sparklesFill24!!
        }
        _sparklesFill24 = Builder(name = "SparklesFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 3.419f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, true, 1.2f, 0.0f)
                lineToRelative(0.61f, 1.668f)
                arcToRelative(9.587f, 9.587f, 0.0f, false, false, 5.703f, 5.703f)
                lineToRelative(1.668f, 0.61f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, true, 0.0f, 1.2f)
                lineToRelative(-1.668f, 0.61f)
                arcToRelative(9.587f, 9.587f, 0.0f, false, false, -5.703f, 5.703f)
                lineToRelative(-0.61f, 1.668f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, true, -1.2f, 0.0f)
                lineToRelative(-0.61f, -1.668f)
                arcToRelative(9.587f, 9.587f, 0.0f, false, false, -5.703f, -5.703f)
                lineToRelative(-1.668f, -0.61f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, true, 0.0f, -1.2f)
                lineToRelative(1.668f, -0.61f)
                arcToRelative(9.587f, 9.587f, 0.0f, false, false, 5.703f, -5.703f)
                lineToRelative(0.61f, -1.668f)
                close()
                moveTo(8.0f, 16.675f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(0.254f, 0.694f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, false, 2.376f, 2.377f)
                lineToRelative(0.695f, 0.254f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, true, 0.0f, 0.5f)
                lineToRelative(-0.695f, 0.254f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, false, -2.376f, 2.377f)
                lineToRelative(-0.254f, 0.694f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, true, -0.5f, 0.0f)
                lineToRelative(-0.254f, -0.694f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, false, -2.376f, -2.377f)
                lineToRelative(-0.695f, -0.254f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, true, 0.0f, -0.5f)
                lineToRelative(0.695f, -0.254f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, false, 2.376f, -2.377f)
                lineTo(8.0f, 16.675f)
                close()
                moveTo(4.2f, 0.21f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.6f, 0.0f)
                lineToRelative(0.305f, 0.833f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, false, 2.852f, 2.852f)
                lineToRelative(0.833f, 0.305f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.0f, 0.6f)
                lineToRelative(-0.833f, 0.305f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, false, -2.852f, 2.852f)
                lineTo(4.8f, 8.79f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.6f, 0.0f)
                lineToRelative(-0.305f, -0.833f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, false, -2.852f, -2.852f)
                lineTo(0.21f, 4.8f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.0f, -0.6f)
                lineToRelative(0.833f, -0.305f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, false, 2.852f, -2.852f)
                lineTo(4.2f, 0.21f)
                close()
            }
        }
        .build()
        return _sparklesFill24!!
    }

private var _sparklesFill24: ImageVector? = null
