package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.FilterOffLine: ImageVector
    get() {
        if (_filterOffLine != null) {
            return _filterOffLine!!
        }
        _filterOffLine = Builder(name = "FilterOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.929f, 0.515f)
                lineTo(21.071f, 14.657f)
                lineTo(19.657f, 16.071f)
                lineTo(15.834f, 12.249f)
                lineTo(15.0f, 13.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.5f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                lineTo(7.585f, 4.0f)
                lineTo(5.515f, 1.929f)
                lineTo(6.929f, 0.515f)
                close()
                moveTo(9.585f, 6.0f)
                lineTo(6.404f, 6.0f)
                lineTo(11.0f, 12.894f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.894f)
                lineTo(14.392f, 10.807f)
                lineTo(9.585f, 6.0f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                lineTo(18.085f, 8.872f)
                lineTo(16.643f, 7.429f)
                lineTo(17.596f, 6.0f)
                horizontalLineTo(15.213f)
                lineTo(13.213f, 4.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _filterOffLine!!
    }

private var _filterOffLine: ImageVector? = null
