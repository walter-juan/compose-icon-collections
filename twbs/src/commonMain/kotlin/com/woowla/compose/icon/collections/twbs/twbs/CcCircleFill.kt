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

public val Twbs.CcCircleFill: ImageVector
    get() {
        if (_ccCircleFill != null) {
            return _ccCircleFill!!
        }
        _ccCircleFill = Builder(name = "CcCircleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(5.408f, 5.89f)
                curveToRelative(0.681f, 0.0f, 1.138f, 0.47f, 1.187f, 1.107f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.053f, -1.187f, -1.024f, -2.0f, -2.343f, -2.0f)
                curveToRelative(-1.604f, 0.0f, -2.518f, 1.05f, -2.518f, 2.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0.0f, 1.7f, 0.906f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0.0f, 2.285f, -0.792f, 2.343f, -1.939f)
                verticalLineToRelative(-0.114f)
                lineTo(6.595f, 9.062f)
                curveToRelative(-0.049f, 0.615f, -0.497f, 1.05f, -1.187f, 1.05f)
                curveToRelative(-0.84f, 0.0f, -1.318f, -0.62f, -1.318f, -1.727f)
                verticalLineToRelative(-0.742f)
                curveToRelative(0.0f, -1.112f, 0.488f, -1.754f, 1.318f, -1.754f)
                close()
                moveTo(10.812f, 5.89f)
                curveToRelative(0.68f, 0.0f, 1.138f, 0.47f, 1.186f, 1.107f)
                horizontalLineToRelative(1.147f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.053f, -1.187f, -1.024f, -2.0f, -2.342f, -2.0f)
                curveToRelative(-1.604f, 0.0f, -2.518f, 1.05f, -2.518f, 2.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0.0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0.0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, 0.615f, -0.496f, 1.05f, -1.186f, 1.05f)
                curveToRelative(-0.84f, 0.0f, -1.319f, -0.62f, -1.319f, -1.727f)
                verticalLineToRelative(-0.742f)
                curveToRelative(0.0f, -1.112f, 0.488f, -1.754f, 1.319f, -1.754f)
                close()
            }
        }
        .build()
        return _ccCircleFill!!
    }

private var _ccCircleFill: ImageVector? = null
