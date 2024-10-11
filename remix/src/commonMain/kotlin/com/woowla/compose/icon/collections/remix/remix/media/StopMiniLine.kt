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

public val MediaGroup.StopMiniLine: ImageVector
    get() {
        if (_stopMiniLine != null) {
            return _stopMiniLine!!
        }
        _stopMiniLine = Builder(name = "StopMiniLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(6.0f, 6.448f, 6.448f, 6.0f, 7.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 6.0f, 18.0f, 6.448f, 18.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(18.0f, 17.552f, 17.552f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 18.0f, 6.0f, 17.552f, 6.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _stopMiniLine!!
    }

private var _stopMiniLine: ImageVector? = null
