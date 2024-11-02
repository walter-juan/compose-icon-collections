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

public val OutlineGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.75f, 6.75f)
                curveTo(21.75f, 9.235f, 19.735f, 11.25f, 17.25f, 11.25f)
                curveTo(17.121f, 11.25f, 16.993f, 11.245f, 16.866f, 11.234f)
                curveTo(15.79f, 11.143f, 14.602f, 11.305f, 13.915f, 12.138f)
                lineTo(6.764f, 20.822f)
                curveTo(6.28f, 21.41f, 5.559f, 21.75f, 4.798f, 21.75f)
                curveTo(3.391f, 21.75f, 2.25f, 20.609f, 2.25f, 19.202f)
                curveTo(2.25f, 18.441f, 2.59f, 17.72f, 3.178f, 17.236f)
                lineTo(11.862f, 10.085f)
                curveTo(12.695f, 9.398f, 12.857f, 8.21f, 12.766f, 7.134f)
                curveTo(12.755f, 7.007f, 12.75f, 6.879f, 12.75f, 6.75f)
                curveTo(12.75f, 4.265f, 14.765f, 2.25f, 17.25f, 2.25f)
                curveTo(17.91f, 2.25f, 18.538f, 2.392f, 19.102f, 2.648f)
                lineTo(15.826f, 5.924f)
                curveTo(16.082f, 7.04f, 16.961f, 7.918f, 18.076f, 8.174f)
                lineTo(21.352f, 4.898f)
                curveTo(21.608f, 5.463f, 21.75f, 6.09f, 21.75f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.867f, 19.125f)
                horizontalLineTo(4.875f)
                verticalLineTo(19.132f)
                horizontalLineTo(4.867f)
                verticalLineTo(19.125f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
