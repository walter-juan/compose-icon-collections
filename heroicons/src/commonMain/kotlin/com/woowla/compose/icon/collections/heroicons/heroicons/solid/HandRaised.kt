package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.HandRaised: ImageVector
    get() {
        if (_handRaised != null) {
            return _handRaised!!
        }
        _handRaised = Builder(name = "HandRaised", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 1.875f)
                curveTo(10.5f, 1.254f, 11.004f, 0.75f, 11.625f, 0.75f)
                curveTo(12.246f, 0.75f, 12.75f, 1.254f, 12.75f, 1.875f)
                verticalLineTo(10.094f)
                curveTo(13.267f, 10.256f, 13.771f, 10.476f, 14.25f, 10.753f)
                verticalLineTo(3.375f)
                curveTo(14.25f, 2.754f, 14.754f, 2.25f, 15.375f, 2.25f)
                curveTo(15.996f, 2.25f, 16.5f, 2.754f, 16.5f, 3.375f)
                verticalLineTo(14.312f)
                curveTo(15.082f, 14.55f, 13.889f, 15.451f, 13.251f, 16.685f)
                curveTo(14.455f, 16.087f, 15.813f, 15.75f, 17.25f, 15.75f)
                curveTo(17.664f, 15.75f, 18.0f, 15.414f, 18.0f, 15.0f)
                verticalLineTo(12.75f)
                lineTo(18.0f, 12.734f)
                curveTo(18.004f, 11.877f, 18.334f, 11.018f, 18.989f, 10.363f)
                curveTo(19.428f, 9.924f, 20.14f, 9.924f, 20.58f, 10.363f)
                curveTo(21.019f, 10.803f, 21.019f, 11.515f, 20.58f, 11.955f)
                curveTo(20.361f, 12.173f, 20.251f, 12.457f, 20.25f, 12.745f)
                lineTo(20.25f, 12.75f)
                lineTo(20.25f, 15.75f)
                horizontalLineTo(20.245f)
                curveTo(20.186f, 17.256f, 19.562f, 18.688f, 18.493f, 19.757f)
                lineTo(16.757f, 21.493f)
                curveTo(15.632f, 22.618f, 14.106f, 23.25f, 12.515f, 23.25f)
                horizontalLineTo(10.5f)
                curveTo(6.358f, 23.25f, 3.0f, 19.892f, 3.0f, 15.75f)
                verticalLineTo(6.375f)
                curveTo(3.0f, 5.754f, 3.504f, 5.25f, 4.125f, 5.25f)
                curveTo(4.746f, 5.25f, 5.25f, 5.754f, 5.25f, 6.375f)
                verticalLineTo(11.894f)
                curveTo(5.711f, 11.442f, 6.215f, 11.062f, 6.75f, 10.753f)
                verticalLineTo(3.375f)
                curveTo(6.75f, 2.754f, 7.254f, 2.25f, 7.875f, 2.25f)
                curveTo(8.496f, 2.25f, 9.0f, 2.754f, 9.0f, 3.375f)
                verticalLineTo(9.901f)
                curveTo(9.495f, 9.8f, 9.997f, 9.75f, 10.5f, 9.75f)
                verticalLineTo(1.875f)
                close()
            }
        }
        .build()
        return _handRaised!!
    }

private var _handRaised: ImageVector? = null
