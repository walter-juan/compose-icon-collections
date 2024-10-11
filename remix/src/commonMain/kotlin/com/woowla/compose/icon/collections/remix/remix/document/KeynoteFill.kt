package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.KeynoteFill: ImageVector
    get() {
        if (_keynoteFill != null) {
            return _keynoteFill!!
        }
        _keynoteFill = Builder(name = "KeynoteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.999f, 2.0f)
                curveTo(19.552f, 2.0f, 20.086f, 2.43f, 20.195f, 2.977f)
                lineTo(21.805f, 11.023f)
                curveTo(21.913f, 11.563f, 21.545f, 12.0f, 21.008f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 12.0f, 2.086f, 11.57f, 2.195f, 11.023f)
                lineTo(3.805f, 2.977f)
                curveTo(3.913f, 2.437f, 4.445f, 2.0f, 5.001f, 2.0f)
                horizontalLineTo(18.999f)
                close()
            }
        }
        .build()
        return _keynoteFill!!
    }

private var _keynoteFill: ImageVector? = null
