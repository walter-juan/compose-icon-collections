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

public val OutlineGroup.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) {
            return _deviceTablet!!
        }
        _deviceTablet = Builder(name = "DeviceTablet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 19.5f)
                horizontalLineTo(13.5f)
                moveTo(6.75f, 21.75f)
                horizontalLineTo(17.25f)
                curveTo(18.493f, 21.75f, 19.5f, 20.743f, 19.5f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(19.5f, 3.257f, 18.493f, 2.25f, 17.25f, 2.25f)
                horizontalLineTo(6.75f)
                curveTo(5.507f, 2.25f, 4.5f, 3.257f, 4.5f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4.5f, 20.743f, 5.507f, 21.75f, 6.75f, 21.75f)
                close()
            }
        }
        .build()
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
