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

public val SolidGroup.DevicePhoneMobile: ImageVector
    get() {
        if (_devicePhoneMobile != null) {
            return _devicePhoneMobile!!
        }
        _devicePhoneMobile = Builder(name = "DevicePhoneMobile", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 18.75f)
                curveTo(10.086f, 18.75f, 9.75f, 19.086f, 9.75f, 19.5f)
                curveTo(9.75f, 19.914f, 10.086f, 20.25f, 10.5f, 20.25f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 20.25f, 14.25f, 19.914f, 14.25f, 19.5f)
                curveTo(14.25f, 19.086f, 13.914f, 18.75f, 13.5f, 18.75f)
                horizontalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.625f, 0.75f)
                curveTo(6.761f, 0.75f, 5.25f, 2.261f, 5.25f, 4.125f)
                verticalLineTo(19.875f)
                curveTo(5.25f, 21.739f, 6.761f, 23.25f, 8.625f, 23.25f)
                horizontalLineTo(15.375f)
                curveTo(17.239f, 23.25f, 18.75f, 21.739f, 18.75f, 19.875f)
                verticalLineTo(4.125f)
                curveTo(18.75f, 2.261f, 17.239f, 0.75f, 15.375f, 0.75f)
                horizontalLineTo(8.625f)
                close()
                moveTo(7.5f, 4.125f)
                curveTo(7.5f, 3.504f, 8.004f, 3.0f, 8.625f, 3.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(3.375f)
                curveTo(9.75f, 3.996f, 10.254f, 4.5f, 10.875f, 4.5f)
                horizontalLineTo(13.125f)
                curveTo(13.746f, 4.5f, 14.25f, 3.996f, 14.25f, 3.375f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.375f)
                curveTo(15.996f, 3.0f, 16.5f, 3.504f, 16.5f, 4.125f)
                verticalLineTo(19.875f)
                curveTo(16.5f, 20.496f, 15.996f, 21.0f, 15.375f, 21.0f)
                horizontalLineTo(8.625f)
                curveTo(8.004f, 21.0f, 7.5f, 20.496f, 7.5f, 19.875f)
                verticalLineTo(4.125f)
                close()
            }
        }
        .build()
        return _devicePhoneMobile!!
    }

private var _devicePhoneMobile: ImageVector? = null
