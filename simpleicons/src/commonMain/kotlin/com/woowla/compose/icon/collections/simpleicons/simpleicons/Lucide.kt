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

public val Simpleicons.Lucide: ImageVector
    get() {
        if (_lucide != null) {
            return _lucide!!
        }
        _lucide = Builder(name = "Lucide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.483f, 1.123f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.752f, 0.362f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 0.088f, 1.54f)
                arcToRelative(11.956f, 11.956f, 0.0f, false, true, 4.0f, 8.946f)
                arcToRelative(7.62f, 7.62f, 0.0f, false, true, -7.637f, 7.636f)
                arcToRelative(7.62f, 7.62f, 0.0f, false, true, -7.637f, -7.636f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, true, 3.273f, -3.273f)
                curveToRelative(1.82f, 0.0f, 3.273f, 1.45f, 3.273f, 3.273f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 1.09f, 1.09f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 1.092f, -1.09f)
                curveToRelative(0.0f, -3.0f, -2.455f, -5.455f, -5.455f, -5.455f)
                reflectiveCurveToRelative(-5.454f, 2.455f, -5.454f, 5.455f)
                curveToRelative(0.0f, 5.408f, 4.408f, 9.818f, 9.818f, 9.818f)
                curveToRelative(5.41f, 0.0f, 9.818f, -4.41f, 9.818f, -9.818f)
                arcTo(14.16f, 14.16f, 0.0f, false, false, 19.272f, 1.4f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.789f, -0.277f)
                close()
                moveTo(9.818f, 2.15f)
                curveTo(4.408f, 2.151f, 0.0f, 6.561f, 0.0f, 11.97f)
                arcToRelative(14.16f, 14.16f, 0.0f, false, false, 4.8f, 10.637f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 1.54f, -0.096f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.095f, -1.54f)
                arcToRelative(11.957f, 11.957f, 0.0f, false, true, -4.063f, -9.0f)
                arcToRelative(7.62f, 7.62f, 0.0f, false, true, 7.636f, -7.637f)
                arcToRelative(7.62f, 7.62f, 0.0f, false, true, 7.637f, 7.636f)
                arcToRelative(3.256f, 3.256f, 0.0f, false, true, -3.273f, 3.273f)
                arcToRelative(3.256f, 3.256f, 0.0f, false, true, -3.273f, -3.273f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -1.09f, -1.09f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -1.092f, 1.09f)
                curveToRelative(0.0f, 3.0f, 2.455f, 5.455f, 5.455f, 5.455f)
                reflectiveCurveToRelative(5.454f, -2.455f, 5.454f, -5.455f)
                curveToRelative(0.0f, -5.408f, -4.408f, -9.818f, -9.818f, -9.818f)
                close()
            }
        }
        .build()
        return _lucide!!
    }

private var _lucide: ImageVector? = null
