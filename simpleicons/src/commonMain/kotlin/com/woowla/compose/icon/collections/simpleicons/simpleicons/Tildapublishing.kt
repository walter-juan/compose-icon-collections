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

public val Simpleicons.Tildapublishing: ImageVector
    get() {
        if (_tildapublishing != null) {
            return _tildapublishing!!
        }
        _tildapublishing = Builder(name = "Tildapublishing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.384f, 0.0f, 0.0f, 5.384f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.384f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.384f, 12.0f, -12.0f)
                reflectiveCurveTo(18.616f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 0.775f)
                curveTo(18.192f, 0.775f, 23.225f, 5.808f, 23.225f, 12.0f)
                curveToRelative(0.0f, 6.192f, -5.033f, 11.225f, -11.225f, 11.225f)
                curveTo(5.808f, 23.225f, 0.775f, 18.192f, 0.775f, 12.0f)
                curveTo(0.775f, 5.808f, 5.808f, 0.775f, 12.0f, 0.775f)
                close()
                moveTo(8.904f, 6.584f)
                curveToRelative(-1.36f, 0.0f, -2.52f, 1.16f, -2.52f, 3.287f)
                lineToRelative(1.352f, 0.193f)
                curveToRelative(0.192f, -1.352f, 0.576f, -1.935f, 1.352f, -1.935f)
                curveToRelative(0.776f, 0.0f, 1.167f, 0.19f, 2.52f, 0.967f)
                curveToRelative(1.351f, 0.776f, 1.735f, 0.968f, 3.095f, 0.968f)
                reflectiveCurveToRelative(2.714f, -0.969f, 2.522f, -3.289f)
                lineTo(15.87f, 6.775f)
                curveToRelative(0.0f, 1.16f, -0.382f, 1.745f, -1.158f, 1.745f)
                curveToRelative(-0.776f, 0.0f, -1.169f, -0.191f, -2.713f, -0.967f)
                reflectiveCurveToRelative(-1.736f, -0.969f, -3.096f, -0.969f)
                close()
                moveTo(11.031f, 10.064f)
                verticalLineToRelative(8.905f)
                horizontalLineToRelative(1.553f)
                verticalLineToRelative(-8.32f)
                lineToRelative(-1.553f, -0.585f)
                close()
            }
        }
        .build()
        return _tildapublishing!!
    }

private var _tildapublishing: ImageVector? = null
