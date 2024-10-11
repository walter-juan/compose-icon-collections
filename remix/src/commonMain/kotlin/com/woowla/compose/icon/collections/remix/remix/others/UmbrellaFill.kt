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

public val OthersGroup.UmbrellaFill: ImageVector
    get() {
        if (_umbrellaFill != null) {
            return _umbrellaFill!!
        }
        _umbrellaFill = Builder(name = "UmbrellaFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.998f, 2.049f)
                curveTo(18.051f, 2.551f, 21.998f, 6.815f, 21.998f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(19.0f)
                curveTo(12.998f, 20.105f, 13.894f, 21.0f, 14.998f, 21.0f)
                curveTo(16.103f, 21.0f, 16.998f, 20.105f, 16.998f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(19.0f)
                curveTo(18.998f, 21.209f, 17.207f, 23.0f, 14.998f, 23.0f)
                curveTo(12.789f, 23.0f, 10.998f, 21.209f, 10.998f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.998f)
                verticalLineTo(12.0f)
                curveTo(1.998f, 6.815f, 5.945f, 2.551f, 10.998f, 2.049f)
                verticalLineTo(2.0f)
                curveTo(10.998f, 1.448f, 11.446f, 1.0f, 11.998f, 1.0f)
                curveTo(12.55f, 1.0f, 12.998f, 1.448f, 12.998f, 2.0f)
                verticalLineTo(2.049f)
                close()
            }
        }
        .build()
        return _umbrellaFill!!
    }

private var _umbrellaFill: ImageVector? = null
