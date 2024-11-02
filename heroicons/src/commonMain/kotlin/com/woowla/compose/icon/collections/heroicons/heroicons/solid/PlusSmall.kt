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

public val SolidGroup.PlusSmall: ImageVector
    get() {
        if (_plusSmall != null) {
            return _plusSmall!!
        }
        _plusSmall = Builder(name = "PlusSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.25f)
                curveTo(12.414f, 5.25f, 12.75f, 5.586f, 12.75f, 6.0f)
                verticalLineTo(11.25f)
                lineTo(18.0f, 11.25f)
                curveTo(18.414f, 11.25f, 18.75f, 11.586f, 18.75f, 12.0f)
                curveTo(18.75f, 12.414f, 18.414f, 12.75f, 18.0f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.414f, 12.414f, 18.75f, 12.0f, 18.75f)
                curveTo(11.586f, 18.75f, 11.25f, 18.414f, 11.25f, 18.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(6.0f)
                curveTo(5.586f, 12.75f, 5.25f, 12.414f, 5.25f, 12.0f)
                curveTo(5.25f, 11.586f, 5.586f, 11.25f, 6.0f, 11.25f)
                lineTo(11.25f, 11.25f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 5.586f, 11.586f, 5.25f, 12.0f, 5.25f)
                close()
            }
        }
        .build()
        return _plusSmall!!
    }

private var _plusSmall: ImageVector? = null
