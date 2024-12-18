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

public val ArrowsGroup.ArrowRightUpLongLine: ImageVector
    get() {
        if (_arrowRightUpLongLine != null) {
            return _arrowRightUpLongLine!!
        }
        _arrowRightUpLongLine = Builder(name = "ArrowRightUpLongLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 19.778f)
                lineTo(4.222f, 18.364f)
                lineTo(15.657f, 6.929f)
                lineTo(10.071f, 6.929f)
                verticalLineTo(4.929f)
                lineTo(19.071f, 4.929f)
                lineTo(19.071f, 13.929f)
                horizontalLineTo(17.071f)
                lineTo(17.071f, 8.343f)
                lineTo(5.636f, 19.778f)
                close()
            }
        }
        .build()
        return _arrowRightUpLongLine!!
    }

private var _arrowRightUpLongLine: ImageVector? = null
