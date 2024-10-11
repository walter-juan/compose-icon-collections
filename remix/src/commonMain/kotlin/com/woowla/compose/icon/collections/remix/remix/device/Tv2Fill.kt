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

public val DeviceGroup.Tv2Fill: ImageVector
    get() {
        if (_tv2Fill != null) {
            return _tv2Fill!!
        }
        _tv2Fill = Builder(name = "Tv2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.001f)
                curveTo(2.0f, 3.448f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 4.001f)
                verticalLineTo(17.999f)
                curveTo(22.0f, 18.552f, 21.545f, 19.0f, 21.008f, 19.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 19.0f, 2.0f, 18.555f, 2.0f, 17.999f)
                verticalLineTo(4.001f)
                close()
                moveTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _tv2Fill!!
    }

private var _tv2Fill: ImageVector? = null
