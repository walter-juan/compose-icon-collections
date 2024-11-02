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

public val Simpleicons.Bookstack: ImageVector
    get() {
        if (_bookstack != null) {
            return _bookstack!!
        }
        _bookstack = Builder(name = "Bookstack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.301f, 17.615f)
                curveToRelative(-0.13f, -0.339f, -0.523f, -1.512f, -0.134f, -2.431f)
                lineToRelative(9.827f, 5.674f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, false, 0.33f, 0.0f)
                lineTo(24.0f, 12.962f)
                verticalLineToRelative(2.354f)
                lineToRelative(-13.84f, 7.991f)
                lineToRelative(-9.859f, -5.692f)
                close()
                moveTo(0.191f, 8.963f)
                curveToRelative(-0.288f, 0.877f, 0.015f, 2.058f, 0.124f, 2.426f)
                lineToRelative(9.845f, 5.684f)
                lineTo(24.0f, 9.082f)
                lineTo(24.0f, 6.727f)
                lineTo(10.325f, 14.623f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, -0.33f, 0.0f)
                lineTo(0.191f, 8.963f)
                close()
                moveTo(13.361f, 7.027f)
                curveToRelative(-0.182f, 0.111f, -0.439f, 0.002f, -0.485f, -0.206f)
                lineToRelative(-0.28f, -1.134f)
                lineToRelative(-2.125f, -0.175f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, -0.138f, -0.614f)
                lineToRelative(5.578f, -3.221f)
                lineToRelative(-1.702f, -0.983f)
                lineTo(0.698f, 8.493f)
                lineToRelative(9.462f, 5.463f)
                lineToRelative(13.51f, -7.8f)
                lineToRelative(-4.401f, -2.541f)
                lineToRelative(-5.908f, 3.411f)
                close()
                moveTo(13.179f, 5.298f)
                lineTo(13.411f, 6.236f)
                lineTo(18.609f, 3.235f)
                lineTo(16.57f, 2.057f)
                lineTo(11.576f, 4.941f)
                lineTo(12.886f, 5.049f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.293f, 0.25f)
                close()
                moveTo(24.0f, 9.845f)
                lineToRelative(-13.675f, 7.895f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, -0.33f, 0.0f)
                lineTo(0.168f, 12.067f)
                curveToRelative(-0.389f, 0.919f, 0.003f, 2.091f, 0.133f, 2.431f)
                lineToRelative(9.859f, 5.692f)
                lineTo(24.0f, 12.199f)
                lineTo(24.0f, 9.845f)
                close()
            }
        }
        .build()
        return _bookstack!!
    }

private var _bookstack: ImageVector? = null
