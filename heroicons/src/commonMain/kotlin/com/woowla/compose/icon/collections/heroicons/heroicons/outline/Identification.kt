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

public val OutlineGroup.Identification: ImageVector
    get() {
        if (_identification != null) {
            return _identification!!
        }
        _identification = Builder(name = "Identification", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                horizontalLineTo(18.75f)
                moveTo(15.0f, 12.0f)
                horizontalLineTo(18.75f)
                moveTo(15.0f, 15.0f)
                horizontalLineTo(18.75f)
                moveTo(4.5f, 19.5f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 19.5f, 21.75f, 18.493f, 21.75f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(21.75f, 5.507f, 20.743f, 4.5f, 19.5f, 4.5f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 4.5f, 2.25f, 5.507f, 2.25f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2.25f, 18.493f, 3.257f, 19.5f, 4.5f, 19.5f)
                close()
                moveTo(10.5f, 9.375f)
                curveTo(10.5f, 10.41f, 9.661f, 11.25f, 8.625f, 11.25f)
                curveTo(7.589f, 11.25f, 6.75f, 10.41f, 6.75f, 9.375f)
                curveTo(6.75f, 8.339f, 7.589f, 7.5f, 8.625f, 7.5f)
                curveTo(9.661f, 7.5f, 10.5f, 8.339f, 10.5f, 9.375f)
                close()
                moveTo(11.794f, 15.711f)
                curveTo(10.849f, 16.215f, 9.77f, 16.5f, 8.625f, 16.5f)
                curveTo(7.479f, 16.5f, 6.401f, 16.215f, 5.456f, 15.711f)
                curveTo(5.93f, 14.421f, 7.17f, 13.5f, 8.625f, 13.5f)
                curveTo(10.08f, 13.5f, 11.32f, 14.421f, 11.794f, 15.711f)
                close()
            }
        }
        .build()
        return _identification!!
    }

private var _identification: ImageVector? = null
