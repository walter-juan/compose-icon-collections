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

public val OthersGroup.WheelchairFill: ImageVector
    get() {
        if (_wheelchairFill != null) {
            return _wheelchairFill!!
        }
        _wheelchairFill = Builder(name = "WheelchairFill", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(8.998f, 8.343f, 10.341f, 7.0f, 11.998f, 7.0f)
                curveTo(13.655f, 7.0f, 14.998f, 8.343f, 14.998f, 10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.432f)
                curveTo(17.08f, 15.0f, 17.685f, 15.314f, 18.058f, 15.836f)
                lineTo(18.147f, 15.971f)
                lineTo(20.855f, 20.486f)
                lineTo(19.141f, 21.514f)
                lineTo(16.432f, 17.0f)
                horizontalLineTo(11.998f)
                close()
                moveTo(11.998f, 2.0f)
                curveTo(13.379f, 2.0f, 14.498f, 3.119f, 14.498f, 4.5f)
                curveTo(14.498f, 5.881f, 13.379f, 7.0f, 11.998f, 7.0f)
                curveTo(10.617f, 7.0f, 9.498f, 5.881f, 9.498f, 4.5f)
                curveTo(9.498f, 3.119f, 10.617f, 2.0f, 11.998f, 2.0f)
                close()
            }
        }
        .build()
        return _wheelchairFill!!
    }

private var _wheelchairFill: ImageVector? = null
