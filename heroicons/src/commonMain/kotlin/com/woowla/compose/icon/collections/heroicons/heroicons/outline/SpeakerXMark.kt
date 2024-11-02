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

public val OutlineGroup.SpeakerXMark: ImageVector
    get() {
        if (_speakerXMark != null) {
            return _speakerXMark!!
        }
        _speakerXMark = Builder(name = "SpeakerXMark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.25f, 9.75f)
                lineTo(19.5f, 12.0f)
                moveTo(19.5f, 12.0f)
                lineTo(21.75f, 14.25f)
                moveTo(19.5f, 12.0f)
                lineTo(21.75f, 9.75f)
                moveTo(19.5f, 12.0f)
                lineTo(17.25f, 14.25f)
                moveTo(6.75f, 8.25f)
                lineTo(11.47f, 3.53f)
                curveTo(11.942f, 3.058f, 12.75f, 3.392f, 12.75f, 4.061f)
                verticalLineTo(19.939f)
                curveTo(12.75f, 20.608f, 11.942f, 20.942f, 11.47f, 20.47f)
                lineTo(6.75f, 15.75f)
                horizontalLineTo(4.509f)
                curveTo(3.63f, 15.75f, 2.806f, 15.243f, 2.572f, 14.396f)
                curveTo(2.362f, 13.633f, 2.25f, 12.83f, 2.25f, 12.0f)
                curveTo(2.25f, 11.17f, 2.362f, 10.367f, 2.572f, 9.604f)
                curveTo(2.806f, 8.756f, 3.63f, 8.25f, 4.509f, 8.25f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _speakerXMark!!
    }

private var _speakerXMark: ImageVector? = null
