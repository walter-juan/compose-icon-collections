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

public val MapGroup.ChinaRailwayLine: ImageVector
    get() {
        if (_chinaRailwayLine != null) {
            return _chinaRailwayLine!!
        }
        _chinaRailwayLine = Builder(name = "ChinaRailwayLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(10.0f, 2.223f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.223f)
                curveTo(18.008f, 3.132f, 21.0f, 6.717f, 21.0f, 11.0f)
                curveTo(21.0f, 14.123f, 19.409f, 16.875f, 16.993f, 18.489f)
                lineTo(15.883f, 16.825f)
                curveTo(17.762f, 15.57f, 19.0f, 13.429f, 19.0f, 11.0f)
                curveTo(19.0f, 7.134f, 15.866f, 4.0f, 12.0f, 4.0f)
                curveTo(8.134f, 4.0f, 5.0f, 7.134f, 5.0f, 11.0f)
                curveTo(5.0f, 13.429f, 6.238f, 15.57f, 8.117f, 16.825f)
                lineTo(7.007f, 18.489f)
                curveTo(4.591f, 16.875f, 3.0f, 14.123f, 3.0f, 11.0f)
                curveTo(3.0f, 6.717f, 5.992f, 3.132f, 10.0f, 2.223f)
                close()
            }
        }
        .build()
        return _chinaRailwayLine!!
    }

private var _chinaRailwayLine: ImageVector? = null
