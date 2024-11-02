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

public val Simpleicons.Inspire: ImageVector
    get() {
        if (_inspire != null) {
            return _inspire!!
        }
        _inspire = Builder(name = "Inspire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(3.873f, 3.688f)
                curveToRelative(1.036f, -0.001f, 1.876f, 0.839f, 1.875f, 1.875f)
                curveToRelative(-0.0f, 1.035f, -0.84f, 1.874f, -1.875f, 1.873f)
                curveTo(2.839f, 7.435f, 2.0f, 6.597f, 2.0f, 5.563f)
                curveToRelative(-0.001f, -1.035f, 0.838f, -1.875f, 1.873f, -1.875f)
                close()
                moveTo(8.363f, 4.195f)
                horizontalLineToRelative(3.531f)
                lineToRelative(6.734f, 10.813f)
                horizontalLineToRelative(0.045f)
                lineTo(18.674f, 4.195f)
                lineTo(22.0f, 4.195f)
                verticalLineToRelative(16.117f)
                horizontalLineToRelative(-3.547f)
                lineToRelative(-6.717f, -10.791f)
                horizontalLineToRelative(-0.047f)
                verticalLineToRelative(10.791f)
                lineTo(8.363f, 20.313f)
                lineTo(8.363f, 4.195f)
                close()
                moveTo(2.24f, 8.982f)
                reflectiveCurveToRelative(0.013f, 0.004f, 3.389f, 0.0f)
                verticalLineToRelative(11.275f)
                lineTo(2.24f, 20.258f)
                lineTo(2.24f, 8.982f)
                close()
            }
        }
        .build()
        return _inspire!!
    }

private var _inspire: ImageVector? = null
