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

public val SystemGroup.DeleteBack2Fill: ImageVector
    get() {
        if (_deleteBack2Fill != null) {
            return _deleteBack2Fill!!
        }
        _deleteBack2Fill = Builder(name = "DeleteBack2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.535f, 3.0f)
                horizontalLineTo(20.999f)
                curveTo(21.552f, 3.0f, 21.999f, 3.448f, 21.999f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.999f, 20.552f, 21.552f, 21.0f, 20.999f, 21.0f)
                horizontalLineTo(6.535f)
                curveTo(6.2f, 21.0f, 5.888f, 20.833f, 5.702f, 20.555f)
                lineTo(0.369f, 12.555f)
                curveTo(0.145f, 12.219f, 0.145f, 11.781f, 0.369f, 11.445f)
                lineTo(5.702f, 3.445f)
                curveTo(5.888f, 3.167f, 6.2f, 3.0f, 6.535f, 3.0f)
                close()
                moveTo(12.999f, 10.586f)
                lineTo(10.171f, 7.757f)
                lineTo(8.757f, 9.172f)
                lineTo(11.585f, 12.0f)
                lineTo(8.757f, 14.828f)
                lineTo(10.171f, 16.243f)
                lineTo(12.999f, 13.414f)
                lineTo(15.828f, 16.243f)
                lineTo(17.242f, 14.828f)
                lineTo(14.413f, 12.0f)
                lineTo(17.242f, 9.172f)
                lineTo(15.828f, 7.757f)
                lineTo(12.999f, 10.586f)
                close()
            }
        }
        .build()
        return _deleteBack2Fill!!
    }

private var _deleteBack2Fill: ImageVector? = null
