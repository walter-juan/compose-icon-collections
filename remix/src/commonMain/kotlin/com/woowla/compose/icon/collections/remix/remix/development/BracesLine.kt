package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.BracesLine: ImageVector
    get() {
        if (_bracesLine != null) {
            return _bracesLine!!
        }
        _bracesLine = Builder(name = "BracesLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                verticalLineTo(14.3f)
                curveTo(4.0f, 13.472f, 3.328f, 12.8f, 2.5f, 12.8f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.2f)
                horizontalLineTo(2.5f)
                curveTo(3.328f, 11.2f, 4.0f, 10.528f, 4.0f, 9.7f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 4.343f, 5.343f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 5.0f, 6.0f, 5.448f, 6.0f, 6.0f)
                verticalLineTo(10.1f)
                curveTo(6.0f, 10.986f, 5.424f, 11.737f, 4.626f, 12.0f)
                curveTo(5.424f, 12.263f, 6.0f, 13.014f, 6.0f, 13.9f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 18.552f, 6.448f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                curveTo(5.343f, 21.0f, 4.0f, 19.657f, 4.0f, 18.0f)
                close()
                moveTo(20.0f, 14.3f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 19.657f, 18.657f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 19.0f, 18.0f, 18.552f, 18.0f, 18.0f)
                verticalLineTo(13.9f)
                curveTo(18.0f, 13.014f, 18.576f, 12.263f, 19.374f, 12.0f)
                curveTo(18.576f, 11.737f, 18.0f, 10.986f, 18.0f, 10.1f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 5.448f, 17.552f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                curveTo(18.657f, 3.0f, 20.0f, 4.343f, 20.0f, 6.0f)
                verticalLineTo(9.7f)
                curveTo(20.0f, 10.528f, 20.672f, 11.2f, 21.5f, 11.2f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.8f)
                horizontalLineTo(21.5f)
                curveTo(20.672f, 12.8f, 20.0f, 13.472f, 20.0f, 14.3f)
                close()
            }
        }
        .build()
        return _bracesLine!!
    }

private var _bracesLine: ImageVector? = null
