package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = Builder(name = "Newspaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.125f, 3.0f)
                curveTo(3.089f, 3.0f, 2.25f, 3.839f, 2.25f, 4.875f)
                verticalLineTo(18.0f)
                curveTo(2.25f, 19.657f, 3.593f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(20.25f)
                curveTo(18.593f, 21.0f, 17.25f, 19.657f, 17.25f, 18.0f)
                verticalLineTo(4.875f)
                curveTo(17.25f, 3.839f, 16.41f, 3.0f, 15.375f, 3.0f)
                horizontalLineTo(4.125f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(11.586f, 9.75f, 11.25f, 10.086f, 11.25f, 10.5f)
                curveTo(11.25f, 10.914f, 11.586f, 11.25f, 12.0f, 11.25f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 11.25f, 14.25f, 10.914f, 14.25f, 10.5f)
                curveTo(14.25f, 10.086f, 13.914f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(12.0f)
                close()
                moveTo(11.25f, 7.5f)
                curveTo(11.25f, 7.086f, 11.586f, 6.75f, 12.0f, 6.75f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 6.75f, 14.25f, 7.086f, 14.25f, 7.5f)
                curveTo(14.25f, 7.914f, 13.914f, 8.25f, 13.5f, 8.25f)
                horizontalLineTo(12.0f)
                curveTo(11.586f, 8.25f, 11.25f, 7.914f, 11.25f, 7.5f)
                close()
                moveTo(6.0f, 12.75f)
                curveTo(5.586f, 12.75f, 5.25f, 13.086f, 5.25f, 13.5f)
                curveTo(5.25f, 13.914f, 5.586f, 14.25f, 6.0f, 14.25f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 14.25f, 14.25f, 13.914f, 14.25f, 13.5f)
                curveTo(14.25f, 13.086f, 13.914f, 12.75f, 13.5f, 12.75f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.25f, 16.5f)
                curveTo(5.25f, 16.086f, 5.586f, 15.75f, 6.0f, 15.75f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 15.75f, 14.25f, 16.086f, 14.25f, 16.5f)
                curveTo(14.25f, 16.914f, 13.914f, 17.25f, 13.5f, 17.25f)
                horizontalLineTo(6.0f)
                curveTo(5.586f, 17.25f, 5.25f, 16.914f, 5.25f, 16.5f)
                close()
                moveTo(6.0f, 6.75f)
                curveTo(5.586f, 6.75f, 5.25f, 7.086f, 5.25f, 7.5f)
                verticalLineTo(10.5f)
                curveTo(5.25f, 10.914f, 5.586f, 11.25f, 6.0f, 11.25f)
                horizontalLineTo(9.0f)
                curveTo(9.414f, 11.25f, 9.75f, 10.914f, 9.75f, 10.5f)
                verticalLineTo(7.5f)
                curveTo(9.75f, 7.086f, 9.414f, 6.75f, 9.0f, 6.75f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 6.75f)
                horizontalLineTo(20.625f)
                curveTo(21.246f, 6.75f, 21.75f, 7.254f, 21.75f, 7.875f)
                verticalLineTo(18.0f)
                curveTo(21.75f, 18.828f, 21.078f, 19.5f, 20.25f, 19.5f)
                curveTo(19.422f, 19.5f, 18.75f, 18.828f, 18.75f, 18.0f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
