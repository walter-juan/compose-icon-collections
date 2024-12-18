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

public val ArrowsGroup.ArrowRightUpLongFill: ImageVector
    get() {
        if (_arrowRightUpLongFill != null) {
            return _arrowRightUpLongFill!!
        }
        _arrowRightUpLongFill = Builder(name = "ArrowRightUpLongFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.222f, 18.364f)
                lineTo(5.636f, 19.778f)
                lineTo(15.243f, 10.172f)
                lineTo(19.071f, 14.0f)
                lineTo(19.071f, 4.929f)
                lineTo(10.0f, 4.929f)
                lineTo(13.828f, 8.757f)
                lineTo(4.222f, 18.364f)
                close()
            }
        }
        .build()
        return _arrowRightUpLongFill!!
    }

private var _arrowRightUpLongFill: ImageVector? = null
