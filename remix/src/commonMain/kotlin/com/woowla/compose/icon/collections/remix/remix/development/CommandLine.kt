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

public val DevelopmentGroup.CommandLine: ImageVector
    get() {
        if (_commandLine != null) {
            return _commandLine!!
        }
        _commandLine = Builder(name = "CommandLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.5f)
                curveTo(14.0f, 4.567f, 15.567f, 3.0f, 17.5f, 3.0f)
                curveTo(19.433f, 3.0f, 21.0f, 4.567f, 21.0f, 6.5f)
                curveTo(21.0f, 8.433f, 19.433f, 10.0f, 17.5f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 14.0f, 21.0f, 15.567f, 21.0f, 17.5f)
                curveTo(21.0f, 19.433f, 19.433f, 21.0f, 17.5f, 21.0f)
                curveTo(15.567f, 21.0f, 14.0f, 19.433f, 14.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.5f)
                curveTo(10.0f, 19.433f, 8.433f, 21.0f, 6.5f, 21.0f)
                curveTo(4.567f, 21.0f, 3.0f, 19.433f, 3.0f, 17.5f)
                curveTo(3.0f, 15.567f, 4.567f, 14.0f, 6.5f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 10.0f, 3.0f, 8.433f, 3.0f, 6.5f)
                curveTo(3.0f, 4.567f, 4.567f, 3.0f, 6.5f, 3.0f)
                curveTo(8.433f, 3.0f, 10.0f, 4.567f, 10.0f, 6.5f)
                verticalLineTo(8.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(6.5f)
                curveTo(8.0f, 5.672f, 7.328f, 5.0f, 6.5f, 5.0f)
                curveTo(5.672f, 5.0f, 5.0f, 5.672f, 5.0f, 6.5f)
                curveTo(5.0f, 7.328f, 5.672f, 8.0f, 6.5f, 8.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 16.0f, 5.0f, 16.672f, 5.0f, 17.5f)
                curveTo(5.0f, 18.328f, 5.672f, 19.0f, 6.5f, 19.0f)
                curveTo(7.328f, 19.0f, 8.0f, 18.328f, 8.0f, 17.5f)
                verticalLineTo(16.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 8.0f, 19.0f, 7.328f, 19.0f, 6.5f)
                curveTo(19.0f, 5.672f, 18.328f, 5.0f, 17.5f, 5.0f)
                curveTo(16.672f, 5.0f, 16.0f, 5.672f, 16.0f, 6.5f)
                verticalLineTo(8.0f)
                close()
                moveTo(16.0f, 16.0f)
                verticalLineTo(17.5f)
                curveTo(16.0f, 18.328f, 16.672f, 19.0f, 17.5f, 19.0f)
                curveTo(18.328f, 19.0f, 19.0f, 18.328f, 19.0f, 17.5f)
                curveTo(19.0f, 16.672f, 18.328f, 16.0f, 17.5f, 16.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(10.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _commandLine!!
    }

private var _commandLine: ImageVector? = null
