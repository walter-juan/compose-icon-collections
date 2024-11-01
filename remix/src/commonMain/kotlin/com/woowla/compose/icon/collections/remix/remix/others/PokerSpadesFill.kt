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

public val OthersGroup.PokerSpadesFill: ImageVector
    get() {
        if (_pokerSpadesFill != null) {
            return _pokerSpadesFill!!
        }
        _pokerSpadesFill = Builder(name = "PokerSpadesFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.951f, 15.893f)
                curveTo(10.008f, 16.586f, 8.807f, 17.0f, 7.5f, 17.0f)
                curveTo(4.462f, 17.0f, 2.0f, 14.761f, 2.0f, 12.0f)
                curveTo(2.0f, 8.452f, 5.525f, 5.911f, 8.644f, 3.662f)
                curveTo(9.92f, 2.742f, 11.129f, 1.871f, 12.0f, 1.0f)
                curveTo(12.871f, 1.871f, 14.08f, 2.742f, 15.356f, 3.662f)
                curveTo(18.475f, 5.911f, 22.0f, 8.452f, 22.0f, 12.0f)
                curveTo(22.0f, 14.761f, 19.538f, 17.0f, 16.5f, 17.0f)
                curveTo(15.193f, 17.0f, 13.992f, 16.586f, 13.049f, 15.893f)
                curveTo(13.333f, 17.539f, 14.058f, 18.713f, 14.843f, 19.985f)
                curveTo(14.965f, 20.183f, 15.088f, 20.383f, 15.212f, 20.587f)
                curveTo(15.596f, 21.223f, 15.125f, 22.0f, 14.382f, 22.0f)
                horizontalLineTo(9.618f)
                curveTo(8.875f, 22.0f, 8.404f, 21.223f, 8.788f, 20.587f)
                curveTo(8.912f, 20.383f, 9.035f, 20.183f, 9.157f, 19.985f)
                curveTo(9.942f, 18.713f, 10.667f, 17.539f, 10.951f, 15.893f)
                close()
            }
        }
        .build()
        return _pokerSpadesFill!!
    }

private var _pokerSpadesFill: ImageVector? = null
