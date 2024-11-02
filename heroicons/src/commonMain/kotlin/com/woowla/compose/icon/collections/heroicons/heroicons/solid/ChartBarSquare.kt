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

public val SolidGroup.ChartBarSquare: ImageVector
    get() {
        if (_chartBarSquare != null) {
            return _chartBarSquare!!
        }
        _chartBarSquare = Builder(name = "ChartBarSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.5f, 13.5f)
                curveTo(7.914f, 13.5f, 8.25f, 13.836f, 8.25f, 14.25f)
                verticalLineTo(16.5f)
                curveTo(8.25f, 16.914f, 7.914f, 17.25f, 7.5f, 17.25f)
                curveTo(7.086f, 17.25f, 6.75f, 16.914f, 6.75f, 16.5f)
                verticalLineTo(14.25f)
                curveTo(6.75f, 13.836f, 7.086f, 13.5f, 7.5f, 13.5f)
                close()
                moveTo(11.25f, 12.0f)
                curveTo(11.25f, 11.586f, 10.914f, 11.25f, 10.5f, 11.25f)
                curveTo(10.086f, 11.25f, 9.75f, 11.586f, 9.75f, 12.0f)
                verticalLineTo(16.5f)
                curveTo(9.75f, 16.914f, 10.086f, 17.25f, 10.5f, 17.25f)
                curveTo(10.914f, 17.25f, 11.25f, 16.914f, 11.25f, 16.5f)
                verticalLineTo(12.0f)
                close()
                moveTo(13.5f, 9.0f)
                curveTo(13.914f, 9.0f, 14.25f, 9.336f, 14.25f, 9.75f)
                verticalLineTo(16.5f)
                curveTo(14.25f, 16.914f, 13.914f, 17.25f, 13.5f, 17.25f)
                curveTo(13.086f, 17.25f, 12.75f, 16.914f, 12.75f, 16.5f)
                verticalLineTo(9.75f)
                curveTo(12.75f, 9.336f, 13.086f, 9.0f, 13.5f, 9.0f)
                close()
                moveTo(17.25f, 7.5f)
                curveTo(17.25f, 7.086f, 16.914f, 6.75f, 16.5f, 6.75f)
                curveTo(16.086f, 6.75f, 15.75f, 7.086f, 15.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(15.75f, 16.914f, 16.086f, 17.25f, 16.5f, 17.25f)
                curveTo(16.914f, 17.25f, 17.25f, 16.914f, 17.25f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _chartBarSquare!!
    }

private var _chartBarSquare: ImageVector? = null
