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

public val OutlineGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(15.314f, 18.75f, 18.0f, 16.064f, 18.0f, 12.75f)
                verticalLineTo(11.25f)
                moveTo(12.0f, 18.75f)
                curveTo(8.686f, 18.75f, 6.0f, 16.064f, 6.0f, 12.75f)
                verticalLineTo(11.25f)
                moveTo(12.0f, 18.75f)
                verticalLineTo(22.5f)
                moveTo(8.25f, 22.5f)
                horizontalLineTo(15.75f)
                moveTo(12.0f, 15.75f)
                curveTo(10.343f, 15.75f, 9.0f, 14.407f, 9.0f, 12.75f)
                verticalLineTo(4.5f)
                curveTo(9.0f, 2.843f, 10.343f, 1.5f, 12.0f, 1.5f)
                curveTo(13.657f, 1.5f, 15.0f, 2.843f, 15.0f, 4.5f)
                verticalLineTo(12.75f)
                curveTo(15.0f, 14.407f, 13.657f, 15.75f, 12.0f, 15.75f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
