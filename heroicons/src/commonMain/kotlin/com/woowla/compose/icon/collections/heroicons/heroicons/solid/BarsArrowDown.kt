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

public val SolidGroup.BarsArrowDown: ImageVector
    get() {
        if (_barsArrowDown != null) {
            return _barsArrowDown!!
        }
        _barsArrowDown = Builder(name = "BarsArrowDown", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(2.25f, 9.0f)
                curveTo(2.25f, 8.586f, 2.586f, 8.25f, 3.0f, 8.25f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 8.25f, 13.5f, 8.586f, 13.5f, 9.0f)
                curveTo(13.5f, 9.414f, 13.164f, 9.75f, 12.75f, 9.75f)
                horizontalLineTo(3.0f)
                curveTo(2.586f, 9.75f, 2.25f, 9.414f, 2.25f, 9.0f)
                close()
                moveTo(17.25f, 8.25f)
                curveTo(17.664f, 8.25f, 18.0f, 8.586f, 18.0f, 9.0f)
                verticalLineTo(19.189f)
                lineTo(20.47f, 16.72f)
                curveTo(20.763f, 16.427f, 21.237f, 16.427f, 21.53f, 16.72f)
                curveTo(21.823f, 17.013f, 21.823f, 17.487f, 21.53f, 17.78f)
                lineTo(17.78f, 21.53f)
                curveTo(17.487f, 21.823f, 17.013f, 21.823f, 16.72f, 21.53f)
                lineTo(12.97f, 17.78f)
                curveTo(12.677f, 17.487f, 12.677f, 17.013f, 12.97f, 16.72f)
                curveTo(13.263f, 16.427f, 13.737f, 16.427f, 14.03f, 16.72f)
                lineTo(16.5f, 19.189f)
                verticalLineTo(9.0f)
                curveTo(16.5f, 8.586f, 16.836f, 8.25f, 17.25f, 8.25f)
                close()
                moveTo(2.25f, 13.5f)
                curveTo(2.25f, 13.086f, 2.586f, 12.75f, 3.0f, 12.75f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 12.75f, 13.5f, 13.086f, 13.5f, 13.5f)
                curveTo(13.5f, 13.914f, 13.164f, 14.25f, 12.75f, 14.25f)
                horizontalLineTo(3.0f)
                curveTo(2.586f, 14.25f, 2.25f, 13.914f, 2.25f, 13.5f)
                close()
            }
        }
        .build()
        return _barsArrowDown!!
    }

private var _barsArrowDown: ImageVector? = null
