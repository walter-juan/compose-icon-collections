package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.HeadphoneLine: ImageVector
    get() {
        if (_headphoneLine != null) {
            return _headphoneLine!!
        }
        _headphoneLine = Builder(name = "HeadphoneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                horizontalLineTo(7.0f)
                curveTo(8.105f, 12.0f, 9.0f, 12.895f, 9.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 20.105f, 8.105f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 21.0f, 2.0f, 20.105f, 2.0f, 19.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.105f, 21.105f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(15.895f, 21.0f, 15.0f, 20.105f, 15.0f, 19.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 12.895f, 15.895f, 12.0f, 17.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(17.0f, 14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _headphoneLine!!
    }

private var _headphoneLine: ImageVector? = null
