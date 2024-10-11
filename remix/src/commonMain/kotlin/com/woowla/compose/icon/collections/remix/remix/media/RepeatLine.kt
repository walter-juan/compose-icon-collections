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

public val MediaGroup.RepeatLine: ImageVector
    get() {
        if (_repeatLine != null) {
            return _repeatLine!!
        }
        _repeatLine = Builder(name = "RepeatLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 4.0f, 22.0f, 4.448f, 22.0f, 5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                lineTo(1.0f, 5.0f)
                lineTo(6.0f, 1.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 20.0f, 2.0f, 19.552f, 2.0f, 19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                lineTo(23.0f, 19.0f)
                lineTo(18.0f, 23.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _repeatLine!!
    }

private var _repeatLine: ImageVector? = null
