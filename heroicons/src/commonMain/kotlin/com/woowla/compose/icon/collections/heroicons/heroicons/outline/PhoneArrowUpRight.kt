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

public val OutlineGroup.PhoneArrowUpRight: ImageVector
    get() {
        if (_phoneArrowUpRight != null) {
            return _phoneArrowUpRight!!
        }
        _phoneArrowUpRight = Builder(name = "PhoneArrowUpRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 3.75f)
                verticalLineTo(8.25f)
                moveTo(20.25f, 3.75f)
                horizontalLineTo(15.75f)
                moveTo(20.25f, 3.75f)
                lineTo(14.25f, 9.75f)
                moveTo(17.25f, 21.75f)
                curveTo(8.966f, 21.75f, 2.25f, 15.034f, 2.25f, 6.75f)
                verticalLineTo(4.5f)
                curveTo(2.25f, 3.257f, 3.257f, 2.25f, 4.5f, 2.25f)
                horizontalLineTo(5.872f)
                curveTo(6.388f, 2.25f, 6.838f, 2.601f, 6.963f, 3.102f)
                lineTo(8.069f, 7.525f)
                curveTo(8.179f, 7.964f, 8.015f, 8.427f, 7.652f, 8.698f)
                lineTo(6.359f, 9.668f)
                curveTo(5.983f, 9.95f, 5.817f, 10.437f, 5.979f, 10.878f)
                curveTo(7.19f, 14.185f, 9.815f, 16.81f, 13.122f, 18.021f)
                curveTo(13.563f, 18.183f, 14.05f, 18.017f, 14.332f, 17.641f)
                lineTo(15.302f, 16.348f)
                curveTo(15.573f, 15.986f, 16.035f, 15.821f, 16.475f, 15.931f)
                lineTo(20.898f, 17.037f)
                curveTo(21.399f, 17.162f, 21.75f, 17.612f, 21.75f, 18.128f)
                verticalLineTo(19.5f)
                curveTo(21.75f, 20.743f, 20.743f, 21.75f, 19.5f, 21.75f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _phoneArrowUpRight!!
    }

private var _phoneArrowUpRight: ImageVector? = null
