package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.ShirtFill: ImageVector
    get() {
        if (_shirtFill != null) {
            return _shirtFill!!
        }
        _shirtFill = Builder(name = "ShirtFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.998f, 4.0f)
                verticalLineTo(11.0f)
                lineTo(11.998f, 8.5f)
                lineTo(16.998f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.998f)
                curveTo(20.55f, 4.0f, 20.998f, 4.448f, 20.998f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(20.998f, 21.552f, 20.55f, 22.0f, 19.998f, 22.0f)
                horizontalLineTo(3.998f)
                curveTo(3.446f, 22.0f, 2.998f, 21.552f, 2.998f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(2.998f, 4.448f, 3.446f, 4.0f, 3.998f, 4.0f)
                horizontalLineTo(6.998f)
                close()
                moveTo(11.998f, 8.0f)
                lineTo(7.498f, 3.0f)
                horizontalLineTo(16.498f)
                lineTo(11.998f, 8.0f)
                close()
                moveTo(12.998f, 11.236f)
                lineTo(11.998f, 10.736f)
                lineTo(10.998f, 11.236f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(11.236f)
                close()
                moveTo(14.998f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.998f)
                close()
            }
        }
        .build()
        return _shirtFill!!
    }

private var _shirtFill: ImageVector? = null
