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

public val OutlineGroup.BellSnooze: ImageVector
    get() {
        if (_bellSnooze != null) {
            return _bellSnooze!!
        }
        _bellSnooze = Builder(name = "BellSnooze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.857f, 17.082f)
                curveTo(16.751f, 16.857f, 18.578f, 16.412f, 20.311f, 15.772f)
                curveTo(18.874f, 14.177f, 18.0f, 12.066f, 18.0f, 9.75f)
                verticalLineTo(9.049f)
                curveTo(18.0f, 9.033f, 18.0f, 9.016f, 18.0f, 9.0f)
                curveTo(18.0f, 5.686f, 15.314f, 3.0f, 12.0f, 3.0f)
                curveTo(8.686f, 3.0f, 6.0f, 5.686f, 6.0f, 9.0f)
                lineTo(6.0f, 9.75f)
                curveTo(6.0f, 12.066f, 5.125f, 14.177f, 3.688f, 15.772f)
                curveTo(5.421f, 16.412f, 7.248f, 16.857f, 9.143f, 17.082f)
                moveTo(14.857f, 17.082f)
                curveTo(13.92f, 17.193f, 12.967f, 17.25f, 12.0f, 17.25f)
                curveTo(11.033f, 17.25f, 10.08f, 17.193f, 9.143f, 17.082f)
                moveTo(14.857f, 17.082f)
                curveTo(14.95f, 17.371f, 15.0f, 17.68f, 15.0f, 18.0f)
                curveTo(15.0f, 19.657f, 13.657f, 21.0f, 12.0f, 21.0f)
                curveTo(10.343f, 21.0f, 9.0f, 19.657f, 9.0f, 18.0f)
                curveTo(9.0f, 17.68f, 9.05f, 17.371f, 9.143f, 17.082f)
                moveTo(10.5f, 8.25f)
                horizontalLineTo(13.5f)
                lineTo(10.5f, 12.75f)
                horizontalLineTo(13.5f)
            }
        }
        .build()
        return _bellSnooze!!
    }

private var _bellSnooze: ImageVector? = null
