package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ArrowLeftUpLongLine: ImageVector
    get() {
        if (_arrowLeftUpLongLine != null) {
            return _arrowLeftUpLongLine!!
        }
        _arrowLeftUpLongLine = Builder(name = "ArrowLeftUpLongLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 18.364f)
                lineTo(18.364f, 19.778f)
                lineTo(6.929f, 8.343f)
                verticalLineTo(13.929f)
                horizontalLineTo(4.929f)
                lineTo(4.929f, 4.929f)
                lineTo(13.929f, 4.929f)
                lineTo(13.929f, 6.929f)
                lineTo(8.343f, 6.929f)
                lineTo(19.778f, 18.364f)
                close()
            }
        }
        .build()
        return _arrowLeftUpLongLine!!
    }

private var _arrowLeftUpLongLine: ImageVector? = null
