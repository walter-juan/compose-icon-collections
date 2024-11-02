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

public val OutlineGroup.WrenchScrewdriver: ImageVector
    get() {
        if (_wrenchScrewdriver != null) {
            return _wrenchScrewdriver!!
        }
        _wrenchScrewdriver = Builder(name = "WrenchScrewdriver", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.419f, 15.169f)
                lineTo(17.25f, 21.0f)
                curveTo(18.285f, 22.035f, 19.965f, 22.035f, 21.0f, 21.0f)
                curveTo(22.035f, 19.965f, 22.035f, 18.285f, 21.0f, 17.25f)
                lineTo(15.123f, 11.373f)
                moveTo(11.419f, 15.169f)
                lineTo(13.915f, 12.138f)
                curveTo(14.231f, 11.755f, 14.654f, 11.513f, 15.123f, 11.373f)
                moveTo(11.419f, 15.169f)
                lineTo(6.764f, 20.822f)
                curveTo(6.28f, 21.41f, 5.559f, 21.75f, 4.798f, 21.75f)
                curveTo(3.391f, 21.75f, 2.25f, 20.609f, 2.25f, 19.202f)
                curveTo(2.25f, 18.441f, 2.59f, 17.72f, 3.178f, 17.236f)
                lineTo(10.015f, 11.606f)
                moveTo(15.123f, 11.373f)
                curveTo(15.673f, 11.209f, 16.286f, 11.185f, 16.866f, 11.234f)
                curveTo(16.993f, 11.245f, 17.121f, 11.25f, 17.25f, 11.25f)
                curveTo(19.735f, 11.25f, 21.75f, 9.235f, 21.75f, 6.75f)
                curveTo(21.75f, 6.09f, 21.608f, 5.463f, 21.352f, 4.898f)
                lineTo(18.076f, 8.174f)
                curveTo(16.961f, 7.918f, 16.082f, 7.04f, 15.826f, 5.924f)
                lineTo(19.102f, 2.648f)
                curveTo(18.538f, 2.392f, 17.91f, 2.25f, 17.25f, 2.25f)
                curveTo(14.765f, 2.25f, 12.75f, 4.265f, 12.75f, 6.75f)
                curveTo(12.75f, 6.879f, 12.755f, 7.007f, 12.766f, 7.134f)
                curveTo(12.857f, 8.21f, 12.695f, 9.398f, 11.862f, 10.085f)
                lineTo(11.76f, 10.169f)
                moveTo(10.015f, 11.606f)
                lineTo(5.909f, 7.5f)
                horizontalLineTo(4.5f)
                lineTo(2.25f, 3.75f)
                lineTo(3.75f, 2.25f)
                lineTo(7.5f, 4.5f)
                verticalLineTo(5.909f)
                lineTo(11.76f, 10.169f)
                moveTo(10.015f, 11.606f)
                lineTo(11.76f, 10.169f)
                moveTo(18.375f, 18.375f)
                lineTo(15.75f, 15.75f)
                moveTo(4.867f, 19.125f)
                horizontalLineTo(4.875f)
                verticalLineTo(19.132f)
                horizontalLineTo(4.867f)
                verticalLineTo(19.125f)
                close()
            }
        }
        .build()
        return _wrenchScrewdriver!!
    }

private var _wrenchScrewdriver: ImageVector? = null
