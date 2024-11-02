package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.689f)
                curveTo(3.0f, 7.825f, 3.933f, 7.283f, 4.683f, 7.712f)
                lineTo(11.791f, 11.773f)
                curveTo(12.546f, 12.205f, 12.546f, 13.295f, 11.791f, 13.727f)
                lineTo(4.683f, 17.788f)
                curveTo(3.933f, 18.217f, 3.0f, 17.675f, 3.0f, 16.812f)
                verticalLineTo(8.689f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 8.689f)
                curveTo(12.75f, 7.825f, 13.683f, 7.283f, 14.433f, 7.712f)
                lineTo(21.541f, 11.773f)
                curveTo(22.296f, 12.205f, 22.296f, 13.295f, 21.541f, 13.727f)
                lineTo(14.433f, 17.788f)
                curveTo(13.683f, 18.217f, 12.75f, 17.675f, 12.75f, 16.812f)
                verticalLineTo(8.689f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
