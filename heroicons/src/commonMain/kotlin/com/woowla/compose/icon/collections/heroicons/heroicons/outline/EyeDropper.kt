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

public val OutlineGroup.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.25f)
                lineTo(16.5f, 12.75f)
                lineTo(17.25f, 12.0f)
                verticalLineTo(8.758f)
                lineTo(19.526f, 8.148f)
                curveTo(20.019f, 8.017f, 20.485f, 7.758f, 20.871f, 7.371f)
                curveTo(22.043f, 6.2f, 22.043f, 4.3f, 20.871f, 3.129f)
                curveTo(19.7f, 1.957f, 17.8f, 1.957f, 16.629f, 3.129f)
                curveTo(16.242f, 3.515f, 15.983f, 3.981f, 15.852f, 4.473f)
                lineTo(15.242f, 6.75f)
                horizontalLineTo(12.0f)
                lineTo(11.25f, 7.5f)
                lineTo(12.75f, 9.0f)
                moveTo(15.0f, 11.25f)
                lineTo(6.53f, 19.72f)
                curveTo(6.191f, 20.059f, 5.73f, 20.25f, 5.25f, 20.25f)
                curveTo(4.77f, 20.25f, 4.309f, 20.441f, 3.97f, 20.78f)
                lineTo(3.0f, 21.75f)
                lineTo(2.25f, 21.0f)
                lineTo(3.22f, 20.03f)
                curveTo(3.559f, 19.691f, 3.75f, 19.23f, 3.75f, 18.75f)
                curveTo(3.75f, 18.27f, 3.941f, 17.809f, 4.28f, 17.47f)
                lineTo(12.75f, 9.0f)
                moveTo(15.0f, 11.25f)
                lineTo(12.75f, 9.0f)
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
