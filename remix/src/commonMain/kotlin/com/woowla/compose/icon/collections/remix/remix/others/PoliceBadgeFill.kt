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

public val OthersGroup.PoliceBadgeFill: ImageVector
    get() {
        if (_policeBadgeFill != null) {
            return _policeBadgeFill!!
        }
        _policeBadgeFill = Builder(name = "PoliceBadgeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.913f, 11.674f)
                curveTo(3.236f, 10.195f, 3.539f, 8.808f, 2.0f, 6.5f)
                lineTo(5.5f, 2.5f)
                curveTo(5.5f, 2.5f, 9.0f, 4.0f, 12.0f, 1.5f)
                curveTo(15.0f, 4.0f, 18.5f, 2.5f, 18.5f, 2.5f)
                lineTo(22.0f, 6.5f)
                curveTo(20.461f, 8.808f, 20.764f, 10.195f, 21.087f, 11.674f)
                curveTo(21.393f, 13.078f, 21.718f, 14.564f, 20.5f, 17.0f)
                curveTo(19.343f, 19.315f, 17.348f, 20.123f, 15.485f, 20.877f)
                curveTo(14.129f, 21.426f, 12.843f, 21.947f, 12.0f, 23.0f)
                curveTo(11.158f, 21.947f, 9.872f, 21.426f, 8.515f, 20.877f)
                curveTo(6.652f, 20.123f, 4.658f, 19.315f, 3.5f, 17.0f)
                curveTo(2.282f, 14.564f, 2.607f, 13.078f, 2.913f, 11.674f)
                close()
                moveTo(14.378f, 12.773f)
                lineTo(16.755f, 10.455f)
                lineTo(13.469f, 9.977f)
                lineTo(12.0f, 7.0f)
                lineTo(10.53f, 9.977f)
                lineTo(7.245f, 10.455f)
                lineTo(9.622f, 12.773f)
                lineTo(9.061f, 16.045f)
                lineTo(12.0f, 14.5f)
                lineTo(14.939f, 16.045f)
                lineTo(14.378f, 12.773f)
                close()
            }
        }
        .build()
        return _policeBadgeFill!!
    }

private var _policeBadgeFill: ImageVector? = null
