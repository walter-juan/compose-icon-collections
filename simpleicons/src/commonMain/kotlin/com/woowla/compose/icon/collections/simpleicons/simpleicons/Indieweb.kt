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

public val Simpleicons.Indieweb: ImageVector
    get() {
        if (_indieweb != null) {
            return _indieweb!!
        }
        _indieweb = Builder(name = "Indieweb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.387f, 8.258f)
                arcTo(3.643f, 3.643f, 0.0f, false, true, 24.0f, 11.54f)
                horizontalLineToRelative(-3.613f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, -0.348f, 0.348f)
                curveToRelative(0.009f, 0.182f, 0.13f, 0.32f, 0.312f, 0.346f)
                lineToRelative(0.036f, 0.002f)
                lineTo(24.0f, 12.236f)
                curveToRelative(-0.178f, 1.872f, -1.75f, 3.258f, -3.613f, 3.282f)
                arcToRelative(3.63f, 3.63f, 0.0f, true, true, 0.0f, -7.26f)
                moveToRelative(-9.938f, 0.247f)
                lineToRelative(3.359f, 7.237f)
                lineToRelative(3.39f, -7.237f)
                close()
                moveTo(7.508f, 8.505f)
                lineTo(10.867f, 15.742f)
                lineTo(11.966f, 13.459f)
                lineTo(9.628f, 8.505f)
                close()
                moveTo(0.0f, 11.083f)
                horizontalLineToRelative(6.78f)
                verticalLineToRelative(4.125f)
                lineTo(0.0f, 15.208f)
                close()
                moveTo(0.0f, 8.505f)
                horizontalLineToRelative(6.78f)
                verticalLineToRelative(1.897f)
                lineTo(0.0f, 10.402f)
                close()
            }
        }
        .build()
        return _indieweb!!
    }

private var _indieweb: ImageVector? = null
