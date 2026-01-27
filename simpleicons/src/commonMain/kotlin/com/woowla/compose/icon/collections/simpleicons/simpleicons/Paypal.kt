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

public val Simpleicons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.607f, 4.653f)
                horizontalLineTo(8.941f)
                lineTo(6.645f, 19.251f)
                horizontalLineTo(1.82f)
                lineTo(4.862f, 0.0f)
                horizontalLineToRelative(7.995f)
                curveToRelative(3.754f, 0.0f, 6.375f, 2.294f, 6.473f, 5.513f)
                curveToRelative(-0.648f, -0.478f, -2.105f, -0.86f, -3.722f, -0.86f)
                moveToRelative(6.57f, 5.546f)
                curveToRelative(0.0f, 3.41f, -3.01f, 6.853f, -6.958f, 6.853f)
                horizontalLineToRelative(-2.493f)
                lineTo(11.595f, 24.0f)
                horizontalLineTo(6.74f)
                lineToRelative(1.845f, -11.538f)
                horizontalLineToRelative(3.592f)
                curveToRelative(4.208f, 0.0f, 7.346f, -3.634f, 7.153f, -6.949f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 2.848f, 4.686f)
                moveTo(9.653f, 5.546f)
                horizontalLineToRelative(6.408f)
                curveToRelative(0.907f, 0.0f, 1.942f, 0.222f, 2.363f, 0.541f)
                curveToRelative(-0.195f, 2.741f, -2.655f, 5.483f, -6.441f, 5.483f)
                horizontalLineTo(8.714f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
