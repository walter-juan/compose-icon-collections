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

public val SolidGroup.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) {
            return _deviceTablet!!
        }
        _deviceTablet = Builder(name = "DeviceTablet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 18.0f)
                curveTo(10.086f, 18.0f, 9.75f, 18.336f, 9.75f, 18.75f)
                curveTo(9.75f, 19.164f, 10.086f, 19.5f, 10.5f, 19.5f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 19.5f, 14.25f, 19.164f, 14.25f, 18.75f)
                curveTo(14.25f, 18.336f, 13.914f, 18.0f, 13.5f, 18.0f)
                horizontalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.125f, 1.5f)
                curveTo(5.261f, 1.5f, 3.75f, 3.011f, 3.75f, 4.875f)
                verticalLineTo(19.125f)
                curveTo(3.75f, 20.989f, 5.261f, 22.5f, 7.125f, 22.5f)
                horizontalLineTo(16.875f)
                curveTo(18.739f, 22.5f, 20.25f, 20.989f, 20.25f, 19.125f)
                verticalLineTo(4.875f)
                curveTo(20.25f, 3.011f, 18.739f, 1.5f, 16.875f, 1.5f)
                horizontalLineTo(7.125f)
                close()
                moveTo(6.0f, 4.875f)
                curveTo(6.0f, 4.254f, 6.504f, 3.75f, 7.125f, 3.75f)
                horizontalLineTo(16.875f)
                curveTo(17.496f, 3.75f, 18.0f, 4.254f, 18.0f, 4.875f)
                verticalLineTo(19.125f)
                curveTo(18.0f, 19.746f, 17.496f, 20.25f, 16.875f, 20.25f)
                horizontalLineTo(7.125f)
                curveTo(6.504f, 20.25f, 6.0f, 19.746f, 6.0f, 19.125f)
                verticalLineTo(4.875f)
                close()
            }
        }
        .build()
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
