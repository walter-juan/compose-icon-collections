package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.BehanceLine: ImageVector
    get() {
        if (_behanceLine != null) {
            return _behanceLine!!
        }
        _behanceLine = Builder(name = "BehanceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 11.0f)
                curveTo(8.605f, 11.0f, 9.5f, 10.105f, 9.5f, 9.0f)
                curveTo(9.5f, 7.895f, 8.605f, 7.0f, 7.5f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(8.5f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.5f)
                curveTo(9.605f, 17.0f, 10.5f, 16.105f, 10.5f, 15.0f)
                curveTo(10.5f, 13.895f, 9.605f, 13.0f, 8.5f, 13.0f)
                close()
                moveTo(10.563f, 11.573f)
                curveTo(11.724f, 12.273f, 12.5f, 13.546f, 12.5f, 15.0f)
                curveTo(12.5f, 17.209f, 10.709f, 19.0f, 8.5f, 19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.5f)
                curveTo(9.709f, 5.0f, 11.5f, 6.791f, 11.5f, 9.0f)
                curveTo(11.5f, 9.98f, 11.148f, 10.877f, 10.563f, 11.573f)
                close()
                moveTo(15.5f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(6.0f)
                close()
                moveTo(23.0f, 14.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.75f)
                curveTo(15.5f, 16.269f, 16.731f, 17.5f, 18.25f, 17.5f)
                curveTo(19.319f, 17.5f, 20.245f, 16.89f, 20.7f, 16.0f)
                horizontalLineTo(22.834f)
                curveTo(22.285f, 18.017f, 20.441f, 19.5f, 18.25f, 19.5f)
                curveTo(15.627f, 19.5f, 13.5f, 17.373f, 13.5f, 14.75f)
                verticalLineTo(13.25f)
                curveTo(13.5f, 10.627f, 15.627f, 8.5f, 18.25f, 8.5f)
                curveTo(20.873f, 8.5f, 23.0f, 10.627f, 23.0f, 13.25f)
                verticalLineTo(14.5f)
                close()
                moveTo(20.896f, 12.5f)
                curveTo(20.57f, 11.346f, 19.509f, 10.5f, 18.25f, 10.5f)
                curveTo(16.991f, 10.5f, 15.93f, 11.346f, 15.604f, 12.5f)
                horizontalLineTo(20.896f)
                close()
            }
        }
        .build()
        return _behanceLine!!
    }

private var _behanceLine: ImageVector? = null
