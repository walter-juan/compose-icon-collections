package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.707f, 9.0f)
                horizontalLineToRelative(4.364f)
                curveToRelative(-0.536f, 1.573f, 2.028f, 3.806f, 4.929f, -0.5f)
                curveToRelative(-2.9f, -4.306f, -5.465f, -2.073f, -4.929f, -0.5f)
                horizontalLineTo(6.707f)
                lineTo(4.854f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineTo(5.293f, 8.0f)
                horizontalLineToRelative(-0.586f)
                lineTo(2.854f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineTo(3.293f, 8.0f)
                horizontalLineToRelative(-0.586f)
                lineTo(0.854f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineTo(1.793f, 8.5f)
                lineTo(0.146f, 10.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineTo(2.707f, 9.0f)
                horizontalLineToRelative(0.586f)
                lineToRelative(-1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineTo(4.707f, 9.0f)
                horizontalLineToRelative(0.586f)
                lineToRelative(-1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
