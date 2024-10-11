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

public val DeviceGroup.MacFill: ImageVector
    get() {
        if (_macFill != null) {
            return _macFill!!
        }
        _macFill = Builder(name = "MacFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineTo(20.0f)
                lineTo(16.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                lineTo(7.996f, 21.004f)
                lineTo(10.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 18.0f, 2.0f, 17.551f, 2.0f, 16.993f)
                verticalLineTo(4.007f)
                curveTo(2.0f, 3.451f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.449f, 22.0f, 4.007f)
                verticalLineTo(16.993f)
                curveTo(22.0f, 17.549f, 21.545f, 18.0f, 21.008f, 18.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _macFill!!
    }

private var _macFill: ImageVector? = null
