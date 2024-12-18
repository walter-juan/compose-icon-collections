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

public val ArrowsGroup.ArrowLeftDownLongLine: ImageVector
    get() {
        if (_arrowLeftDownLongLine != null) {
            return _arrowLeftDownLongLine!!
        }
        _arrowLeftDownLongLine = Builder(name = "ArrowLeftDownLongLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 5.636f)
                lineTo(18.364f, 4.222f)
                lineTo(6.929f, 15.657f)
                lineTo(6.929f, 10.071f)
                horizontalLineTo(4.929f)
                lineTo(4.929f, 19.071f)
                lineTo(13.929f, 19.071f)
                verticalLineTo(17.071f)
                lineTo(8.343f, 17.071f)
                lineTo(19.778f, 5.636f)
                close()
            }
        }
        .build()
        return _arrowLeftDownLongLine!!
    }

private var _arrowLeftDownLongLine: ImageVector? = null
