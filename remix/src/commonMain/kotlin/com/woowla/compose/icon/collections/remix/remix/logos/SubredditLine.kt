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

public val LogosGroup.SubredditLine: ImageVector
    get() {
        if (_subredditLine != null) {
            return _subredditLine!!
        }
        _subredditLine = Builder(name = "SubredditLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.592f, 9.873f)
                curveTo(11.292f, 9.873f, 10.997f, 9.947f, 10.704f, 10.094f)
                curveTo(10.408f, 10.246f, 10.158f, 10.475f, 9.98f, 10.757f)
                curveTo(9.788f, 11.051f, 9.693f, 11.402f, 9.693f, 11.81f)
                verticalLineTo(16.211f)
                horizontalLineTo(7.554f)
                verticalLineTo(7.912f)
                horizontalLineTo(9.639f)
                verticalLineTo(9.106f)
                horizontalLineTo(9.678f)
                curveTo(9.957f, 8.723f, 10.308f, 8.408f, 10.731f, 8.16f)
                curveTo(11.174f, 7.907f, 11.677f, 7.778f, 12.188f, 7.788f)
                curveTo(12.379f, 7.788f, 12.56f, 7.803f, 12.73f, 7.834f)
                curveTo(12.9f, 7.866f, 13.027f, 7.899f, 13.11f, 7.936f)
                lineTo(12.25f, 9.989f)
                curveTo(12.165f, 9.947f, 12.073f, 9.92f, 11.979f, 9.908f)
                curveTo(11.851f, 9.884f, 11.721f, 9.872f, 11.591f, 9.872f)
                lineTo(11.592f, 9.873f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 14.652f, 20.946f, 17.196f, 19.071f, 19.071f)
                curveTo(17.196f, 20.946f, 14.652f, 22.0f, 12.0f, 22.0f)
                curveTo(9.348f, 22.0f, 6.804f, 20.946f, 4.929f, 19.071f)
                curveTo(3.054f, 17.196f, 2.0f, 14.652f, 2.0f, 12.0f)
                curveTo(2.0f, 9.348f, 3.054f, 6.804f, 4.929f, 4.929f)
                curveTo(6.804f, 3.054f, 9.348f, 2.0f, 12.0f, 2.0f)
                curveTo(14.652f, 2.0f, 17.196f, 3.054f, 19.071f, 4.929f)
                curveTo(20.946f, 6.804f, 22.0f, 9.348f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.001f, 10.135f, 19.348f, 8.329f, 18.154f, 6.896f)
                lineTo(14.2f, 16.211f)
                horizontalLineTo(12.028f)
                lineTo(16.592f, 5.459f)
                curveTo(15.249f, 4.509f, 13.645f, 3.999f, 12.0f, 4.0f)
                curveTo(7.589f, 4.0f, 4.0f, 7.589f, 4.0f, 12.0f)
                curveTo(4.0f, 16.411f, 7.589f, 20.0f, 12.0f, 20.0f)
                curveTo(16.411f, 20.0f, 20.0f, 16.411f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _subredditLine!!
    }

private var _subredditLine: ImageVector? = null
