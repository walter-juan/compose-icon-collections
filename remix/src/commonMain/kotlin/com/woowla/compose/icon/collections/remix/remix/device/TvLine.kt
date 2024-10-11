package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.TvLine: ImageVector
    get() {
        if (_tvLine != null) {
            return _tvLine!!
        }
        _tvLine = Builder(name = "TvLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.414f, 5.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 5.0f, 22.0f, 5.445f, 22.0f, 6.001f)
                verticalLineTo(19.999f)
                curveTo(22.0f, 20.552f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 19.999f)
                verticalLineTo(6.001f)
                curveTo(2.0f, 5.448f, 2.455f, 5.0f, 2.992f, 5.0f)
                horizontalLineTo(8.586f)
                lineTo(6.05f, 2.464f)
                lineTo(7.464f, 1.05f)
                lineTo(11.414f, 5.0f)
                horizontalLineTo(12.586f)
                lineTo(16.535f, 1.05f)
                lineTo(17.95f, 2.464f)
                lineTo(15.414f, 5.0f)
                close()
                moveTo(4.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _tvLine!!
    }

private var _tvLine: ImageVector? = null
