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

public val MediaGroup.StopLine: ImageVector
    get() {
        if (_stopLine != null) {
            return _stopLine!!
        }
        _stopLine = Builder(name = "StopLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 5.0f, 19.0f, 5.448f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.552f, 18.552f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 19.0f, 5.0f, 18.552f, 5.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.448f, 5.448f, 5.0f, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _stopLine!!
    }

private var _stopLine: ImageVector? = null
