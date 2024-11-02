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

public val SolidGroup.ArrowsPointingIn: ImageVector
    get() {
        if (_arrowsPointingIn != null) {
            return _arrowsPointingIn!!
        }
        _arrowsPointingIn = Builder(name = "ArrowsPointingIn", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.22f, 3.22f)
                curveTo(3.513f, 2.927f, 3.987f, 2.927f, 4.28f, 3.22f)
                lineTo(8.25f, 7.189f)
                lineTo(8.25f, 4.5f)
                curveTo(8.25f, 4.086f, 8.586f, 3.75f, 9.0f, 3.75f)
                curveTo(9.414f, 3.75f, 9.75f, 4.086f, 9.75f, 4.5f)
                lineTo(9.75f, 9.0f)
                curveTo(9.75f, 9.414f, 9.414f, 9.75f, 9.0f, 9.75f)
                horizontalLineTo(4.5f)
                curveTo(4.086f, 9.75f, 3.75f, 9.414f, 3.75f, 9.0f)
                curveTo(3.75f, 8.586f, 4.086f, 8.25f, 4.5f, 8.25f)
                lineTo(7.189f, 8.25f)
                lineTo(3.22f, 4.28f)
                curveTo(2.927f, 3.987f, 2.927f, 3.513f, 3.22f, 3.22f)
                close()
                moveTo(20.78f, 3.22f)
                curveTo(21.073f, 3.513f, 21.073f, 3.987f, 20.78f, 4.28f)
                lineTo(16.811f, 8.25f)
                horizontalLineTo(19.5f)
                curveTo(19.914f, 8.25f, 20.25f, 8.586f, 20.25f, 9.0f)
                curveTo(20.25f, 9.414f, 19.914f, 9.75f, 19.5f, 9.75f)
                horizontalLineTo(15.0f)
                curveTo(14.586f, 9.75f, 14.25f, 9.414f, 14.25f, 9.0f)
                verticalLineTo(4.5f)
                curveTo(14.25f, 4.086f, 14.586f, 3.75f, 15.0f, 3.75f)
                curveTo(15.414f, 3.75f, 15.75f, 4.086f, 15.75f, 4.5f)
                verticalLineTo(7.189f)
                lineTo(19.72f, 3.22f)
                curveTo(20.013f, 2.927f, 20.487f, 2.927f, 20.78f, 3.22f)
                close()
                moveTo(3.75f, 15.0f)
                curveTo(3.75f, 14.586f, 4.086f, 14.25f, 4.5f, 14.25f)
                lineTo(9.0f, 14.25f)
                curveTo(9.414f, 14.25f, 9.75f, 14.586f, 9.75f, 15.0f)
                verticalLineTo(19.5f)
                curveTo(9.75f, 19.914f, 9.414f, 20.25f, 9.0f, 20.25f)
                curveTo(8.586f, 20.25f, 8.25f, 19.914f, 8.25f, 19.5f)
                lineTo(8.25f, 16.811f)
                lineTo(4.28f, 20.78f)
                curveTo(3.987f, 21.073f, 3.513f, 21.073f, 3.22f, 20.78f)
                curveTo(2.927f, 20.487f, 2.927f, 20.013f, 3.22f, 19.72f)
                lineTo(7.189f, 15.75f)
                horizontalLineTo(4.5f)
                curveTo(4.086f, 15.75f, 3.75f, 15.414f, 3.75f, 15.0f)
                close()
                moveTo(14.25f, 15.0f)
                curveTo(14.25f, 14.586f, 14.586f, 14.25f, 15.0f, 14.25f)
                horizontalLineTo(19.5f)
                curveTo(19.914f, 14.25f, 20.25f, 14.586f, 20.25f, 15.0f)
                curveTo(20.25f, 15.414f, 19.914f, 15.75f, 19.5f, 15.75f)
                horizontalLineTo(16.811f)
                lineTo(20.78f, 19.72f)
                curveTo(21.073f, 20.013f, 21.073f, 20.487f, 20.78f, 20.78f)
                curveTo(20.487f, 21.073f, 20.013f, 21.073f, 19.72f, 20.78f)
                lineTo(15.75f, 16.811f)
                verticalLineTo(19.5f)
                curveTo(15.75f, 19.914f, 15.414f, 20.25f, 15.0f, 20.25f)
                curveTo(14.586f, 20.25f, 14.25f, 19.914f, 14.25f, 19.5f)
                lineTo(14.25f, 15.0f)
                close()
            }
        }
        .build()
        return _arrowsPointingIn!!
    }

private var _arrowsPointingIn: ImageVector? = null
