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

public val Simpleicons.Chakraui: ImageVector
    get() {
        if (_chakraui != null) {
            return _chakraui!!
        }
        _chakraui = Builder(name = "Chakraui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.678f, 1.583f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, -3.03f, 1.76f)
                lineTo(0.265f, 10.997f)
                arcToRelative(2.035f, 2.035f, 0.0f, false, false, -0.064f, 1.886f)
                lineToRelative(4.486f, 7.784f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, false, 3.03f, 1.751f)
                lineToRelative(8.602f, -0.01f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, 3.026f, -1.759f)
                lineToRelative(4.39f, -7.655f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, -0.002f, -2.008f)
                lineTo(19.339f, 3.34f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, -3.028f, -1.756f)
                close()
                moveTo(12.043f, 2.827f)
                lineTo(12.043f, 9.11f)
                curveToRelative(0.0f, 0.32f, 0.226f, 0.595f, 0.54f, 0.656f)
                lineToRelative(6.089f, 1.187f)
                curveToRelative(-2.005f, 3.466f, -4.006f, 6.934f, -6.008f, 10.4f)
                curveToRelative(-0.17f, 0.296f, -0.62f, 0.176f, -0.62f, -0.166f)
                verticalLineToRelative(-6.286f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -0.538f, -0.656f)
                lineToRelative(-6.072f, -1.193f)
                lineToRelative(5.988f, -10.393f)
                curveToRelative(0.168f, -0.29f, 0.621f, -0.178f, 0.621f, 0.168f)
                close()
            }
        }
        .build()
        return _chakraui!!
    }

private var _chakraui: ImageVector? = null
