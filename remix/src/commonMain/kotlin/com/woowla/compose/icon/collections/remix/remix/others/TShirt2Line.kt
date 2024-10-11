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

public val OthersGroup.TShirt2Line: ImageVector
    get() {
        if (_tShirt2Line != null) {
            return _tShirt2Line!!
        }
        _tShirt2Line = Builder(name = "TShirt2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.998f, 3.0f)
                curveTo(8.998f, 4.657f, 10.341f, 6.0f, 11.998f, 6.0f)
                curveTo(13.655f, 6.0f, 14.998f, 4.657f, 14.998f, 3.0f)
                horizontalLineTo(20.998f)
                curveTo(21.55f, 3.0f, 21.998f, 3.448f, 21.998f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(21.998f, 11.552f, 21.55f, 12.0f, 20.998f, 12.0f)
                horizontalLineTo(18.997f)
                lineTo(18.998f, 20.0f)
                curveTo(18.998f, 20.552f, 18.55f, 21.0f, 17.998f, 21.0f)
                horizontalLineTo(5.998f)
                curveTo(5.446f, 21.0f, 4.998f, 20.552f, 4.998f, 20.0f)
                lineTo(4.997f, 11.999f)
                lineTo(2.998f, 12.0f)
                curveTo(2.446f, 12.0f, 1.998f, 11.552f, 1.998f, 11.0f)
                verticalLineTo(4.0f)
                curveTo(1.998f, 3.448f, 2.446f, 3.0f, 2.998f, 3.0f)
                horizontalLineTo(8.998f)
                close()
                moveTo(19.998f, 4.999f)
                horizontalLineTo(16.581f)
                lineTo(16.564f, 5.04f)
                curveTo(15.811f, 6.722f, 14.157f, 7.913f, 12.215f, 7.995f)
                lineTo(11.998f, 8.0f)
                curveTo(9.963f, 8.0f, 8.212f, 6.785f, 7.432f, 5.04f)
                lineTo(7.414f, 4.999f)
                horizontalLineTo(3.998f)
                verticalLineTo(9.999f)
                lineTo(6.997f, 9.998f)
                lineTo(6.997f, 19.0f)
                horizontalLineTo(16.998f)
                lineTo(16.997f, 10.0f)
                lineTo(19.998f, 9.999f)
                verticalLineTo(4.999f)
                close()
            }
        }
        .build()
        return _tShirt2Line!!
    }

private var _tShirt2Line: ImageVector? = null
