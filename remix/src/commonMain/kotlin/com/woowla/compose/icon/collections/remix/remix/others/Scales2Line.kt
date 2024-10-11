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

public val OthersGroup.Scales2Line: ImageVector
    get() {
        if (_scales2Line != null) {
            return _scales2Line!!
        }
        _scales2Line = Builder(name = "Scales2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.998f, 2.0f)
                curveTo(5.998f, 2.513f, 6.488f, 3.0f, 6.998f, 3.0f)
                horizontalLineTo(16.998f)
                curveTo(17.511f, 3.0f, 17.998f, 2.51f, 17.998f, 2.0f)
                horizontalLineTo(19.998f)
                curveTo(19.998f, 3.657f, 18.655f, 5.0f, 16.998f, 5.0f)
                horizontalLineTo(12.998f)
                lineTo(12.999f, 7.062f)
                curveTo(16.945f, 7.555f, 19.998f, 10.921f, 19.998f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(19.998f, 21.552f, 19.55f, 22.0f, 18.998f, 22.0f)
                horizontalLineTo(4.998f)
                curveTo(4.446f, 22.0f, 3.998f, 21.552f, 3.998f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(3.998f, 10.92f, 7.052f, 7.554f, 10.998f, 7.062f)
                lineTo(10.998f, 5.0f)
                horizontalLineTo(6.998f)
                curveTo(5.338f, 5.0f, 3.998f, 3.66f, 3.998f, 2.0f)
                horizontalLineTo(5.998f)
                close()
                moveTo(11.998f, 9.0f)
                curveTo(8.76f, 9.0f, 5.998f, 11.76f, 5.998f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(15.0f)
                curveTo(17.998f, 11.762f, 15.236f, 9.0f, 11.998f, 9.0f)
                close()
                moveTo(11.998f, 11.0f)
                curveTo(12.74f, 11.0f, 13.434f, 11.202f, 14.03f, 11.554f)
                lineTo(11.291f, 14.293f)
                curveTo(10.9f, 14.683f, 10.9f, 15.317f, 11.291f, 15.707f)
                curveTo(11.651f, 16.068f, 12.219f, 16.095f, 12.611f, 15.79f)
                lineTo(12.705f, 15.707f)
                lineTo(15.444f, 12.968f)
                curveTo(15.796f, 13.564f, 15.998f, 14.258f, 15.998f, 15.0f)
                curveTo(15.998f, 17.209f, 14.207f, 19.0f, 11.998f, 19.0f)
                curveTo(9.789f, 19.0f, 7.998f, 17.209f, 7.998f, 15.0f)
                curveTo(7.998f, 12.791f, 9.789f, 11.0f, 11.998f, 11.0f)
                close()
            }
        }
        .build()
        return _scales2Line!!
    }

private var _scales2Line: ImageVector? = null
