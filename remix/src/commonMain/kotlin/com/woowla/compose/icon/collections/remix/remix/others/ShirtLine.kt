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

public val OthersGroup.ShirtLine: ImageVector
    get() {
        if (_shirtLine != null) {
            return _shirtLine!!
        }
        _shirtLine = Builder(name = "ShirtLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.998f, 20.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.998f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.998f)
                verticalLineTo(11.0f)
                lineTo(12.998f, 9.4f)
                verticalLineTo(20.0f)
                close()
                moveTo(10.998f, 20.0f)
                verticalLineTo(9.4f)
                lineTo(6.998f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.998f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.998f)
                close()
                moveTo(6.998f, 4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.998f)
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
                lineTo(15.498f, 5.0f)
                horizontalLineTo(8.498f)
                lineTo(11.998f, 8.0f)
                close()
            }
        }
        .build()
        return _shirtLine!!
    }

private var _shirtLine: ImageVector? = null
