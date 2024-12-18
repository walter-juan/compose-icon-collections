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

public val ArrowsGroup.ArrowLeftDownLongFill: ImageVector
    get() {
        if (_arrowLeftDownLongFill != null) {
            return _arrowLeftDownLongFill!!
        }
        _arrowLeftDownLongFill = Builder(name = "ArrowLeftDownLongFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 5.636f)
                lineTo(18.364f, 4.222f)
                lineTo(8.757f, 13.828f)
                lineTo(4.929f, 10.0f)
                lineTo(4.929f, 19.071f)
                lineTo(14.0f, 19.071f)
                lineTo(10.172f, 15.243f)
                lineTo(19.778f, 5.636f)
                close()
            }
        }
        .build()
        return _arrowLeftDownLongFill!!
    }

private var _arrowLeftDownLongFill: ImageVector? = null
