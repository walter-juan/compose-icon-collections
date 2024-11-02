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

public val OutlineGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                verticalLineTo(4.5f)
                moveTo(3.0f, 21.0f)
                verticalLineTo(15.0f)
                moveTo(3.0f, 15.0f)
                lineTo(5.77f, 14.307f)
                curveTo(7.854f, 13.786f, 10.056f, 14.028f, 11.978f, 14.989f)
                lineTo(12.086f, 15.043f)
                curveTo(13.969f, 15.984f, 16.122f, 16.236f, 18.172f, 15.754f)
                lineTo(21.286f, 15.021f)
                curveTo(21.097f, 13.29f, 21.0f, 11.531f, 21.0f, 9.75f)
                curveTo(21.0f, 7.983f, 21.095f, 6.239f, 21.281f, 4.522f)
                lineTo(18.172f, 5.254f)
                curveTo(16.122f, 5.736f, 13.969f, 5.484f, 12.086f, 4.543f)
                lineTo(11.978f, 4.489f)
                curveTo(10.056f, 3.528f, 7.854f, 3.286f, 5.77f, 3.807f)
                lineTo(3.0f, 4.5f)
                moveTo(3.0f, 15.0f)
                verticalLineTo(4.5f)
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
