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

public val Simpleicons.Rustdesk: ImageVector
    get() {
        if (_rustdesk != null) {
            return _rustdesk!!
        }
        _rustdesk = Builder(name = "Rustdesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.608f, 5.601f)
                lineToRelative(-1.971f, 1.959f)
                curveToRelative(-0.347f, 0.311f, -0.515f, 0.811f, -0.32f, 1.234f)
                curveToRelative(1.313f, 2.747f, 0.814f, 6.022f, -1.34f, 8.175f)
                curveToRelative(-2.155f, 2.152f, -5.434f, 2.649f, -8.184f, 1.337f)
                curveToRelative(-0.405f, -0.182f, -0.881f, -0.028f, -1.193f, 0.288f)
                lineToRelative(-2.003f, 2.0f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, false, 0.192f, 1.671f)
                arcToRelative(12.005f, 12.005f, 0.0f, false, false, 14.686f, -1.765f)
                arcTo(11.972f, 11.972f, 0.0f, false, false, 22.281f, 5.836f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, false, -1.673f, -0.235f)
                close()
                moveTo(3.561f, 3.474f)
                arcTo(11.972f, 11.972f, 0.0f, false, false, 1.697f, 18.137f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, false, 1.673f, 0.235f)
                lineTo(5.33f, 16.424f)
                curveToRelative(0.355f, -0.31f, 0.528f, -0.816f, 0.331f, -1.244f)
                curveToRelative(-1.314f, -2.747f, -0.816f, -6.022f, 1.339f, -8.175f)
                curveTo(9.155f, 4.852f, 12.435f, 4.354f, 15.185f, 5.666f)
                curveToRelative(0.401f, 0.179f, 0.869f, 0.031f, 1.182f, -0.277f)
                lineToRelative(2.014f, -2.012f)
                arcToRelative(1.063f, 1.063f, 0.0f, false, false, -0.192f, -1.671f)
                arcTo(12.009f, 12.009f, 0.0f, false, false, 3.519f, 3.527f)
                close()
            }
        }
        .build()
        return _rustdesk!!
    }

private var _rustdesk: ImageVector? = null
