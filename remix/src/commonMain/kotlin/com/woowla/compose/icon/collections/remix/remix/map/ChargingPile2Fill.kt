package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.ChargingPile2Fill: ImageVector
    get() {
        if (_chargingPile2Fill != null) {
            return _chargingPile2Fill!!
        }
        _chargingPile2Fill = Builder(name = "ChargingPile2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.657f, 20.657f, 21.0f, 19.0f, 21.0f)
                curveTo(17.343f, 21.0f, 16.0f, 19.657f, 16.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 3.0f, 14.0f, 3.448f, 14.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 12.0f, 18.0f, 12.895f, 18.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 18.552f, 18.448f, 19.0f, 19.0f, 19.0f)
                curveTo(19.552f, 19.0f, 20.0f, 18.552f, 20.0f, 18.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(9.0f, 11.0f)
                verticalLineTo(7.0f)
                lineTo(5.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                lineTo(12.0f, 11.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _chargingPile2Fill!!
    }

private var _chargingPile2Fill: ImageVector? = null
