package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val SolidGroup.Banknotes: ImageVector
    get() {
        if (_banknotes != null) {
            return _banknotes!!
        }
        _banknotes = Builder(name = "Banknotes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                curveTo(10.757f, 7.5f, 9.75f, 8.507f, 9.75f, 9.75f)
                curveTo(9.75f, 10.993f, 10.757f, 12.0f, 12.0f, 12.0f)
                curveTo(13.243f, 12.0f, 14.25f, 10.993f, 14.25f, 9.75f)
                curveTo(14.25f, 8.507f, 13.243f, 7.5f, 12.0f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 4.875f)
                curveTo(1.5f, 3.839f, 2.339f, 3.0f, 3.375f, 3.0f)
                horizontalLineTo(20.625f)
                curveTo(21.66f, 3.0f, 22.5f, 3.839f, 22.5f, 4.875f)
                verticalLineTo(14.625f)
                curveTo(22.5f, 15.66f, 21.66f, 16.5f, 20.625f, 16.5f)
                horizontalLineTo(3.375f)
                curveTo(2.339f, 16.5f, 1.5f, 15.66f, 1.5f, 14.625f)
                verticalLineTo(4.875f)
                close()
                moveTo(8.25f, 9.75f)
                curveTo(8.25f, 7.679f, 9.929f, 6.0f, 12.0f, 6.0f)
                curveTo(14.071f, 6.0f, 15.75f, 7.679f, 15.75f, 9.75f)
                curveTo(15.75f, 11.821f, 14.071f, 13.5f, 12.0f, 13.5f)
                curveTo(9.929f, 13.5f, 8.25f, 11.821f, 8.25f, 9.75f)
                close()
                moveTo(18.75f, 9.0f)
                curveTo(18.336f, 9.0f, 18.0f, 9.336f, 18.0f, 9.75f)
                verticalLineTo(9.757f)
                curveTo(18.0f, 10.172f, 18.336f, 10.507f, 18.75f, 10.507f)
                horizontalLineTo(18.757f)
                curveTo(19.172f, 10.507f, 19.507f, 10.172f, 19.507f, 9.757f)
                verticalLineTo(9.75f)
                curveTo(19.507f, 9.336f, 19.172f, 9.0f, 18.757f, 9.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(4.5f, 9.75f)
                curveTo(4.5f, 9.336f, 4.836f, 9.0f, 5.25f, 9.0f)
                horizontalLineTo(5.258f)
                curveTo(5.672f, 9.0f, 6.008f, 9.336f, 6.008f, 9.75f)
                verticalLineTo(9.757f)
                curveTo(6.008f, 10.172f, 5.672f, 10.507f, 5.258f, 10.507f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 10.507f, 4.5f, 10.172f, 4.5f, 9.757f)
                verticalLineTo(9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.25f, 18.0f)
                curveTo(1.836f, 18.0f, 1.5f, 18.336f, 1.5f, 18.75f)
                curveTo(1.5f, 19.164f, 1.836f, 19.5f, 2.25f, 19.5f)
                curveTo(7.65f, 19.5f, 12.88f, 20.222f, 17.85f, 21.575f)
                curveTo(19.04f, 21.899f, 20.25f, 21.017f, 20.25f, 19.755f)
                verticalLineTo(18.75f)
                curveTo(20.25f, 18.336f, 19.914f, 18.0f, 19.5f, 18.0f)
                horizontalLineTo(2.25f)
                close()
            }
        }
        .build()
        return _banknotes!!
    }

private var _banknotes: ImageVector? = null
