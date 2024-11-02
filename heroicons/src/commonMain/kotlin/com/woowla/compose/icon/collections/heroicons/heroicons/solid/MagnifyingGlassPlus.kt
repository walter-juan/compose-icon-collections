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

public val SolidGroup.MagnifyingGlassPlus: ImageVector
    get() {
        if (_magnifyingGlassPlus != null) {
            return _magnifyingGlassPlus!!
        }
        _magnifyingGlassPlus = Builder(name = "MagnifyingGlassPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 3.75f)
                curveTo(6.772f, 3.75f, 3.75f, 6.772f, 3.75f, 10.5f)
                curveTo(3.75f, 14.228f, 6.772f, 17.25f, 10.5f, 17.25f)
                curveTo(12.364f, 17.25f, 14.051f, 16.495f, 15.273f, 15.273f)
                curveTo(16.495f, 14.051f, 17.25f, 12.364f, 17.25f, 10.5f)
                curveTo(17.25f, 6.772f, 14.228f, 3.75f, 10.5f, 3.75f)
                close()
                moveTo(2.25f, 10.5f)
                curveTo(2.25f, 5.944f, 5.944f, 2.25f, 10.5f, 2.25f)
                curveTo(15.056f, 2.25f, 18.75f, 5.944f, 18.75f, 10.5f)
                curveTo(18.75f, 12.508f, 18.032f, 14.349f, 16.84f, 15.779f)
                lineTo(21.53f, 20.47f)
                curveTo(21.823f, 20.763f, 21.823f, 21.237f, 21.53f, 21.53f)
                curveTo(21.237f, 21.823f, 20.763f, 21.823f, 20.47f, 21.53f)
                lineTo(15.779f, 16.84f)
                curveTo(14.349f, 18.032f, 12.508f, 18.75f, 10.5f, 18.75f)
                curveTo(5.944f, 18.75f, 2.25f, 15.056f, 2.25f, 10.5f)
                close()
                moveTo(10.5f, 6.75f)
                curveTo(10.914f, 6.75f, 11.25f, 7.086f, 11.25f, 7.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 9.75f, 14.25f, 10.086f, 14.25f, 10.5f)
                curveTo(14.25f, 10.914f, 13.914f, 11.25f, 13.5f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.5f)
                curveTo(11.25f, 13.914f, 10.914f, 14.25f, 10.5f, 14.25f)
                curveTo(10.086f, 14.25f, 9.75f, 13.914f, 9.75f, 13.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 11.25f, 6.75f, 10.914f, 6.75f, 10.5f)
                curveTo(6.75f, 10.086f, 7.086f, 9.75f, 7.5f, 9.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(7.5f)
                curveTo(9.75f, 7.086f, 10.086f, 6.75f, 10.5f, 6.75f)
                close()
            }
        }
        .build()
        return _magnifyingGlassPlus!!
    }

private var _magnifyingGlassPlus: ImageVector? = null
