package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.Building2Fill: ImageVector
    get() {
        if (_building2Fill != null) {
            return _building2Fill!!
        }
        _building2Fill = Builder(name = "Building2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                lineTo(20.394f, 8.74f)
                curveTo(20.762f, 8.898f, 21.0f, 9.259f, 21.0f, 9.659f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.65f)
                curveTo(3.0f, 5.255f, 3.233f, 4.897f, 3.594f, 4.736f)
                lineTo(11.297f, 1.313f)
                curveTo(11.549f, 1.2f, 11.845f, 1.314f, 11.957f, 1.566f)
                curveTo(11.985f, 1.63f, 12.0f, 1.699f, 12.0f, 1.769f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _building2Fill!!
    }

private var _building2Fill: ImageVector? = null
