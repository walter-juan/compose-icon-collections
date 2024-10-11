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

public val MapGroup.CaravanLine: ImageVector
    get() {
        if (_caravanLine != null) {
            return _caravanLine!!
        }
        _caravanLine = Builder(name = "CaravanLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.172f, 3.0f)
                curveTo(14.702f, 3.0f, 15.211f, 3.211f, 15.586f, 3.586f)
                lineTo(20.414f, 8.414f)
                curveTo(20.789f, 8.789f, 21.0f, 9.298f, 21.0f, 9.828f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                lineTo(14.874f, 19.001f)
                curveTo(14.429f, 20.726f, 12.864f, 22.0f, 11.0f, 22.0f)
                curveTo(9.136f, 22.0f, 7.571f, 20.726f, 7.126f, 19.001f)
                lineTo(3.0f, 19.0f)
                curveTo(2.448f, 19.0f, 2.0f, 18.552f, 2.0f, 18.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.895f, 2.895f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(14.172f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(9.895f, 16.0f, 9.0f, 16.895f, 9.0f, 18.0f)
                curveTo(9.0f, 19.105f, 9.895f, 20.0f, 11.0f, 20.0f)
                curveTo(12.105f, 20.0f, 13.0f, 19.105f, 13.0f, 18.0f)
                curveTo(13.0f, 16.895f, 12.105f, 16.0f, 11.0f, 16.0f)
                close()
                moveTo(14.172f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                lineTo(7.126f, 17.0f)
                curveTo(7.57f, 15.275f, 9.136f, 14.0f, 11.0f, 14.0f)
                curveTo(12.864f, 14.0f, 14.43f, 15.275f, 14.874f, 17.0f)
                lineTo(19.0f, 17.0f)
                verticalLineTo(9.828f)
                lineTo(14.172f, 5.0f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(12.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _caravanLine!!
    }

private var _caravanLine: ImageVector? = null
