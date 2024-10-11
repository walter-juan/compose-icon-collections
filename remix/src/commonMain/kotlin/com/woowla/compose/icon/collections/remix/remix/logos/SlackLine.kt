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

public val LogosGroup.SlackLine: ImageVector
    get() {
        if (_slackLine != null) {
            return _slackLine!!
        }
        _slackLine = Builder(name = "SlackLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.501f, 3.0f)
                curveTo(15.329f, 3.0f, 16.001f, 3.672f, 16.001f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(16.001f, 10.328f, 15.329f, 11.0f, 14.501f, 11.0f)
                curveTo(13.672f, 11.0f, 13.001f, 10.328f, 13.001f, 9.5f)
                verticalLineTo(4.5f)
                curveTo(13.001f, 3.672f, 13.672f, 3.0f, 14.501f, 3.0f)
                close()
                moveTo(4.501f, 13.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(14.5f)
                curveTo(6.001f, 15.328f, 5.329f, 16.0f, 4.501f, 16.0f)
                curveTo(3.673f, 16.0f, 3.001f, 15.328f, 3.001f, 14.5f)
                curveTo(3.001f, 13.672f, 3.673f, 13.0f, 4.501f, 13.0f)
                close()
                moveTo(13.001f, 18.0f)
                horizontalLineTo(14.501f)
                curveTo(15.329f, 18.0f, 16.001f, 18.672f, 16.001f, 19.5f)
                curveTo(16.001f, 20.328f, 15.329f, 21.0f, 14.501f, 21.0f)
                curveTo(13.672f, 21.0f, 13.001f, 20.328f, 13.001f, 19.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(14.501f, 13.0f)
                horizontalLineTo(19.501f)
                curveTo(20.329f, 13.0f, 21.001f, 13.672f, 21.001f, 14.5f)
                curveTo(21.001f, 15.328f, 20.329f, 16.0f, 19.501f, 16.0f)
                horizontalLineTo(14.501f)
                curveTo(13.672f, 16.0f, 13.001f, 15.328f, 13.001f, 14.5f)
                curveTo(13.001f, 13.672f, 13.672f, 13.0f, 14.501f, 13.0f)
                close()
                moveTo(19.501f, 8.0f)
                curveTo(20.329f, 8.0f, 21.001f, 8.672f, 21.001f, 9.5f)
                curveTo(21.001f, 10.328f, 20.329f, 11.0f, 19.501f, 11.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(9.5f)
                curveTo(18.001f, 8.672f, 18.673f, 8.0f, 19.501f, 8.0f)
                close()
                moveTo(4.501f, 8.0f)
                horizontalLineTo(9.501f)
                curveTo(10.329f, 8.0f, 11.001f, 8.672f, 11.001f, 9.5f)
                curveTo(11.001f, 10.328f, 10.329f, 11.0f, 9.501f, 11.0f)
                horizontalLineTo(4.501f)
                curveTo(3.673f, 11.0f, 3.001f, 10.328f, 3.001f, 9.5f)
                curveTo(3.001f, 8.672f, 3.673f, 8.0f, 4.501f, 8.0f)
                close()
                moveTo(9.501f, 3.0f)
                curveTo(10.329f, 3.0f, 11.001f, 3.672f, 11.001f, 4.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.501f)
                curveTo(8.673f, 6.0f, 8.001f, 5.328f, 8.001f, 4.5f)
                curveTo(8.001f, 3.672f, 8.673f, 3.0f, 9.501f, 3.0f)
                close()
                moveTo(9.501f, 13.0f)
                curveTo(10.329f, 13.0f, 11.001f, 13.672f, 11.001f, 14.5f)
                verticalLineTo(19.5f)
                curveTo(11.001f, 20.328f, 10.329f, 21.0f, 9.501f, 21.0f)
                curveTo(8.673f, 21.0f, 8.001f, 20.328f, 8.001f, 19.5f)
                verticalLineTo(14.5f)
                curveTo(8.001f, 13.672f, 8.673f, 13.0f, 9.501f, 13.0f)
                close()
            }
        }
        .build()
        return _slackLine!!
    }

private var _slackLine: ImageVector? = null
