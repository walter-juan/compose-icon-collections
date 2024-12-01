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

public val Simpleicons.Snapdragon: ImageVector
    get() {
        if (_snapdragon != null) {
            return _snapdragon!!
        }
        _snapdragon = Builder(name = "Snapdragon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.016f)
                horizontalLineToRelative(-0.351f)
                curveToRelative(-3.223f, 0.128f, -6.862f, 2.202f, -7.596f, 5.49f)
                curveToRelative(-0.032f, 0.127f, -0.191f, 0.127f, -0.223f, 0.0f)
                curveToRelative(-0.16f, -0.799f, -0.128f, -1.66f, 0.096f, -2.394f)
                arcToRelative(12.645f, 12.645f, 0.0f, false, false, -1.82f, 2.074f)
                arcToRelative(6.473f, 6.473f, 0.0f, false, false, -0.638f, 1.34f)
                curveToRelative(-0.447f, 1.405f, -0.287f, 3.096f, 0.702f, 4.245f)
                curveToRelative(0.926f, 1.085f, 2.394f, 1.468f, 3.575f, 2.202f)
                curveToRelative(1.18f, 0.703f, 2.202f, 1.66f, 2.68f, 3.0f)
                curveToRelative(0.511f, 1.405f, 0.416f, 3.0f, -0.127f, 4.373f)
                curveToRelative(-0.032f, 0.127f, -0.223f, 0.095f, -0.223f, -0.064f)
                curveToRelative(0.127f, -2.01f, -0.894f, -3.894f, -2.777f, -4.787f)
                curveToRelative(-0.99f, -0.447f, -2.106f, -0.639f, -3.096f, -1.117f)
                curveTo(1.31f, 13.963f, 0.16f, 13.133f, 0.0f, 12.048f)
                curveToRelative(0.0f, 6.574f, 5.362f, 11.936f, 12.0f, 11.936f)
                curveToRelative(6.607f, 0.0f, 12.0f, -5.362f, 12.0f, -12.0f)
                reflectiveCurveTo(18.607f, 0.016f, 12.0f, 0.016f)
                moveToRelative(8.745f, 18.638f)
                arcToRelative(11.663f, 11.663f, 0.0f, false, true, -3.255f, 2.872f)
                reflectiveCurveToRelative(0.0f, -0.032f, 0.032f, -0.032f)
                curveToRelative(-0.83f, 0.479f, -1.724f, 0.894f, -2.681f, 1.15f)
                curveToRelative(0.734f, -0.607f, 3.127f, -2.171f, 3.127f, -6.48f)
                curveToRelative(0.0f, -3.191f, -2.01f, -5.33f, -4.276f, -6.382f)
                curveTo(11.107f, 8.569f, 8.33f, 7.93f, 8.33f, 4.675f)
                curveToRelative(0.0f, -1.723f, 1.372f, -3.574f, 3.51f, -3.606f)
                curveToRelative(0.128f, -0.032f, 0.288f, -0.032f, 0.416f, -0.032f)
                horizontalLineToRelative(0.127f)
                arcToRelative(10.827f, 10.827f, 0.0f, false, true, 7.5f, 3.35f)
                arcToRelative(10.923f, 10.923f, 0.0f, false, true, 3.096f, 7.66f)
                verticalLineToRelative(0.064f)
                curveToRelative(0.0f, 1.34f, -0.255f, 2.65f, -0.702f, 3.862f)
                verticalLineToRelative(0.032f)
                curveToRelative(-0.032f, 0.096f, -0.096f, 0.223f, -0.128f, 0.32f)
                curveToRelative(-0.032f, 0.063f, -0.064f, 0.127f, -0.064f, 0.159f)
                reflectiveCurveToRelative(-0.032f, 0.032f, -0.032f, 0.064f)
                arcToRelative(13.475f, 13.475f, 0.0f, false, true, -1.308f, 2.106f)
            }
        }
        .build()
        return _snapdragon!!
    }

private var _snapdragon: ImageVector? = null
