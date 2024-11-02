package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.74f, 9.0f)
                lineTo(14.394f, 18.0f)
                moveTo(9.606f, 18.0f)
                lineTo(9.26f, 9.0f)
                moveTo(19.228f, 5.791f)
                curveTo(19.57f, 5.842f, 19.91f, 5.897f, 20.25f, 5.956f)
                moveTo(19.228f, 5.791f)
                lineTo(18.16f, 19.673f)
                curveTo(18.07f, 20.845f, 17.092f, 21.75f, 15.916f, 21.75f)
                horizontalLineTo(8.084f)
                curveTo(6.908f, 21.75f, 5.93f, 20.845f, 5.84f, 19.673f)
                lineTo(4.772f, 5.791f)
                moveTo(19.228f, 5.791f)
                curveTo(18.081f, 5.617f, 16.921f, 5.485f, 15.75f, 5.394f)
                moveTo(3.75f, 5.956f)
                curveTo(4.09f, 5.897f, 4.43f, 5.842f, 4.772f, 5.791f)
                moveTo(4.772f, 5.791f)
                curveTo(5.919f, 5.617f, 7.078f, 5.485f, 8.25f, 5.394f)
                moveTo(15.75f, 5.394f)
                verticalLineTo(4.478f)
                curveTo(15.75f, 3.299f, 14.839f, 2.314f, 13.661f, 2.277f)
                curveTo(13.109f, 2.259f, 12.556f, 2.25f, 12.0f, 2.25f)
                curveTo(11.444f, 2.25f, 10.891f, 2.259f, 10.339f, 2.277f)
                curveTo(9.161f, 2.314f, 8.25f, 3.299f, 8.25f, 4.478f)
                verticalLineTo(5.394f)
                moveTo(15.75f, 5.394f)
                curveTo(14.513f, 5.299f, 13.262f, 5.25f, 12.0f, 5.25f)
                curveTo(10.738f, 5.25f, 9.487f, 5.299f, 8.25f, 5.394f)
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
