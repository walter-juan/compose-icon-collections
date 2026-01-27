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

public val LogosGroup.SubredditFill: ImageVector
    get() {
        if (_subredditFill != null) {
            return _subredditFill!!
        }
        _subredditFill = Builder(name = "SubredditFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.994f, 2.0f, 15.849f, 2.585f, 17.409f, 3.591f)
                lineTo(12.027f, 16.211f)
                horizontalLineTo(14.2f)
                lineTo(19.016f, 4.876f)
                curveTo(20.857f, 6.69f, 22.0f, 9.211f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.188f, 7.788f)
                curveTo(11.677f, 7.779f, 11.174f, 7.907f, 10.731f, 8.16f)
                curveTo(10.308f, 8.408f, 9.957f, 8.723f, 9.678f, 9.105f)
                horizontalLineTo(9.639f)
                verticalLineTo(7.912f)
                horizontalLineTo(7.555f)
                verticalLineTo(16.211f)
                horizontalLineTo(9.693f)
                verticalLineTo(11.811f)
                curveTo(9.693f, 11.403f, 9.788f, 11.051f, 9.98f, 10.757f)
                curveTo(10.158f, 10.475f, 10.408f, 10.246f, 10.704f, 10.095f)
                curveTo(10.996f, 9.947f, 11.292f, 9.873f, 11.592f, 9.873f)
                lineTo(11.591f, 9.872f)
                curveTo(11.721f, 9.872f, 11.851f, 9.884f, 11.979f, 9.908f)
                curveTo(12.073f, 9.92f, 12.165f, 9.947f, 12.25f, 9.989f)
                lineTo(13.11f, 7.936f)
                curveTo(13.027f, 7.899f, 12.9f, 7.866f, 12.731f, 7.835f)
                curveTo(12.561f, 7.804f, 12.379f, 7.788f, 12.188f, 7.788f)
                close()
            }
        }
        .build()
        return _subredditFill!!
    }

private var _subredditFill: ImageVector? = null
