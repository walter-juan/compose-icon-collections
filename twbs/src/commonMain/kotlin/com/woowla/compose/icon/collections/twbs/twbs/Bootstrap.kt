package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.062f, 12.0f)
                horizontalLineToRelative(3.475f)
                curveToRelative(1.804f, 0.0f, 2.888f, -0.908f, 2.888f, -2.396f)
                curveToRelative(0.0f, -1.102f, -0.761f, -1.916f, -1.904f, -2.034f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.832f, -0.14f, 1.482f, -0.93f, 1.482f, -1.816f)
                curveToRelative(0.0f, -1.3f, -0.955f, -2.11f, -2.542f, -2.11f)
                lineTo(5.062f, 3.544f)
                close()
                moveTo(6.375f, 7.125f)
                lineTo(6.375f, 4.658f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.973f, 0.0f, 1.542f, 0.457f, 1.542f, 1.237f)
                curveToRelative(0.0f, 0.802f, -0.604f, 1.23f, -1.764f, 1.23f)
                close()
                moveTo(6.375f, 10.887f)
                lineTo(6.375f, 8.162f)
                horizontalLineToRelative(1.822f)
                curveToRelative(1.236f, 0.0f, 1.887f, 0.463f, 1.887f, 1.348f)
                curveToRelative(0.0f, 0.896f, -0.627f, 1.377f, -1.811f, 1.377f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(4.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                close()
                moveTo(4.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(15.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
