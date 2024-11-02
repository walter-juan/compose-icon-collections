package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.CurrencyRupee: ImageVector
    get() {
        if (_currencyRupee != null) {
            return _currencyRupee!!
        }
        _currencyRupee = Builder(name = "CurrencyRupee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(9.0f, 7.5f)
                curveTo(8.586f, 7.5f, 8.25f, 7.836f, 8.25f, 8.25f)
                curveTo(8.25f, 8.664f, 8.586f, 9.0f, 9.0f, 9.0f)
                horizontalLineTo(10.5f)
                curveTo(11.48f, 9.0f, 12.313f, 9.626f, 12.622f, 10.5f)
                horizontalLineTo(9.0f)
                curveTo(8.586f, 10.5f, 8.25f, 10.836f, 8.25f, 11.25f)
                curveTo(8.25f, 11.664f, 8.586f, 12.0f, 9.0f, 12.0f)
                horizontalLineTo(12.622f)
                curveTo(12.313f, 12.874f, 11.48f, 13.5f, 10.5f, 13.5f)
                horizontalLineTo(9.0f)
                curveTo(8.697f, 13.5f, 8.423f, 13.683f, 8.307f, 13.963f)
                curveTo(8.191f, 14.243f, 8.255f, 14.566f, 8.47f, 14.78f)
                lineTo(11.47f, 17.78f)
                curveTo(11.763f, 18.073f, 12.237f, 18.073f, 12.53f, 17.78f)
                curveTo(12.823f, 17.487f, 12.823f, 17.013f, 12.53f, 16.72f)
                lineTo(10.799f, 14.988f)
                curveTo(12.479f, 14.856f, 13.847f, 13.617f, 14.175f, 12.0f)
                horizontalLineTo(15.0f)
                curveTo(15.414f, 12.0f, 15.75f, 11.664f, 15.75f, 11.25f)
                curveTo(15.75f, 10.836f, 15.414f, 10.5f, 15.0f, 10.5f)
                horizontalLineTo(14.175f)
                curveTo(14.063f, 9.946f, 13.828f, 9.436f, 13.5f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(15.414f, 9.0f, 15.75f, 8.664f, 15.75f, 8.25f)
                curveTo(15.75f, 7.836f, 15.414f, 7.5f, 15.0f, 7.5f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _currencyRupee!!
    }

private var _currencyRupee: ImageVector? = null
