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

public val SolidGroup.BarsArrowUp: ImageVector
    get() {
        if (_barsArrowUp != null) {
            return _barsArrowUp!!
        }
        _barsArrowUp = Builder(name = "BarsArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 4.5f)
                curveTo(2.25f, 4.086f, 2.586f, 3.75f, 3.0f, 3.75f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 3.75f, 18.0f, 4.086f, 18.0f, 4.5f)
                curveTo(18.0f, 4.914f, 17.664f, 5.25f, 17.25f, 5.25f)
                horizontalLineTo(3.0f)
                curveTo(2.586f, 5.25f, 2.25f, 4.914f, 2.25f, 4.5f)
                close()
                moveTo(16.72f, 8.47f)
                curveTo(17.013f, 8.177f, 17.487f, 8.177f, 17.78f, 8.47f)
                lineTo(21.53f, 12.22f)
                curveTo(21.823f, 12.513f, 21.823f, 12.987f, 21.53f, 13.28f)
                curveTo(21.237f, 13.573f, 20.763f, 13.573f, 20.47f, 13.28f)
                lineTo(18.0f, 10.811f)
                lineTo(18.0f, 21.0f)
                curveTo(18.0f, 21.414f, 17.664f, 21.75f, 17.25f, 21.75f)
                curveTo(16.836f, 21.75f, 16.5f, 21.414f, 16.5f, 21.0f)
                lineTo(16.5f, 10.811f)
                lineTo(14.03f, 13.28f)
                curveTo(13.737f, 13.573f, 13.263f, 13.573f, 12.97f, 13.28f)
                curveTo(12.677f, 12.987f, 12.677f, 12.513f, 12.97f, 12.22f)
                lineTo(16.72f, 8.47f)
                close()
                moveTo(2.25f, 9.0f)
                curveTo(2.25f, 8.586f, 2.586f, 8.25f, 3.0f, 8.25f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 8.25f, 13.5f, 8.586f, 13.5f, 9.0f)
                curveTo(13.5f, 9.414f, 13.164f, 9.75f, 12.75f, 9.75f)
                horizontalLineTo(3.0f)
                curveTo(2.586f, 9.75f, 2.25f, 9.414f, 2.25f, 9.0f)
                close()
                moveTo(2.25f, 13.5f)
                curveTo(2.25f, 13.086f, 2.586f, 12.75f, 3.0f, 12.75f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 12.75f, 9.0f, 13.086f, 9.0f, 13.5f)
                curveTo(9.0f, 13.914f, 8.664f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(3.0f)
                curveTo(2.586f, 14.25f, 2.25f, 13.914f, 2.25f, 13.5f)
                close()
            }
        }
        .build()
        return _barsArrowUp!!
    }

private var _barsArrowUp: ImageVector? = null
