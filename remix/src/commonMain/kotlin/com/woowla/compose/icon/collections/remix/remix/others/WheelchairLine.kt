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

public val OthersGroup.WheelchairLine: ImageVector
    get() {
        if (_wheelchairLine != null) {
            return _wheelchairLine!!
        }
        _wheelchairLine = Builder(name = "WheelchairLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.998f, 10.341f)
                lineTo(7.998f, 12.535f)
                curveTo(6.802f, 13.227f, 5.998f, 14.519f, 5.998f, 16.0f)
                curveTo(5.998f, 18.209f, 7.789f, 20.0f, 9.998f, 20.0f)
                curveTo(11.479f, 20.0f, 12.771f, 19.196f, 13.463f, 18.0f)
                lineTo(15.656f, 18.0f)
                curveTo(14.833f, 20.331f, 12.61f, 22.0f, 9.998f, 22.0f)
                curveTo(6.684f, 22.0f, 3.998f, 19.314f, 3.998f, 16.0f)
                curveTo(3.998f, 13.387f, 5.668f, 11.165f, 7.998f, 10.341f)
                close()
                moveTo(11.998f, 17.0f)
                curveTo(10.341f, 17.0f, 8.998f, 15.657f, 8.998f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(8.998f, 8.956f, 9.532f, 8.036f, 10.341f, 7.499f)
                curveTo(9.532f, 6.964f, 8.998f, 6.044f, 8.998f, 5.0f)
                curveTo(8.998f, 3.343f, 10.341f, 2.0f, 11.998f, 2.0f)
                curveTo(13.655f, 2.0f, 14.998f, 3.343f, 14.998f, 5.0f)
                curveTo(14.998f, 6.044f, 14.464f, 6.964f, 13.655f, 7.501f)
                curveTo(14.464f, 8.036f, 14.998f, 8.956f, 14.998f, 10.0f)
                verticalLineTo(14.999f)
                lineTo(16.432f, 15.0f)
                curveTo(17.08f, 15.0f, 17.685f, 15.314f, 18.058f, 15.836f)
                lineTo(18.147f, 15.971f)
                lineTo(20.855f, 20.486f)
                lineTo(19.141f, 21.514f)
                lineTo(16.432f, 17.0f)
                lineTo(14.998f, 16.999f)
                lineTo(11.998f, 17.0f)
                close()
                moveTo(11.998f, 9.0f)
                curveTo(11.446f, 9.0f, 10.998f, 9.448f, 10.998f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(10.998f, 14.552f, 11.446f, 15.0f, 11.998f, 15.0f)
                horizontalLineTo(12.997f)
                lineTo(12.998f, 10.0f)
                curveTo(12.998f, 9.448f, 12.55f, 9.0f, 11.998f, 9.0f)
                close()
                moveTo(11.998f, 4.0f)
                curveTo(11.446f, 4.0f, 10.998f, 4.448f, 10.998f, 5.0f)
                curveTo(10.998f, 5.552f, 11.446f, 6.0f, 11.998f, 6.0f)
                curveTo(12.55f, 6.0f, 12.998f, 5.552f, 12.998f, 5.0f)
                curveTo(12.998f, 4.448f, 12.55f, 4.0f, 11.998f, 4.0f)
                close()
            }
        }
        .build()
        return _wheelchairLine!!
    }

private var _wheelchairLine: ImageVector? = null
