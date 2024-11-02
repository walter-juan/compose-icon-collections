package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.DevicePhoneMobile: ImageVector
    get() {
        if (_devicePhoneMobile != null) {
            return _devicePhoneMobile!!
        }
        _devicePhoneMobile = Builder(name = "DevicePhoneMobile", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 1.5f)
                horizontalLineTo(8.25f)
                curveTo(7.007f, 1.5f, 6.0f, 2.507f, 6.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(6.0f, 21.493f, 7.007f, 22.5f, 8.25f, 22.5f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 22.5f, 18.0f, 21.493f, 18.0f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(18.0f, 2.507f, 16.993f, 1.5f, 15.75f, 1.5f)
                horizontalLineTo(13.5f)
                moveTo(10.5f, 1.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(1.5f)
                moveTo(10.5f, 1.5f)
                horizontalLineTo(13.5f)
                moveTo(10.5f, 20.25f)
                horizontalLineTo(13.5f)
            }
        }
        .build()
        return _devicePhoneMobile!!
    }

private var _devicePhoneMobile: ImageVector? = null
