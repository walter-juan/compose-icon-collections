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

public val ArrowsGroup.ArrowLeftUpLongFill: ImageVector
    get() {
        if (_arrowLeftUpLongFill != null) {
            return _arrowLeftUpLongFill!!
        }
        _arrowLeftUpLongFill = Builder(name = "ArrowLeftUpLongFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 19.778f)
                lineTo(19.778f, 18.364f)
                lineTo(10.172f, 8.757f)
                lineTo(14.0f, 4.929f)
                lineTo(4.929f, 4.929f)
                lineTo(4.929f, 14.0f)
                lineTo(8.757f, 10.172f)
                lineTo(18.364f, 19.778f)
                close()
            }
        }
        .build()
        return _arrowLeftUpLongFill!!
    }

private var _arrowLeftUpLongFill: ImageVector? = null
