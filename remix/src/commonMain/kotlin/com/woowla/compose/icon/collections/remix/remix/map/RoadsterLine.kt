package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.RoadsterLine: ImageVector
    get() {
        if (_roadsterLine != null) {
            return _roadsterLine!!
        }
        _roadsterLine = Builder(name = "RoadsterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.552f, 4.552f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 22.0f, 2.0f, 21.552f, 2.0f, 21.0f)
                verticalLineTo(13.5f)
                lineTo(0.757f, 13.189f)
                curveTo(0.312f, 13.078f, 0.0f, 12.678f, 0.0f, 12.219f)
                verticalLineTo(11.5f)
                curveTo(0.0f, 11.224f, 0.224f, 11.0f, 0.5f, 11.0f)
                horizontalLineTo(2.0f)
                lineTo(4.481f, 5.212f)
                curveTo(4.796f, 4.477f, 5.519f, 4.0f, 6.319f, 4.0f)
                horizontalLineTo(17.681f)
                curveTo(18.481f, 4.0f, 19.204f, 4.477f, 19.52f, 5.212f)
                lineTo(22.0f, 11.0f)
                horizontalLineTo(23.5f)
                curveTo(23.776f, 11.0f, 24.0f, 11.224f, 24.0f, 11.5f)
                verticalLineTo(12.219f)
                curveTo(24.0f, 12.678f, 23.688f, 13.078f, 23.243f, 13.189f)
                lineTo(22.0f, 13.5f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.552f, 21.552f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.448f, 22.0f, 19.0f, 21.552f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(20.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(5.477f, 11.0f)
                horizontalLineTo(18.523f)
                curveTo(18.65f, 11.0f, 18.776f, 10.976f, 18.894f, 10.929f)
                curveTo(19.407f, 10.723f, 19.657f, 10.141f, 19.451f, 9.629f)
                lineTo(18.0f, 6.0f)
                horizontalLineTo(6.0f)
                lineTo(4.549f, 9.629f)
                curveTo(4.501f, 9.747f, 4.477f, 9.873f, 4.477f, 10.0f)
                curveTo(4.477f, 10.552f, 4.925f, 11.0f, 5.477f, 11.0f)
                close()
                moveTo(5.0f, 14.0f)
                curveTo(7.317f, 14.0f, 8.879f, 14.755f, 9.686f, 16.264f)
                lineTo(9.686f, 16.264f)
                curveTo(9.816f, 16.508f, 9.724f, 16.811f, 9.481f, 16.941f)
                curveTo(9.408f, 16.98f, 9.327f, 17.0f, 9.245f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 17.0f, 5.0f, 16.552f, 5.0f, 16.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(19.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 16.552f, 18.552f, 17.0f, 18.0f, 17.0f)
                horizontalLineTo(14.755f)
                curveTo(14.673f, 17.0f, 14.592f, 16.98f, 14.519f, 16.941f)
                curveTo(14.276f, 16.811f, 14.184f, 16.508f, 14.314f, 16.264f)
                lineTo(14.314f, 16.264f)
                curveTo(15.121f, 14.755f, 16.683f, 14.0f, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _roadsterLine!!
    }

private var _roadsterLine: ImageVector? = null
