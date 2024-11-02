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

public val SolidGroup.HomeModern: ImageVector
    get() {
        if (_homeModern != null) {
            return _homeModern!!
        }
        _homeModern = Builder(name = "HomeModern", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.006f, 3.705f)
                curveTo(19.395f, 3.563f, 19.596f, 3.133f, 19.455f, 2.744f)
                curveTo(19.313f, 2.354f, 18.883f, 2.154f, 18.493f, 2.295f)
                lineTo(6.0f, 6.838f)
                verticalLineTo(3.0f)
                curveTo(6.0f, 2.586f, 5.664f, 2.25f, 5.25f, 2.25f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 2.25f, 3.0f, 2.586f, 3.0f, 3.0f)
                verticalLineTo(7.929f)
                lineTo(1.994f, 8.295f)
                curveTo(1.604f, 8.437f, 1.403f, 8.867f, 1.545f, 9.256f)
                curveTo(1.687f, 9.646f, 2.117f, 9.846f, 2.506f, 9.705f)
                lineTo(19.006f, 3.705f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.019f, 11.115f)
                lineTo(18.0f, 5.667f)
                verticalLineTo(9.088f)
                lineTo(22.006f, 10.545f)
                curveTo(22.395f, 10.687f, 22.596f, 11.117f, 22.455f, 11.506f)
                curveTo(22.313f, 11.896f, 21.883f, 12.096f, 21.493f, 11.955f)
                lineTo(21.0f, 11.775f)
                verticalLineTo(20.25f)
                horizontalLineTo(21.75f)
                curveTo(22.164f, 20.25f, 22.5f, 20.586f, 22.5f, 21.0f)
                curveTo(22.5f, 21.414f, 22.164f, 21.75f, 21.75f, 21.75f)
                horizontalLineTo(2.25f)
                curveTo(1.836f, 21.75f, 1.5f, 21.414f, 1.5f, 21.0f)
                curveTo(1.5f, 20.586f, 1.836f, 20.25f, 2.25f, 20.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.121f)
                lineTo(3.019f, 11.115f)
                close()
                moveTo(18.0f, 20.25f)
                verticalLineTo(10.684f)
                lineTo(19.5f, 11.23f)
                verticalLineTo(20.25f)
                horizontalLineTo(18.0f)
                close()
                moveTo(9.0f, 14.25f)
                curveTo(8.586f, 14.25f, 8.25f, 14.586f, 8.25f, 15.0f)
                verticalLineTo(19.5f)
                curveTo(8.25f, 19.914f, 8.586f, 20.25f, 9.0f, 20.25f)
                horizontalLineTo(12.0f)
                curveTo(12.414f, 20.25f, 12.75f, 19.914f, 12.75f, 19.5f)
                verticalLineTo(15.0f)
                curveTo(12.75f, 14.586f, 12.414f, 14.25f, 12.0f, 14.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _homeModern!!
    }

private var _homeModern: ImageVector? = null
