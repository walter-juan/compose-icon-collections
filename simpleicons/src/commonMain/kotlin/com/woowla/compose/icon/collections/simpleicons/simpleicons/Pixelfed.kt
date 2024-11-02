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

public val Simpleicons.Pixelfed: ImageVector
    get() {
        if (_pixelfed != null) {
            return _pixelfed!!
        }
        _pixelfed = Builder(name = "Pixelfed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                moveToRelative(-0.953f, -9.38f)
                horizontalLineToRelative(2.201f)
                curveToRelative(2.074f, 0.0f, 3.755f, -1.637f, 3.755f, -3.655f)
                reflectiveCurveTo(15.323f, 7.309f, 13.249f, 7.309f)
                horizontalLineToRelative(-3.177f)
                curveToRelative(-1.196f, 0.0f, -2.166f, 0.944f, -2.166f, 2.109f)
                verticalLineToRelative(8.208f)
                close()
            }
        }
        .build()
        return _pixelfed!!
    }

private var _pixelfed: ImageVector? = null
